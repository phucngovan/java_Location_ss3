import java.util.Scanner;

public class LocationTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please input row and colum:");
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] arr = new int[row][column];
        for (int i = 0; i < row; i++) {
            scanner.nextLine();
            System.out.println("Please enter row " + i+1);
            for (int j = 0; j < column; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        Location position = Location.largestLocate(arr);
        position.displayLocation();
    }
}
