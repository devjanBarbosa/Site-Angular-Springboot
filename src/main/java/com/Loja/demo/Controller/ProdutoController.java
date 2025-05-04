package com.Loja.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Loja.demo.Model.Produto;
import com.Loja.demo.Services.ProdutoServico;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {

  @Autowired
  ProdutoServico servico;

@GetMapping
  public ResponseEntity<List<Produto>> findAll(){
    List<Produto> list = servico.findAll(); 
    return ResponseEntity.ok().body(list);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Produto> findById(@PathVariable Long id){
    Produto obj = servico.findById(id);
    return ResponseEntity.ok().body(obj);
  }

  @PostMapping()
  public ResponseEntity<Produto> insert(@RequestBody Produto obj){
    obj = servico.insert(obj);
    return ResponseEntity.ok().body(obj);
  }
}
