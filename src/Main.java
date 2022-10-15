import java.util.Scanner;
public class Main {
    public static void registraArray(Scanner sc, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Digite o numero para o index <" + (i) + "> : ");
            arr[i] = sc.nextInt();
        }
    }
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

        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        System.out.println("-----Vetor 01-----");
        registraArray(sc, arr1);

        System.out.println("-----Vetor 02-----");
        registraArray(sc, arr2);

        System.out.println("-----O vetor intercalado e: -----");
        exibeArray(misturaArray(arr1, arr2));

    }
}