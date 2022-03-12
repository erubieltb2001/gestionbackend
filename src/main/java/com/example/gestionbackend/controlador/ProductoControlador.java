package com.example.gestionbackend.controlador;


import com.example.gestionbackend.modelo.Producto;
import com.example.gestionbackend.repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200/")
public class ProductoControlador { 

    @Autowired
    private ProductoRepositorio repositorio;
    //metodo que sirve para en listar todos los productos
    @GetMapping("/productos")
    public List<Producto> listarTodosLosProductos(){
        return repositorio.findAll();
    }


    //este metodo sirve para guardar el empleado
    @PostMapping("/productos")
    public Producto guardarProducto(@RequestBody Producto producto){
        return repositorio.save(producto);
    }
}
