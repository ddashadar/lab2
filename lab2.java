import java.util.Scanner;

public class lab2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое неотрицательное число меньше 15: ");
        int n;
        int result = 1;

        while (true) {
            if (in.hasNextInt()) {
                n = in.nextInt();
                if ((n > 0) && (n < 15)) {
                    break;
                }
                else {
                    System.out.println("Ошибка. Введите целое неотрицательное число меньше 15.");
                }
            }
            else {
                System.out.println("Ошибка. Введите целое неотрицательное число меньше 15.");
                in.next();
            }
        }
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.println("Факториал числа: " + result);
        in.close();
    }
}