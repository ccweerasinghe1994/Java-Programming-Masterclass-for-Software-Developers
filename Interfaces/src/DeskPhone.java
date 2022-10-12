public class DeskPhone implements ITelephone {
    private final int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("no action taken. desk phone don't have a power button");
    }

    @Override
    public void dail(int phoneNumber) {
        System.out.println("no ringing " + phoneNumber + " on the desk phone");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("answering the desk phone");
            this.isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == this.myNumber) {
            this.isRinging = true;
            System.out.println("Ring Ring");
        } else {
            this.isRinging = false;
        }
        return this.isRinging;
    }

    @Override
    public boolean isRinging() {
        return this.isRinging;
    }
}
