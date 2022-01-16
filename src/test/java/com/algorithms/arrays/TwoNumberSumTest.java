package com.algorithms.arrays;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitPlatform.class)
public class TwoNumberSumTest {

    @Test
    public void shouldReturnMinusOneAndElevenUsingWhileLoop(){
        int[] output = TwoNumberSum.twoNumberSumUsingWhileLoop(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);

        assertThat(output.length).isEqualTo(2);
        assertThat(output).contains(-1);
        assertThat(output).contains(11);
    }


    @Test
    public void shouldReturnMinusOneAndElevenUsingTwoArrays(){
        int[] output = TwoNumberSum.twoNumberSumUsingTwoArrays(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);

        assertThat(output.length).isEqualTo(2);
        assertThat(output).contains(-1);
        assertThat(output).contains(11);
    }

    @Test
    public void shouldReturnMinusOneAndElevenUsingHashMapTwoLoops(){
        int[] output = TwoNumberSum.twoNumberSumUsingHashMapTwoLoops(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);

        assertThat(output.length).isEqualTo(2);
        assertThat(output).contains(-1);
        assertThat(output).contains(11);
    }

    @Test
    public void shouldReturnMinusOneAndElevenUsingHashMapOneLoop(){
        int[] output = TwoNumberSum.twoNumberSumUsingHashMapOneLoop(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);

        assertThat(output.length).isEqualTo(2);
        assertThat(output).contains(-1);
        assertThat(output).contains(11);
    }

    @Test
    public void shouldReturnMinusOneAndElevenUsingHashSetOneLoop(){
        int[] output = TwoNumberSum.twoNumberSumUsingHashSetOneLoop(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);

        assertThat(output.length).isEqualTo(2);
        assertThat(output).contains(-1);
        assertThat(output).contains(11);
    }

}
