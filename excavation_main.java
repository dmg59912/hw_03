package excavation;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class excavation_main {
	public static int arr[][];

	public static void main ( String args []) throws FileNotFoundException
	{
		read_file();
		print(arr);
	}
	
	static void print(int arr[][])
	{
		for( int i = 0; i < arr.length; ++i)
		{
			System.out.print(" | ");
			for (int j = 0; j < arr[i].length; ++j)
			{
				
				System.out.print(arr[i][j]);
				System.out.print(" | ");
			}
			System.out.println();
		}
	}
	
	static void read_file() throws FileNotFoundException
	{
		int count = 0;
		int set_dimention = 0;
		int row = 0;
		int col = 0;
		File in = new File("input.txt");
		Scanner read = new Scanner(in);
		
		while(read.hasNextInt()) 
		{
			int temp = read.nextInt();
			if(count == 0)
			{
				arr = new int[temp][temp];
				set_dimention = temp;
				++count;		
			}
			else
			{
				if(col < set_dimention )
				{
					arr[row][col] = temp;
					++col;
				}
				
				if( (col % set_dimention) == 0 && (row < set_dimention))
				{
					++row;
					col = 0 ;
				}
				
				++count;
			}
			
		}
	}
	
}
