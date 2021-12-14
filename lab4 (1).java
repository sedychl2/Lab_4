import java.util.Scanner;
public class lab4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов массива:");
        int N = input.nextInt();
        int[] inArray = new int[N];
        System.out.println("Введите элементы массива через пробел:");
        for (int i = 0; i < N; i++) {
            inArray[i] = input.nextInt();
            }
        System.out.println("Введите целое число X, которое нужно удалить из массива:");
        int X = input.nextInt();
        System.out.print ("Оригинальный массив:");
        for (int i = 0; i < N; i++) {
            System.out.print (" " + inArray[i]);
            }
        int[] newArray = new int[inArray.length];
        for (int i = 0, j = 0; i < inArray.length && j < newArray.length; i++) {
            if (inArray[i] != X) {
                newArray[j++] = inArray[i];
                                 }
        }
        System.out.println ("Конечный массив:");
        for (int i = 0; i < N; i++) {
            System.out.print (" " + newArray[i]);
        }
        System.out.println();
    }
}
