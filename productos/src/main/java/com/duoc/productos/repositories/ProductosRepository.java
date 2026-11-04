package com.duoc.productos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.duoc.productos.models.entities.Productos;

@Repository 
public interface ProductosRepository extends JpaRepository<Productos, Integer> {
    
}
