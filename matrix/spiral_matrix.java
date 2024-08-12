package matrix;

import java.util.ArrayList;
import java.util.List;

public class spiral_matrix {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> list= spiralMatrix(matrix);
        System.out.println(list);

    }
    public static List<Integer> spiralMatrix(int[][] mat){
        List<Integer> list= new ArrayList();
        int m=mat.length;
        int n=mat[0].length;
        int top=0,left=0,right=n-1,bottom=m-1;
        while(list.size()<=m*n){
            for(int i=left;i<=right;i++){
            list.add(mat[top][i]);
        }
        
        for(int i=top+1;i<=bottom;i++){
            list.add(mat[i][right]);
        }
        
        if(left!=right){
            for(int i=right-1;i>=left;i--){
            list.add(mat[bottom][i]);
        }
        }
        if(top!=bottom){
            for(int i=bottom-1;i>=top;i--){
            list.add(mat[i][left]);
        }
        }
        top++;
        left++;
        right--;
        bottom--;
        
        }
        return list;
        
    }
    
}
