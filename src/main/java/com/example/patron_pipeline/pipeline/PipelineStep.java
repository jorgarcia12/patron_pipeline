package com.example.patron_pipeline.pipeline;

public interface PipelineStep<T> {
    T process(T input);
}
