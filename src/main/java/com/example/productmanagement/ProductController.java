package com.example.productmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @PostMapping
    public String addProduct(@RequestBody Product product){
        productService.addProduct(product);
        return "success";
    }

    @PutMapping("/{id}")
    public String updateProduct(@PathVariable int id, @RequestBody Product product) {
        if (productService.updateProduct(id, product)) {
            return "Cập nhật sản phẩm thành công";
        }
        return "Không tìm thấy sản phẩm";
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id) {

        if (productService.deleteProduct(id)) {
            return "Xóa sản phẩm thành công";
        }

        return "Không tìm thấy sản phẩm";
    }

}
