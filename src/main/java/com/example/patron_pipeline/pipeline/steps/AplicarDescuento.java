package com.example.patron_pipeline.pipeline.steps;

import com.example.patron_pipeline.model.Pedido;
import com.example.patron_pipeline.pipeline.PipelineStep;

public class AplicarDescuento implements PipelineStep<Pedido> {
    @Override
    public Pedido process(Pedido input) {
        if (input.getTotal() >= 10000) {
            double descuento = input.getTotal() * 0.10;
            input.setTotal(input.getTotal() - descuento);
        }
        return input;
    }
}
