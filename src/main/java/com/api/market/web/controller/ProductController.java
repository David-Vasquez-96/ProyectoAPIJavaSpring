package com.api.market.web.controller;

import com.api.market.domain.Product;
import com.api.market.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Productos")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public List<Product> getAll(){
        return productService.getAll();
    }

    @GetMapping("/{idProducto}")
    public Optional<Product> getProduct(@PathVariable("idProducto") int productId){
        return productService.getProduct(productId);
    }

    @GetMapping("/Categoria/{idCategoria}")
    public Optional<List<Product>> getByCategory(@PathVariable("idCategoria") int categoryId){
        return productService.getByCategory(categoryId);
    }

    @PostMapping("/guardarProducto")
    public Product save(@RequestBody Product product){
        return productService.save(product);
    }

    @DeleteMapping("/idProducto")
    public boolean delete(@PathVariable("idProducto") int productId){
        return productService.delete(productId);
    }

}
