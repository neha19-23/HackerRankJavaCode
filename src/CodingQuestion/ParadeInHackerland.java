package CodingQuestion;

public class ParadeInHackerland {

	public static int getSwapTime(String color)
	{
		int timeTaken=0;
		int timeCounter=0;
		char[] ch = color.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i] == '0')
				timeCounter++;
			else if(ch[i] == '1' && timeCounter == 0)
				continue;
			else if(ch[i] == '1')
				timeTaken = Math.max(timeTaken+1, timeCounter);
				
		}
		
		return timeTaken;
	}
	public static void main(String[] args) {
		System.out.println(getSwapTime("001011"));
	}

}
