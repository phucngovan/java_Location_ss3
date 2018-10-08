public class Location {
    private int value;
    private int row;
    private int column;

    public Location() {

    }

    public Location(int value, int row, int column) {
        this.value = value;
        this.row = row;
        this.column = column;
    }

    public static Location largestLocate(int[][] arr) {
        int max = arr[0][0];
        int rowMax = 0;
        int columnMax = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j =  0; j < arr.length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    rowMax = i;
                    columnMax = j;
                }
            }
        }
        return new Location(max, rowMax, columnMax);
    }

    public void displayLocation() {
        System.out.println("The value is " + this.value + " at row " + (this.row+1) + " and column " + (this.column+1));
    }
}
