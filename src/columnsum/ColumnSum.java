package columnsum;

import java.util.Arrays;
import java.util.Scanner;

public class ColumnSum {

	public static void ColumnSum(int[][] matrix,int rows,int cols)
	{
		int sum[] =new int[cols];
		for(int i=0;i<cols;i++)
		{
			for(int j=0;j<rows;j++)
			{
				sum[i] += matrix[j][i];
			}
		}
		System.out.println(Arrays.toString(sum));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int rows = scanner.nextInt();
		int cols = scanner.nextInt();
		int[][] matrix = new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				matrix[i][j] = scanner.nextInt();
			}
		}
		ColumnSum(matrix,rows,cols);
	}

}
