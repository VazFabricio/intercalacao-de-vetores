public class Main {
    public static int[] misturaArray(int arr1[], int arr2[]) {
        int[] arr3 = new int[20];
        int j = 0;
        int x = 0;
        for (int i = 0; i <= arr1.length - 1; i++) {
            arr3[x] = arr1[j];
            j++;
            x += 2;
        }
        j = 0;
        x = 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr3[x] = arr2[j];
            j++;
            x += 2;
        }
        return arr3;
    }

    public static void exibeArray(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " | ");

        }
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 5, 4, 2, 2, 5, 3, 2, 5, 9};
        int[] arr2 = {7, 15, 20, 0, 18, 4, 55, 23, 8, 6};

        exibeArray(misturaArray(arr1, arr2));

    }
}