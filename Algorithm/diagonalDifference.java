import java.io.*;
import java.util.*;

public class diagonalDifference {
    public static void main(String[] args)
    {
        //Size Allocation
        int n;
        Scanner read = new Scanner(System.in);
        n = read.nextInt();
        
        //Matrix Construction
        int leftDiagonalSum = 0,rightDiagonalSum = 0;
        int matrix[][] = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j] = read.nextInt();
                if(i==j)
                    leftDiagonalSum+=matrix[i][j];
                if((i+j)==n-1)
                    rightDiagonalSum+=matrix[i][j];
            }
        }
        
        //Diagonal Difference
        int result = leftDiagonalSum - rightDiagonalSum;
        if(result<0)
            result = -(result);
        System.out.print(result);
        
    }
}
