public class Main {
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        // Задание 1 \\
        int[] array = generateRandomArray();
        int all = 0;
        for (int i = 0; i < array.length ; i++) {
            all += array[i];
        }
        System.out.println("Сумма трат за месяц составила " + all + " рублей");

        // Задание 2 \\
        int maxRubDay = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxRubDay){
                maxRubDay = array[i];
            }
        }
        int minRubDay = array[0] ;
        for (int i = 0; i < array.length; i++) {
            if (array[i]< minRubDay) {
                minRubDay = array[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minRubDay + " рублей. Максимальная сумма трат за день составила " + maxRubDay + " рублей");

        // Задание 3 \\
        float midRubDay = 0;
        midRubDay = all / 30f;
        System.out.println("Средняя сумма трат за месяц составила " + midRubDay + " рублей");

        // Задание 4 \\
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}