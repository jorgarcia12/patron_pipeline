package com.example.patron_pipeline.pipeline.steps;

import com.example.patron_pipeline.model.Pedido;
import com.example.patron_pipeline.pipeline.Pipeline;
import com.example.patron_pipeline.pipeline.PipelineStep;

public class ValidarPedido implements PipelineStep<Pedido> {
    @Override
    public Pedido process(Pedido input) {
        if (input.getItems().isEmpty()) {
            throw new IllegalArgumentException("El pedido no tiene items");

        }
        if (input.getCliente() == null || input.getCliente().isBlank()) {
            throw new IllegalArgumentException("El pedido no tiene cliente");
        }
        return input;
    }
}
