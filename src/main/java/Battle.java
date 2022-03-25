import java.util.regex.Pattern;

public class Battle {
    public String battle(String teamOne, String teamTwo) {
        if (isUppercaseAndJustCharacter(teamOne) && isUppercaseAndJustCharacter(teamTwo))
            return win(teamOne, teamTwo);
        else return "justUpperCas";
    }

    private String win(String teamOne, String teamTwo) {
        int scoreOfTeamTOne = scoreOfTeam(teamOne);
        int scoreOfTeamTow = scoreOfTeam(teamTwo);
        if (scoreOfTeamTOne > scoreOfTeamTow)
            return teamOne;
        else if (scoreOfTeamTOne < scoreOfTeamTow)
            return teamTwo;
        else
            return "Tie!";
    }

    private int scoreOfTeam(String team) {
        int number = 0;
        for (int i = 0; i < team.length(); i++) {
            number += team.charAt(i);
        }
        return number;
    }

    private boolean isUppercaseAndJustCharacter(String text) {
        String regex = "[A-Z]+";
        return Pattern.matches(regex, text);
    }
}
