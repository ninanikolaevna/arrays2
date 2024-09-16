import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//task1
        //«Сумма трат за месяц составила … рублей».
        int[] ints1 = {20, 30, 55, 14, 66};
        int expense = 0;
        for (int i = 0; i < ints1.length; i++) {
            expense += ints1[i];
        }
        System.out.println("Сумма трат за месяц составила " + expense + " рублей");
        //task2
        //Минимальная сумма трат за неделю составила … рублей.
        // Максимальная сумма трат за неделю составила … рублей
        int[] ints2 = {20, 30, 55, 14, 66};
        Arrays.sort(ints2);
        if (ints2.length > 0) {
            System.out.println("Минимальная сумма трат за неделю составила " + ints2[0] + " рублей. Максимальная сумма трат за неделю составила " + ints2[ints2.length - 1] + " рублей.");
        } else {
            System.out.println("Максимальная и минимальная сумма не существует");
        }
        //task3
        int[] ints3 = {20, 30, 55, 14, 66};
        int expense1 = 0;
        for (int i = 0; i < ints3.length; i++) {
            expense1 += ints3[i];
        }
        double middle = (double) expense1 / ints3.length;

        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей.%n", middle);
        //task4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}