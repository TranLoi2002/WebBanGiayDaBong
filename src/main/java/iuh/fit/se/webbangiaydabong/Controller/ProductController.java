package iuh.fit.se.webbangiaydabong.Controller;

import iuh.fit.se.webbangiaydabong.Entity.Product;
import iuh.fit.se.webbangiaydabong.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService; // Giả sử bạn đã tạo một repository cho Product

    @GetMapping("/products")
    public String listProducts(Model model) {
        List<Product> products = productService.findAll(); // Lấy danh sách sản phẩm từ cơ sở dữ liệu
        model.addAttribute("products", products);
        return "product/list"; // Tên mẫu
    }
}
