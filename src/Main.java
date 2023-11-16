public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": ping pong");
            } else if (i % 3 == 0) {
                System.out.println(i + ": ping");
            } else if (i % 5 == 0) {
                System.out.println(i + ": pong");
            } else {
                System.out.println(i + ": ");
            }
        }
    }

    public static void task2() {
        int f1 = 0;
        int f2 = 1;

        System.out.print(f1 + " " + f2);

        for (int i = 0; i < 8; i++) {
            int f3 = f1 + f2;
            System.out.print(" " + f3);
            f1 = f2;
            f2 = f3;
        }
    }
}

