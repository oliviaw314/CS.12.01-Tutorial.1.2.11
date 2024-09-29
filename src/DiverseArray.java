public class DiverseArray {

    public static int arraySum(int[] arr1) {
        int total = 0;
        for (int number : arr1) {
            total+=number;
        }
        return total;
    }

    public static int[] rowSums(int[][] twoDArray) {
        int[] sumArray = new int[twoDArray.length];
        int i=0;
        for (int[] array : twoDArray) {
            int totalPerArray = 0;
            for (int number : array) {
                totalPerArray+=number;
            }
            sumArray[i]=totalPerArray;
            i++;
        }
        return sumArray;
    }

    public static boolean isDiverse(int[][] twoDArray) {
        int[] sumArray = rowSums(twoDArray);
        for (int i=0; i<sumArray.length; i++) {
            for (int j=i+1; j<sumArray.length; j++) {
            // have to do j=i+1 or else just comparing the first index with itself, so always returns false
                if (sumArray[i]==sumArray[j]) {
                    return false;
                }
            }
        }
        return true;
    }

}
