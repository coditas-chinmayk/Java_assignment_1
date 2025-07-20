import java.util.ArrayList;
import java.util.List;

public class Spiral{
    public static void spiralOrder(int [][] matrix) {
        // List<T> result = new ArrayList<>();
        // if (matix.length == 0 || matrix == null) return result;

        int top = 0;
        int left = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;

        while (top <= bottom && left <= right){
            // left to right
            for(int col = left; col <= right; col++){
                System.out.print(matrix[top][col] + " ");
            }
            top++;
            // top to bottom
            for(int row = top; row <= bottom; row++){
                System.out.print(matrix[row][right] + " ");
            }
            right--;

            // right to left
            if(top <= bottom){
                for(int col = right; col >= left; col--){
                    System.out.print(matrix[bottom][col] + " ");
                }
                bottom--;
            }

            // bottom to top
            if(left <= right){
                for(int row = bottom; row >= top; row--){
                    System.out.print(matrix[row][left] + " ");
                }
                left++;
            }
        }
    }

        public static void main(String [] args){
            int [][] matrix = {
                {1,  2,  3,  4,  5},
                {6,  7,  8,  9, 10},
                {11,12, 13, 14,15},
                {16,17, 18, 19,20},
                {21,22, 23, 24,25}
            };

            spiralOrder(matrix);
        }
}