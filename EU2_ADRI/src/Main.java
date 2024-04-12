import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int km=0;
        Hilo1 h1 = new Hilo1();

        System.out.println("cuantos kilometros quieres que recorra el auto?");
        km = t.nextInt();
        Hilo1.kilometros(km);
        h1.start();
    }
}
