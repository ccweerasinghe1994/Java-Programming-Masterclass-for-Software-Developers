public class Main {
    public static void main(String[] args) {

        Car porsche = new Car();
        porsche.setMake("");
        porsche.setModel("Carrera");
        porsche.setColor("Red");
        porsche.setDoors(2);
        porsche.setConvertible(false);

        porsche.describe();
        System.out.println(porsche.getMake());
        System.out.println(porsche.getModel());
        System.out.println(porsche.getColor());
        System.out.println(porsche.getDoors());
        System.out.println(porsche.isConvertible());

        BankAccount bankAccount = new BankAccount();
        bankAccount.setName("John Doe");
        bankAccount.setAccountNumber("123456789");
        bankAccount.setBalance(1000.00);
        bankAccount.setEmail("kasdk@gmail.com");
        bankAccount.setPhoneNumber("1234567890");

        bankAccount.desposit(100.00);
        bankAccount.withdraw(200.00);
        bankAccount.withdraw(1000.00);


    }
}
