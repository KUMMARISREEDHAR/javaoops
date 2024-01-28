package HelloWorld;

public class MethodChallenge {
    public static void main(String[]ar)
    {
    	int playersposition=highScore(1500);displayHighscore("S",playersposition);
            playersposition=highScore(1000);displayHighscore("Sreedhar",playersposition);
    	    playersposition=highScore(500);displayHighscore("Sudi",playersposition);
    	    playersposition=highScore(100);displayHighscore("Sree",playersposition);
            playersposition=highScore(25);
    	displayHighscore("kavi",playersposition);
    	
    }
    private static int highScore(int score)
    { int p=4;
    	if(score>=1000)
    		p= 1;
    	else if((score>=500) && (score<1000))
    		p= 2;
    	else if((score>=100) && (score<500))
    		p= 3;
    	
    		return p;
    }
    protected static void displayHighscore(String playername,int playersposition)
    {
    	System.out.println(playername+" managed to get into position "+playersposition);
    }
}
