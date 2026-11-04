package com.duoc.productos.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "productos")
public class Productos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProducto;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private int precio;

    @Column (nullable = false)
    private String descripcion;

    @Column (nullable = false)
    private int stock;
}
