package com.example.patron_pipeline.services;

import com.example.patron_pipeline.model.Pedido;
import com.example.patron_pipeline.pipeline.Pipeline;
import com.example.patron_pipeline.pipeline.steps.AplicarDescuento;
import com.example.patron_pipeline.pipeline.steps.CalcularTotal;
import com.example.patron_pipeline.pipeline.steps.ValidarPedido;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
    private final Pipeline<Pedido> pipeline;

    public PedidoService() {
        this.pipeline = new Pipeline<Pedido>()
                .addStep(new ValidarPedido())
                .addStep(new CalcularTotal())
                .addStep(new AplicarDescuento());
    }

    public Pedido procesarPedido(Pedido pedido) {
        return pipeline.execute(pedido);
    }
}
