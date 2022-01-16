package com.algorithms;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitPlatform.class)
public class FibonacciTest {

    private static Fibonacci fibonacci;

    @BeforeAll
    public static void init(){
        fibonacci = new Fibonacci();
    }


    @Test
    public void shouldReturnSequenceOfZero(){
        int[] winner = fibonacci.getSequenceByTerm(0);
        assertThat(winner).isEqualTo(new int[]{0});
    }

    @Test
    public void shouldReturnSequenceOfOne(){
        int[] winner = fibonacci.getSequenceByTerm(1);
        assertThat(winner).isEqualTo(new int[]{0, 1});
    }

    @Test
    public void shouldReturnSequenceOfTwo(){
        int[] winner = fibonacci.getSequenceByTerm(2);
        assertThat(winner).isEqualTo(new int[]{0, 1, 1});
    }

    @Test
    public void shouldReturnSequenceOfThree(){
        int[] winner = fibonacci.getSequenceByTerm(3);
        assertThat(winner).isEqualTo(new int[]{0, 1, 1, 2});
    }

    @Test
    public void shouldReturnSequenceOfFive(){
        int[] winner = fibonacci.getSequenceByTerm(5);
        assertThat(winner).isEqualTo(new int[]{0, 1, 1, 2, 3, 5});
    }

    @Test
    public void shouldReturnSequenceOfNine(){
        int[] winner = fibonacci.getSequenceByTerm(9);
        assertThat(winner).isEqualTo(new int[]{0, 1, 1, 2, 3, 5,8,13,21,34});
    }

    @Test
    public void shouldReturnFirstTerm(){
        Integer ninetieth = fibonacci.findByTerm(0);
        assertThat(ninetieth).isEqualTo(0);
    }

    @Test
    public void shouldReturnSecondTerm(){
        Integer ninetieth = fibonacci.findByTerm(1);
        assertThat(ninetieth).isEqualTo(1);
    }

    @Test
    public void shouldReturnThirdTerm(){
        Integer ninetieth = fibonacci.findByTerm(2);
        assertThat(ninetieth).isEqualTo(1);
    }

    @Test
    public void shouldReturnNinetiethTerm(){
        Integer ninetieth = fibonacci.findByTerm(8);
        assertThat(ninetieth).isEqualTo(21);
    }

    @Test
    public void shouldReturnTermNine(){
        Integer ninetieth = fibonacci.findByTerm(9);
        assertThat(ninetieth).isEqualTo(34);
    }

    @Test
    public void shouldReturnTermFourteen(){
        Integer ninetieth = fibonacci.findByTerm(14);
        assertThat(ninetieth).isEqualTo(377);
    }


}
