public class MobilePhone implements ITelephone {
    private final int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("mobile phone powered on");
    }

    @Override
    public void dail(int phoneNumber) {
        if (isOn) {
            System.out.println("no ringing " + phoneNumber + " on the mobile phone");
        } else {
            System.out.println("phone is switched off");
        }
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("answering the mobile phone");
            this.isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == this.myNumber && isOn) {
            this.isRinging = true;
            System.out.println("Melody" +
                    " Ring");
        } else {
            this.isRinging = false;
            System.out.println("Mobile phone is not on");
        }
        return this.isRinging;
    }

    @Override
    public boolean isRinging() {
        return this.isRinging;
    }

}
