public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    private static void task1() {
        System.out.println("Задача 1");
        int sum = 0;
        int[] arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();
    }

    private static void task2() {
        System.out.println("Задача 2");
        int [] arr = generateRandomArray();
        int minSum = arr[0];
        int maxSum = arr[0];
        for (int i= 0; i < arr.length; i++){
            if (arr[i] < minSum){
                minSum = arr[i];
            }
            if (arr[i] > maxSum){
                maxSum = arr[i];
            }
        }
        System.out.println("Минимальная сумма за день равна: " + minSum);
        System.out.println("Максимальная сумма за день равна: " + maxSum);
    }

    private static void task3() {
        System.out.println("Задача 3");
        int [] arr = generateRandomArray();
    }

    private static void task4() {
        System.out.println("Задача 4");
        int [] arr = generateRandomArray();
    }

}