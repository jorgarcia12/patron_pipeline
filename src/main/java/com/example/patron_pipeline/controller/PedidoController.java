package com.example.patron_pipeline.controller;


import com.example.patron_pipeline.model.Pedido;
import com.example.patron_pipeline.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    private final PedidoService pedidoService;

    @Autowired
    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping("/process")
    public Pedido procesarPedido(@RequestBody Pedido pedido) {
        return pedidoService.procesarPedido(pedido);
    }
}
