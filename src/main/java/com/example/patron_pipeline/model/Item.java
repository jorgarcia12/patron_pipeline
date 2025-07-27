package com.example.patron_pipeline.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    private String nombre;
    private int cantidad;
    private double precioUnidad;
}
