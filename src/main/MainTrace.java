package main;

public class MainTrace {
    public static void main(String[] args) {
        a();
    }

    public static void a() {
        b();
    }

    public static void b() {
        c();
    }

    public static void c() {
        System.out.println("Привет");
        System.out.println(1 / 0);
    }
}
