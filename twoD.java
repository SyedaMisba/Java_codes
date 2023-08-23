import java.util.*;
class  twoD
{
	public static void main(String[] args) 
	{
		int marks[][][] = new int [3][][];
		marks[0] = new int[5][];
		marks[1] = new int[2][2];
		marks[2] = new int[3][];
		marks[0][0] = new int[1];
		marks[0][1] = new int[2];
		marks[0][2] = new int[4];
		marks[0][3] = new int[4];
		marks[0][4] = new int[2];

		marks[2][0] = new int[2];
		marks[2][1] = new int[3];
		marks[2][2] = new int[3];


		Scanner sc = new Scanner(System.in);
		for( int i=0; i< marks.length; i++)
		{
			for(int j=0; j<marks[i].length; j++)
			{
				for(int k=0; k<marks[i][j].length; k++)
				{
					System.out.println("Enter the marks");
					marks[i][j][k] = sc.nextInt();
				}
			}
		}
		for( int i=0; i< marks.length; i++)
		{
			for(int j=0; j<marks[i].length; j++)
			{
				for(int k=0; k<marks[i][j].length; k++)
				{
					System.out.println("marks of student"+k+" of classroom "+j+"from school"+i+"is: " +marks[i][j][k]);
				}
			}
		}
	}
}
