public class FirstThread extends Thread {
    @Override
    public void run() {
        long startTime = System.currentTimeMillis(); // запоминаем время начала выполнения программы
/**
 * Два массива сортируются в одном потоке
 */
        for (int k = 0; k < Main.size; k++) {          // сравниваю и сортирую соседние значения
            for (int j = k + 1; j < Main.size; j++) {
                if (Main.massiv1[k] > Main.massiv1[j]) { //тут ругается
                    int num = Main.massiv1[k];
                    Main.massiv1[k] = Main.massiv1[j];
                    Main.massiv1[j] = num;
                }
            }
        }

        for (int k = 0; k < Main.size; k++) {          // сравниваю и сортирую соседние значения
            for (int j = k + 1; j < Main.size; j++) {
                if (Main.massiv3[k] > Main.massiv3[j]) {
                    int num = Main.massiv3[k];
                    Main.massiv3[k] = Main.massiv3[j];
                    Main.massiv3[j] = num;
                }
            }
        }
        long endTime = System.currentTimeMillis(); // запоминаем время окончания выполнения программы
        Main.executionTime1 = endTime - startTime; // вычисляем время выполнения программы
        System.out.println("Время выполнения сортировки в одном потоке: " + Main.executionTime1 + " миллисекунд");

    }
}
