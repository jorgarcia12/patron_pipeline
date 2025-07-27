package com.example.patron_pipeline.pipeline;

import java.util.ArrayList;
import java.util.List;

public class Pipeline<T> {
    private final List<PipelineStep<T>> steps = new ArrayList<>();

    public Pipeline<T> addStep(PipelineStep<T> step) {
        steps.add(step);
        return this;
    }

    public T execute(T input) {
        T result = input;
        for (PipelineStep<T> step : steps) {
            result = step.process(result);
        }
        return result;
    }
}
