package com.kelani.v5.operation;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;



public class AddOperationTest {


    @Test
    public void should_add_positive_values(){
        AddOperation addOperation = new AddOperation();
        Double result = addOperation.execute(new Double[]{5.0,6.0});
        assertThat(result, is(11.0));
    }


    @Test
    public void should_add_zeros(){
        AddOperation addOperation = new AddOperation();
        Double result = addOperation.execute(new Double[]{0.0,0.0});
        assertThat(result, is(0.0));
    }


    @Test
    public void should_add_negatives(){
        AddOperation addOperation = new AddOperation();
        Double result = addOperation.execute(new Double[]{-1.0,-2.0});
        assertThat(result, is(-3.0));
    }

}