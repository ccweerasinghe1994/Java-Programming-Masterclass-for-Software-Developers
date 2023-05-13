public class Main extends Object {
    public static void main(String[] args) {

        Employee employee = new Employee("John Doe", "01/01/2000", "01/01/2020", "01/01/2020");
        System.out.println(employee);

        Employee employee2 = new Employee("Jane Doe", "01/01/2000", "01/01/2020", "01/01/2020");
        System.out.println(employee2);
//        Animal animal = new Animal("Animal", "Large", 100.00);
//        Dog dog = new Dog("Dog", "Large", 100.00, "Pointy", "Long");
//        System.out.println(dog);
////        doAnimalStuff(animal, "100km/h");
//        doAnimalStuff(dog, "100km/h");

// create 5 objects of Student class    with different values
//        Student student1 = new Student("1", "John Doe", "1A", "01/01/2000");
//        Student student2 = new Student("2", "Jane Doe", "1B", "01/01/2000");
//        Student student3 = new Student("3", "John Doe2", "1C", "01/01/2000");
//        Student student4 = new Student("4", "Jane Doe2", "1D", "01/01/2000");
//        Student student5 = new Student("5", "John Doe3", "1E", "01/01/2000");
//
//        System.out.println(student1);
//        System.out.println(student2);
//        System.out.println(student3);
//        System.out.println(student4);
//        System.out.println(student5);

//        StudentR studentR1 = new StudentR("1", "John Doe", "1A", "01/01/2000");
//        System.out.println(studentR1);
//        System.out.println(studentR1.id());
//        System.out.println(studentR1.name());
//        System.out.println(studentR1.classList());
//        System.out.println(studentR1.dateOfBirth());


//        StaticExample staticExample = new StaticExample("John Doe");
//        StaticExample staticExample2 = new StaticExample("Jane Doe2");
//
//
//        staticExample.printName();
//        staticExample2.printName();


//        Customer customer = new Customer();
//        System.out.println(customer.getName());
//        System.out.println(customer.getEmail());
//        System.out.println(customer.getCreditLimit());
//
//        Customer customer2 = new Customer("John Doe", "asda@gmail.com");
//        System.out.println(customer2.getName());
//        System.out.println(customer2.getEmail());
//        System.out.println(customer2.getCreditLimit());


//        BankAccount bankAccount = new BankAccount();

//        bankAccount.setName("John Doe");
//        bankAccount.setAccountNumber("123456789");
//        bankAccount.setBalance(1000.00);
//        bankAccount.setEmail("kasdk@gmail.com");
//        bankAccount.setPhoneNumber("1234567890");
//
//        bankAccount.desposit(100.00);
//        bankAccount.withdraw(200.00);
//        bankAccount.withdraw(1000.00);


    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.move(speed);
        animal.makeNoise();
        System.out.println("Animal");
    }


}
