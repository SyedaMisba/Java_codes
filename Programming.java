class Programming {
	public static void main(String[] args) 
	{
		int[] numArray = {10, 20, 30, 40, 50,60 };
		int num2 = 35;
		Boolean flag = false;
		for (int i=0; i<numArray.length ;i++ )
		{
			if (numArray[i] == num2)
			{
				flag = true;
				break;
			}
		}
		System.out.println(flag);
	}
}
