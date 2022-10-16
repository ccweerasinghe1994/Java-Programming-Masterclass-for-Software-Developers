public class Main {
    public static void main(String[] args) {
        ITelephone deskPhone;
        deskPhone = new DeskPhone(121212);
        deskPhone.powerOn();
        deskPhone.dail(121212);
        deskPhone.isRinging();
        deskPhone.callPhone(121212);
        if (deskPhone.isRinging()) {
            System.out.println("your phone is ringing");
        }
        System.out.println("--------------------- mobile phone -------------------");
        ITelephone chamara = new MobilePhone(123);
        chamara.callPhone(123);
        chamara.answer();
    }
}
