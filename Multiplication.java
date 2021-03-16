public class Multiplication   
{    
    public static void main(String[] args) {    
        int row1, clm1, clm2;   
        int matrix1[][] = {    
                          {1, 2, 3},    
                          {1, 2, 3}, 
                          {1, 2, 3},  
                       };    
          int matrix2[][] = {    
            {1, 2, 3},    
            {1, 2, 3}, 
            {1, 2, 3},  
         }; 
              
        row1 = matrix1.length;    
        clm1 = matrix1[0].length;    
    
        clm2 = matrix2[0].length;

        int[][] product = new int[row1][clm2];
        for(int i = 0; i < row1; i++) {
            for (int j = 0; j < clm2; j++) {
                for (int k = 0; k < clm1; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Multiplication of the matrices is: ");
        for(int[] row : product) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}