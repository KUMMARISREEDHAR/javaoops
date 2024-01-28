package HelloWorld;

public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int newScore=calculateScore("Sree",250);System.out.println("Neew score "+newScore);
		System.out.println(calculateScore(500)); calculateScore();
	}
	public static int calculateScore(String name,int score)
	{
		System.out.println("Player "+name+" scored "+score);
		return score*300;
	}
	public static int calculateScore(int score)
	{
		System.out.println("Unknown Player scored "+ score +"points");
		return score*300;
	}
	public static void calculateScore()
	{
		 System.out.println("No player no score");
	}
}
