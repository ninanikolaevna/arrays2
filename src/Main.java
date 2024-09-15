//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//task1
        //«Сумма трат за месяц составила … рублей».
        int[] ints1 = {5, 8, 3, 16, 11};
        int expense = 0;
        for (int i = 0; i < ints1.length; i++) {
            expense += ints1[i];
        }
        System.out.println("Сумма трат за месяц составила "+ expense +" рублей");
    }
}