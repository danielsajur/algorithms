package com.algorithms.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(JUnitPlatform.class)
public class TournamentWinnerTest {

    private static TournamentWinner tournamentWinner;

    @BeforeAll
    public static void init(){
        tournamentWinner = new TournamentWinner();
    }


    @Test
    public void shouldReturnPython(){
        List<Integer> results = Arrays.asList(0,0,1);

        List<List<String>> competitions = new ArrayList<>();
        competitions.add(Arrays.asList("HTML", "C#"));
        competitions.add(Arrays.asList("C#", "Python"));
        competitions.add(Arrays.asList("Python", "HTML"));

        String winner = tournamentWinner.tournamentWinner(competitions, results);

        Assertions.assertThat(winner).isEqualTo("Python");
    }

    @Test
    public void shouldReturnJava(){
        List<Integer> results = Arrays.asList(0,1,1);

        List<List<String>> competitions = new ArrayList<>();
        competitions.add(Arrays.asList("HTML", "Java"));
        competitions.add(Arrays.asList("Java", "Python"));
        competitions.add(Arrays.asList("Python", "HTML"));

        String winner = tournamentWinner.tournamentWinner(competitions, results);

        Assertions.assertThat(winner).isEqualTo("Java");
    }

    @Test
    public void shouldReturnCSharp(){
        List<Integer> results = Arrays.asList(0, 1, 1, 1, 0, 1, 0, 1, 1, 0);

        List<List<String>> competitions = new ArrayList<>();
        
        competitions.add(Arrays.asList("HTML", "Java"));
        competitions.add(Arrays.asList("Java", "Python"));
        competitions.add(Arrays.asList("Python", "HTML"));
        competitions.add(Arrays.asList("C#", "Python"));
        competitions.add(Arrays.asList("Java", "C#"));
        competitions.add(Arrays.asList("C#", "HTML"));
        competitions.add(Arrays.asList("SQL", "C#"));
        competitions.add(Arrays.asList("HTML", "SQL"));
        competitions.add(Arrays.asList("SQL", "Python"));
        competitions.add(Arrays.asList("SQL", "Java"));

        String winner = tournamentWinner.tournamentWinner(competitions, results);

        Assertions.assertThat(winner).isEqualTo("C#");
    }

}
