public class Main {

    public static void main(String[] args) {
        // 1. Виведення перших 55 елементів послідовності 1 3 5 7 9 11 13 15 17
        printSequence1();

        // 2. Виведення невід'ємних елементів послідовності 90 85 80 75 70 65 60
        printNonNegativeSequence();

        // 3. Виведення перших 20 елементів послідовності 2 4 8 16 32 64 128
        printSequence2();

        // 4. Виведення чисел кратних п'яти від -29 до 10
        printMultiplesOfFive();

        // 5. Знаходження суми та кількості парних чисел від 50 до 150
        sumAndCountEvens();

        // 6. Знаходження найбільшого значення в масиві
        int[] array = {5, -3, -2, 16, 55, 0};
        findMaxValue(array);

        // 7. Знаходження суми та кількості позитивних чисел в масиві
        sumAndCountPositives(array);

        // 8. Виведення перших 11 членів послідовності Фібоначчі
        printFibonacciSequence();
    }

    // Task 1
    public static void printSequence1() {
        for (int i = 1; i <= 55; i++) {
            System.out.print((2 * i - 1) + " ");
        }
        System.out.println();
    }

    // Task 2
    public static void printNonNegativeSequence() {
        for (int i = 90; i >= 0; i -= 5) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Task 3
    public static void printSequence2() {
        int num = 2;
        for (int i = 1; i <= 20; i++) {
            System.out.print(num + " ");
            num *= 2;
        }
        System.out.println();
    }

    // Task 4
    public static void printMultiplesOfFive() {
        for (int i = -29; i <= 10; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Task 5
    public static void sumAndCountEvens() {
        int sum = 0;
        int count = 0;
        for (int i = 50; i <= 150; i++) {
            sum += i;
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("Сума чисел від 50 до 150: " + sum);
        System.out.println("Кількість парних чисел: " + count);
    }

    // Task 6
    public static void findMaxValue(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Найбільше значення в масиві: " + max);
    }

    // Task 7
    public static void sumAndCountPositives(int[] array) {
        int sum = 0;
        int count = 0;
        for (int value : array) {
            if (value > 0) {
                sum += value;
                count++;
            }
        }
        System.out.println("Sum of positive numbers: " + sum);
        System.out.println("Quantity of positive numbers: " + count);
    }

    // Task 8
    public static void printFibonacciSequence() {
        int n = 11;
        int a = 1, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println();
    }
}
