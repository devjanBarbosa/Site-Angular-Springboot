package com.Loja.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.Loja.demo.Model.Produto;
import com.Loja.demo.Repository.ProdutoRepository;

@Component
public class ProdutoServico {
  
  @Autowired
  ProdutoRepository produtoRepository;

  public List<Produto> findAll(){
    return produtoRepository.findAll();
  }

  public Produto findById(Long id){
    Optional<Produto> obj = produtoRepository.findById(id);
    return obj.get();
  }

  

}
