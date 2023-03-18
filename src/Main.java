public class Main {
    public static void main(String[] args) {
        class main {
            public static void main(String[] args) {
                byte b = 10;
                int i = 1000;
                double d = 3.14;
                float f = 1.5f;

                // сужение типа
                byte b2 = (byte) i;
                float f2 = (float) d;

                // расширение типа
                int i2 = b;
                double d2 = f;

                System.out.println("b2 = " + b2);
                System.out.println("f2 = " + f2);
                System.out.println("i2 = " + i2);
                System.out.println("d2 = " + d2);
            }
        }
    }
}