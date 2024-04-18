package Problems;

import java.util.*;
import java.util.stream.Collectors;

public class Problem2A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var t = sc.nextInt();

        Map<String, Integer> lastScoresMap = new HashMap<>();
        List<ScoreEntry> history = new ArrayList<>();
        for(int i=0; i<t; i++){
            String name = sc.next();
            var score = sc.nextInt();
            if(lastScoresMap.containsKey(name)){
                var currentScore = lastScoresMap.get(name);
                score = currentScore + score;
                lastScoresMap.put(name, score);
                history.add(new ScoreEntry(score, name));
            }else{
                lastScoresMap.put(name, score);
                history.add(new ScoreEntry(score, name));
            }
        }

        var maxVal = lastScoresMap.values().stream().max(Comparator.naturalOrder());
        if(maxVal.isPresent()){
            var maximumScorers = lastScoresMap
                    .entrySet().stream()
                    .filter(entry -> Objects.equals(entry.getValue(), maxVal.get()))
                    .map(Map.Entry::getKey).toList();

            var historyList = history.stream().filter(entry -> maximumScorers.contains(entry.getName())).collect(Collectors.toList());
            for(ScoreEntry s: historyList) {
                if(s.getScore() >= maxVal.get()) {
                    System.out.println(s.getName());
                    break;
                }
            }

        }
    }
}

class ScoreEntry {
    int score;
    String name;

    public ScoreEntry(int score, String name) {
        this.score = score;
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}
