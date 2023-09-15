import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [][] twoDimArray = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


        int[][] myArray = {{18,28,18},{28,45,90},{45,3,14}};
        System.out.println(Arrays.deepToString(myArray)+"\n");


        int [][] twoDimArray2 = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};
        System.out.println(twoDimArray2.length+"\n");


        String [][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if ((i + j) % 2 == 0) {
                    chessBoard[i][j] = "W ";
                }  else
                    chessBoard[i][j] = "B ";
            }
        }

        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                System.out.print(" " + chessBoard[i][j] + " ");
            }
            System.out.println();
        }
    }
}