/*import java.util.*;
class Demo
{
	float add(float... a)
	{
		float sum=0.0f;
		float(float i: a)
		{
			sum=sum + i;
		}
		return sum;
	}
}
class Test
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		System.out.println(d.add());
		System.out.println(d.add(1.1f,2.1f));
	}
}*/


import java.util.*;

class Guesser {
	int Gnum; 
	int Guessnum() {
		System.out.println("Guesser guess the number between 1 to 30");
		Scanner sc= new Scanner(System.in);
		Gnum = sc.nextInt(0);
		return Gnum;
	}
}

class Player {
	int Pnum;
	int Playernum() {
		System.out.println("Player guess the Number between 1 to 30");
		Scanner sc= new Scanner(System.in);
		Pnum = sc.nextInt();
		return Pnum;
	}
}

class Umpire {
	int guessernum;
	int player1num;
	int player2num;
	int player3num;
	
	void collectGnum()
	{
		Guesser g = new Guesser();
		guessernum = g.Guessnum();
	}
	
	void collectpnum()
	{
		Player p1 = new Player();
		player1num = p1.Playernum();
		Player p2 = new Player();
		player2num = p2.Playernum();
		Player p3 = new Player();
		player3num = p3.Playernum();
	}
	
	void compare() {
		if (guessernum == player1num) {
			System.out.println("Player 1 won");
		} else if (guessernum == player2num) {
			System.out.println("Player 2 won");
		}else if (guessernum == player3num) {
			System.out.println("Player 3 won");
		}else {
			System.out.println("Game Over");
		}
	}
}

public class Demo {
	public static void main (String[] args) {
		Umpire u = new Umpire();
		u.collectGnum();
		u.collectpnum();
		u.compare();
	}
}
