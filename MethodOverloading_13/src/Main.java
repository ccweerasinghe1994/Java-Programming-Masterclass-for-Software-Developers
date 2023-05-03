public class Main {
    public static void main(String[] args) {
        print("Hello World!");
        print(5);
        print(5.5);
        print(true);

    }

    public static void print(String str) {
        System.out.println(str);
    }

    public static void print(int num) {
        System.out.println(num);
    }

    public static void print(double num) {
        System.out.println(num);
    }

    public static void print(boolean bool) {
        System.out.println(bool);
    }
//    this is not allowed because the method signature is the same
//    public static int print(int num) {
//        return num;
//    }
}
