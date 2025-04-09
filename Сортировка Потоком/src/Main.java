public class Main {
    static int size = 10000;
    static volatile boolean flag1,flag2;
    static volatile long executionTime1, executionTime2, executionTime3;
    static int[] massiv1, massiv2, massiv3, massiv4;

    public static void main(String[] args) throws InterruptedException {
        massiv2 = new int[size];
        massiv1 = new int[size];
        for (int i = 0; i < size; i++) {
            massiv1[i] = massiv2[i] = (int) (Math.random() * 101);
        }

        massiv4 = new int[size];
        massiv3 = new int[size];
        for (int i = 0; i < size; i++) {
            massiv3[i] = massiv4[i] = (int) (Math.random() * 101);
        }

            FirstThread enemyObj1 = new FirstThread();
            enemyObj1.start();

            SecondThread enemyObj2 = new SecondThread();
            enemyObj2.start();

            ThirdThread enemyObj3 = new ThirdThread();
            enemyObj3.start();

        while (true){
            if(flag1 && flag2){
                if (executionTime3>executionTime2){
                    System.out.println("Общее время выполнения сортировки в двух потоках: " + executionTime3 + " миллисекунд");
                }else {
                    System.out.println("Общее время выполнения сортировки в двух потоках: " + executionTime2 + " миллисекунд");
                }
                break;
            }
        }
    }
}