package com.example.patron_pipeline.pipeline.steps;

import com.example.patron_pipeline.model.Item;
import com.example.patron_pipeline.model.Pedido;
import com.example.patron_pipeline.pipeline.PipelineStep;

public class CalcularTotal implements PipelineStep<Pedido> {
    @Override
    public Pedido process(Pedido input) {
        double total = 0;
        for (Item item : input.getItems()) {
            total += item.getPrecioUnidad() * item.getCantidad();
        }
        input.setTotal(total);
        return input;
    }
}
