package shop.mtcoding.buyer.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import shop.mtcoding.buyer.model.Product;
import shop.mtcoding.buyer.model.ProductRepository;

@Controller
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    HttpSession session;

    @GetMapping({ "/", "/product" })
    public String getProductList(Model model) {
        List<Product> productList = productRepository.findAll();
        model.addAttribute("productList", productList);

        return "product/list";
    }

    @GetMapping("/product/{id}")
    public String getProductDetail(@PathVariable("id") int id, Model model) {
        Product product = productRepository.findById(id);
        model.addAttribute("product", product);
        return "product/detail";
    }

    @PostMapping("/product/{id}/buy")
    public String buyProduct(@PathVariable("id") int id, int buyCount) {
        if (session.getAttribute("principal") == null) {
            return "redirect:/login-form";
        } else {
            int result = productRepository.updateQty(id, buyCount);
            if (result == 1) {
                return "redirect:/product/{id}";
            } else {
                return "redirect:/";
            }
        }
    }
}
