public class Hilo1 extends Thread {
    static int km;

    public static void kilometros(int kmt) {
        km = kmt;
    }

    public void run() {
        for (int i = 1; i < km+1; i++) {
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i + " km/h");
            if (i==km){
                System.out.println("su auto llegó a los km permitidos");
            }
        }
    }
}
