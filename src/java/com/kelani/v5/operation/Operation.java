package com.kelani.v5.operation;

public interface Operation {
    Double execute(Double[] numbers) throws  InvalidCalcOperationException;
}
