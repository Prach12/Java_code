/* 
write a code to find common elements between 2 matrix
*/

import java.util.*;

class CommonElementMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt(), c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                a[i][j] = sc.nextInt();

        int r2 = sc.nextInt(), c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        for (int i = 0; i < r2; i++)
            for (int j = 0; j < c2; j++)
                b[i][j] = sc.nextInt();

        Set<Integer> set = new HashSet<>();
        for (int[] row : a) for (int v : row) set.add(v);
        Set<Integer> common = new HashSet<>();
        for (int[] row : b) for (int v : row) if (set.contains(v)) common.add(v);

        if (common.isEmpty()) System.out.println("No common elements.");
        else for (int v : common) System.out.print(v + " ");
        sc.close();
    }
}