package shop.mtcoding.buyer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import shop.mtcoding.buyer.model.Product;
import shop.mtcoding.buyer.model.ProductRepository;

@Controller
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/")
    public String product(Model model) {
        List<Product> productList = productRepository.findAll();
        model.addAttribute("productList", productList);

        return "product/product-list";
    }
}
