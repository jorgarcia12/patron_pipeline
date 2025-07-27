package com.example.patron_pipeline.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {
    private String cliente;
    private List<Item> items;
    private double total;
    private boolean stockValidado;
    private boolean descuentoAplicado;
    private boolean impuestosCalculados;
    private boolean facturaGenerada;
    private boolean notificado;



}
