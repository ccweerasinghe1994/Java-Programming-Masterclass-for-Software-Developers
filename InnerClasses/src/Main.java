import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Button buttonPrint = new Button("print");

    public static void main(String[] args) {
//        new Button.onClickListener() is the anonymous class

        buttonPrint.setOnClickListener(new Button.onClickListener() {
            
            @Override
            public void onClick(String name) {
                System.out.println(name + " is set");
            }
        });
        listen();
    }

    public static void listen() {
        boolean quit = false;
        while (!quit) {
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0 -> quit = true;
                case 1 -> {
                    buttonPrint.onClick();
                }
            }
        }
    }
}