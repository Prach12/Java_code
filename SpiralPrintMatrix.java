/*
Spiral way to print Matrix elements
 */
import java.util.Scanner;

class SpiralPrintMatrix 
{
    public static void printSpiral(int[][] matrix, int rows, int columns) {
        int top = 0, bottom = rows - 1;
        int left = 0, right = columns - 1;

        while (top <= bottom && left <= right) {
          
            for (int i = left; i <= right; i++)
                System.out.print(matrix[top][i] + " ");
            top++;

            for (int i = top; i <= bottom; i++)
                System.out.print(matrix[i][right] + " ");
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    System.out.print(matrix[bottom][i] + " ");
                bottom--;
            }

            
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    System.out.print(matrix[i][left] + " ");
                left++;
            }
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];

        for(int row=0; row<rows; row++)
        {
            for(int col=0; col<columns; col++)
            {
                matrix[row][col] = sc.nextInt();
            }
        }
        printSpiral(matrix, rows, columns);
        sc.close();
    }
}