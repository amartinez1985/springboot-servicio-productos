package com.formacionbdi.springboot.app.productos.controllers;

import java.util.List;

import javax.validation.constraints.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.formacionbdi.springboot.app.productos.models.entity.Producto;
import com.formacionbdi.springboot.app.productos.models.service.IProductoService;

@RestController
public class ProductoController {
		
	@Autowired
	private IProductoService iproductoService;
	
	@GetMapping("/listar")
	public List<Producto> Listar(){
	return iproductoService.findAll();
	}	
	
	@GetMapping("/ver/{id}")
	public Producto detalle(@PathVariable Long id) {
		return iproductoService.findById(id);
	}
	
}
