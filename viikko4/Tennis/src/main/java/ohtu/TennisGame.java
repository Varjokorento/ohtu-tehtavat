package ohtu;

public class TennisGame {
    
    private int playerOneScore = 0;
    private int playerTwoScore = 0;

    private String player1;

    public TennisGame(String player1Name) {
        player1 = player1Name;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(player1))
            playerOneScore += 1;
        else
            playerTwoScore += 1;
    }

    public String getScore() {
        if (playerOneScore == playerTwoScore) {
            return getEvenScore();
        } else if (playerOneScore >=4 || playerTwoScore >=4) {
            return getOnePlayerWinsSet();
        } else {
            return getCurrentSetScore();
        }
    }

    private String getCurrentSetScore() {
        String score = "";
        int tempScore;
        for (int i = 1; i < 3; i++)
        {
            if (i==1) {
                tempScore = playerOneScore;
            } else {
                score += "-";
                tempScore = playerTwoScore;
            }
            score = returnScoreSituation(score, tempScore);
        }
        return score;
    }

    private String returnScoreSituation(String score, int tempScore) {
        switch(tempScore)
        {
            case 0:
                return score + "Love";
            case 1:
                return score + "Fifteen";
            case 2:
                return score + "Thirty";
            case 3:
                return score + "Forty";
            default:
                return score;
        }
    }

    private String getOnePlayerWinsSet() {
        int compareScores = playerOneScore - playerTwoScore;
        if (compareScores == 1) {
            return "Advantage player1";
        } else if (compareScores == -1) {
            return "Advantage player2";
        } else if (compareScores >= 2) {
            return  "Win for player1";
        } else  {
            return "Win for player2";
        }
    }

    private String getEvenScore() {
        switch (playerOneScore)
        {
            case 0:
                return "Love-All";
            case 1:
                return "Fifteen-All";
            case 2:
                return "Thirty-All";
            case 3:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }
}