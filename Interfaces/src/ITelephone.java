public interface ITelephone {
    //    these are called signatures
    public void powerOn();

    public void dail(int phoneNumber);

    public void answer();

    public boolean callPhone(int phoneNumber);

    public boolean isRinging();
}
