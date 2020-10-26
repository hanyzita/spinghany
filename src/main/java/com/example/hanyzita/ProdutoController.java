package com.example.hanyzita;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class ProdutoController {
   
    @GetMapping("/produtos")
    public String name() {
        return "Teste";
        
    }

    @PostMapping("/produtos")
    public String nm_post() {
        return "Teste_post";
    }
}