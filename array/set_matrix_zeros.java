package array;

import java.util.ArrayList;
import java.util.Arrays;

public class set_matrix_zeros {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

        int m=matrix.size();
        int n=matrix.get(0).size();
         ArrayList<ArrayList<Integer>> ans = zeroMatrix(matrix, m, n);
          System.out.println("The Final matrix is: ");
        for (ArrayList<Integer> row : ans) {
            for (Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix,int m ,int n){
        int colZero=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix.get(i).get(j)==0){
                   matrix.get(i).set(0,0);
                    if(j!=0){
                        matrix.get(0).set(j,0);
                    }
                    else
                    colZero=0;
                }
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix.get(i).get(j)!=0){
                    if(matrix.get(i).get(0)==0 || matrix.get(0).get(j)==0){
                        matrix.get(i).set(j,0);
                    }
                }
            }
        }
        if(matrix.get(0).get(0)==0){
            for(int i=0;i<n;i++){
                 matrix.get(0).set(i, 0);
            }
        }
        if(colZero==0){
            for(int i=0;i<m;i++){
               matrix.get(i).set(0, 0);
            }
        }
        return matrix;
    }

}

