package com.aprilc.productcategories.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aprilc.productcategories.models.Category;
import com.aprilc.productcategories.models.Product;
import com.aprilc.productcategories.models.categories_products;
import com.aprilc.productcategories.services.CategoryService;
import com.aprilc.productcategories.services.JoinService;
import com.aprilc.productcategories.services.ProductService;

@Controller
public class HomeController {
	private final CategoryService cService;
	private final ProductService pService;
	private final JoinService jService;
	public HomeController(CategoryService catService, ProductService prodService, JoinService joinService) {
		this.cService = catService;
		this.pService = prodService;
		this.jService = joinService;
	}
	
	@RequestMapping("/")
	public String home() {
        return "redirect:categories/new";
    }
	@RequestMapping("/products/new")
	public String newProduct(Model model, @ModelAttribute("product") Product product) {
		return "product";
    }
	@PostMapping("/products/new")
	public String createProd(Model model, @ModelAttribute("product") Product product) {
        pService.addProduct(product);
		return "redirect:/products/new";
    }
	
	@RequestMapping("/categories/new")
	public String newCategory(Model model, @ModelAttribute("category") Category category) {
        return "category";
    }
	@PostMapping("/categories/new")
	public String createCat(Model model, @ModelAttribute("category") Category category) {
        cService.addCat(category);
		return "redirect:/categories/new";
    }
	
	@RequestMapping("/categories/{id}")
	public String showCategory(Model model, @PathVariable("id") Long id, @ModelAttribute("catProd") categories_products catProd) {
		List<Product> productList = pService.allProducts();
		Category thisCategory = cService.getCatById(id);
		model.addAttribute(thisCategory);
		model.addAttribute(productList);
		return "showcat";
    }
	
	@PostMapping("/categories/addProduct")
	public String addProduct(Model model, @ModelAttribute("catProd") categories_products catProd) {
        jService.addCategory(catProd);
        String catId = Long.toString(catProd.getCategory().getId());
		return "redirect:/categories/".concat(catId);
    }
	
	@RequestMapping("/products/{id}")
	public String showProduct(Model model, @PathVariable("id") Long id, @ModelAttribute("catProd") categories_products catProd) {
		List<Category> categoryList = cService.allCats();
		Product thisProduct = pService.getProdById(id);
		model.addAttribute(thisProduct);
		model.addAttribute(categoryList);
		return "showprod";
    }
	
	@PostMapping("/products/addCategory")
	public String addCategory(Model model, @ModelAttribute("catProd") categories_products catProd) {
        jService.addCategory(catProd);
        String prodId = Long.toString(catProd.getProduct().getId());
		return "redirect:/products/".concat(prodId);
    }

}
