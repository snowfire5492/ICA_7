
/*
Write the complete code for a program which will create a 2D array and then print out the following output using that 2D array:

#  |    0       1       2       3       4       5       6       7       8       9

------------------------------------------------------------------------------------
0  |    0       1       2       3       4       5       6       7       8       9
1  |    10      11      12      13      14      15      16      17      18      19
2  |    20      21      22      23      24      25      26      27      28      29
3  |    30      31      32      33      34      35      36      37      38      39
4  |    40      41      42      43      44      45      46      47      48      49
*/

public class ICA_7_1
{
	public static void main(String[] args)
	{
		System.out.printf("\n#  |%5d%5d%5d%5d%5d%5d%5d%5d%5d%5d", 0,1,2,3,4,5,6,7,8,9);
		System.out.println("\n\n-------------------------------------------------------");
		
		int[][] input = new int[5][10];
		
		int counter = 0;
		int counter2 = 0;
		
		for(int row = 0; row < 5; row++)
		{
			for(int col = 0; col < 10; col++)
			{
				input[row][col] = counter;
				counter++;
			}
		}
		
		
		for(int row = 0; row < 5; row++)
		{
			System.out.println();
			System.out.print(row + "  |");
			
			for(int col = 0; col < 10; col++)
			{
				
				System.out.printf("%5d", input[row][col]);
			}
		}
		
		
	}	
}	