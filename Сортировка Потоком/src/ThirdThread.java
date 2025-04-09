public class ThirdThread extends Thread{
    @Override
    public void run(){
        try {
            Thread.sleep(80);
        } catch (InterruptedException e) {
            System.out.println("Что-то пошло не так");
        }
        Main.flag2 = false;
        long startTime = System.currentTimeMillis();
        /**
         * massiv4  сортируются в этом потоке
         */
        for (int k = 0; k < Main.size; k++) {          // сравниваю и сортирую соседние значения
            for (int j = k + 1; j < Main.size; j++) {
                if (Main.massiv4[k] > Main.massiv4[j]) {
                    int num = Main.massiv4[k];
                    Main.massiv4[k] = Main.massiv4[j];
                    Main.massiv4[j] = num;
                }
            }
        }
        long endTime = System.currentTimeMillis(); // запоминаем время окончания выполнения программы
        Main.executionTime3 = endTime - startTime; // вычисляем время выполнения программы
        Main.flag2 = true;
    }
}

