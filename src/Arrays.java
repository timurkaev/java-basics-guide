public class Arrays {
    public static void main(String[] args) {
        int[] array1 = new int[10]; // length = 10
        int array2[] = new int[10]; // alternative array declaration

        int[] array3 = {1,2,3,4,5,6}; // standard array
        int[][] numbers = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}}; // 2-D array

        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers[i].length; j++) {
                System.out.println(numbers[i][j]);
            }
        }
    }
}
