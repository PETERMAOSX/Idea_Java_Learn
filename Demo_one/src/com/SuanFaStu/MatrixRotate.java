package com.SuanFaStu;

public class MatrixRotate {
    static void rotate(int[][] matrix){
        int n = matrix.length;
        //transpose matrix
        for (int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }
}
