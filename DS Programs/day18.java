import java.util.*;
public class day18 {
    public static void main(String[] args) {
        String word="PROGRAM";
        int length=word.length();
        char grid[][]=new char[length][length];

        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                grid[i][j]=' ';
            }
        }

        for (int i=0; i<length;i++) {
            grid[i][i]=word.charAt(i);
            grid[length-i-1][i]=word.charAt(length-i-1);
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}
