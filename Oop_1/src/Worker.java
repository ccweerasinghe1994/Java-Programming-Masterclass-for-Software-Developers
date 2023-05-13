public class Worker {
    //    private String name,birthDate,endDate;
    private String name;
    private String birthDate;
    private String endDate;

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge() {
        String[] birthDateArray = birthDate.split("/");
        String[] endDateArray = endDate.split("/");

        int birthYear = Integer.parseInt(birthDateArray[2]);
        int endYear = Integer.parseInt(endDateArray[2]);

        return endYear - birthYear;
    }

    public double collectPay() {
        return 4_750_000.0;
    }

    public void terminate() {
        System.out.println("Worker.terminate() called");
        System.out.println("Worker is terminated");
    }
}
