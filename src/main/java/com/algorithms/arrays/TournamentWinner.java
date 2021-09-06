package com.algorithms.arrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class TournamentWinner {

    private static final int HOME_TEAM_WON = 1;

    public String tournamentWinner(List<List<String>> competitions, List<Integer> results) {

        AtomicReference<String> winner = new AtomicReference<>();
        final Map<String, Integer> winners = new HashMap<>(results.size());
        winners.put(winner.get(), 0);

        AtomicInteger index = new AtomicInteger();
        competitions.forEach(competitors -> {
            final Integer result = results.get(index.get());
            String currentWinnerTeam = getWinnerTeam(competitors, result);
            updateScores(currentWinnerTeam, winners);
            if(winners.get(winner.get()) < winners.get(currentWinnerTeam)){
                winner.set(currentWinnerTeam);
            }
            index.incrementAndGet();
        });

        return winner.get();
    }

    private String getWinnerTeam(List<String> competitors, Integer result) {
        String homeTeam = competitors.get(0);
        String awayTeam = competitors.get(1);
        return (result == HOME_TEAM_WON) ? homeTeam : awayTeam;

    }

    private void updateScores(String winner, Map<String, Integer> winners) {
        if(!winners.containsKey(winner)){
            winners.put(winner, 0);
        }
        winners.put(winner, winners.get(winner) + 3);
    }
}
