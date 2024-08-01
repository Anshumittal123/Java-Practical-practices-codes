import java.util.Scanner;

class Matrix{
    private int rows;
    private int cols;
    private int data[][];

    Matrix(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        this.data = new int[rows][cols];
    }

    public void inputMatrix(Scanner s){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                data[i][j] = s.nextInt();
            }
        }
    }

    public static Matrix multiply(Matrix m1, Matrix m2) throws IllegalArgumentException{
        if(m1.cols != m2.rows){
            throw new IllegalArgumentException("Matrix dimansions does not match for matrix multiply a two martix.");
        }
        Matrix result = new Matrix(m1.rows, m2.cols);
            for(int i = 0; i< m1.rows; i++){
                for(int j = 0; j < m2.cols; j++){
                    result.data[i][j] = 0;
                    for(int k = 0; k < m1.cols; k++){
                        result.data[i][j] += m1.data[i][k] * m2.data[k][j]; 
                    }
                }
            }
        return result;
    }

    public void displayMatrix(){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.println(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class matricesMulti {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            // First Matirx
            System.out.println("Enter Number of rows for First matrix is : ");
            int rows1 = s.nextInt();
            System.out.println("Enter Number of cols for First matrix is : ");
            int cols1 = s.nextInt();
            System.out.println("Enter Elements of First Matrix: ");
            Matrix m1 = new Matrix(rows1, cols1);
            m1.inputMatrix(s);

            // Second Matrix
            System.out.println("Enter Number of rows for second matrix is : ");
            int rows2 = s.nextInt();
            System.out.println("Enter Number of cols for second matrix is : ");
            int cols2 = s.nextInt();
            System.out.println("Enter Elements of Second Matrix: ");
            Matrix m2 = new Matrix(rows2, cols2);
            m2.inputMatrix(s);

            // Matrices Multiply
            Matrix result = Matrix.multiply(m1, m2);
            System.out.println("Resultant matrices after multiplication is : ");
            result.displayMatrix();
        } catch (Exception e) {
            System.out.println("Error:"+e.getMessage());
        }finally{
            s.close();
        }
    }
}
