public class UserInput {
    public static void main(String[] args) {
        int currentYear = 2023;
        getUserInputFromConsole(currentYear);
    }

    public static void getUserInputFromConsole(int currentYear){
        String name = System.console().readLine("Enter your name: ");
        System.out.println("Hello " + name);

        int yearOfBirth = Integer.parseInt(System.console().readLine("Enter your year of birth: "));
        System.out.println("You are " + (currentYear - yearOfBirth) + " years old");
    }
}
