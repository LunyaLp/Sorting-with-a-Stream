public class SecondThread extends Thread{
    @Override
    public void run(){
        try {
            Thread.sleep(80);
        } catch (InterruptedException e) {
            System.out.println("Что-то пошло не так");
        }
        Main.flag1 = false;
        long startTime = System.currentTimeMillis();
        /**
         * massiv3  сортируются в этом потоке
         */
        for (int k = 0; k < Main.size; k++) {          // сравниваю и сортирую соседние значения
            for (int j = k + 1; j < Main.size; j++) {
                if (Main.massiv2[k] > Main.massiv2[j]) {
                    int num = Main.massiv2[k];
                    Main.massiv2[k] = Main.massiv2[j];
                    Main.massiv2[j] = num;
                }
            }
        }
        long endTime = System.currentTimeMillis(); // запоминаем время окончания выполнения программы
        Main.executionTime2 = endTime - startTime; // вычисляем время выполнения программы
        Main.flag1 = true;
    }
}
