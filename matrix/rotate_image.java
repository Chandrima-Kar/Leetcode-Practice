package matrix;

import java.util.List;

public class rotate_image {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);//with allocating a new matrix
        rotate2(matrix);//without allocating new matrix
    }
    public static void rotate(int[][] matrix){
        int k=0;
        int[][] mat= new int[matrix.length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            int l=matrix.length-1;
            for(int j=0;j<matrix[0].length;j++){
                mat[i][j]=matrix[l][k];
                l--;
            }
            k++;
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void rotate2(int[][] matrix)
    {
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        for(int i=0;i<matrix.length;i++){
            int left=0,right=matrix[0].length-1;
            while(left<right){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }

}
