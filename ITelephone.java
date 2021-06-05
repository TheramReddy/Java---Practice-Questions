package Examples.Interface;

public interface ITelephone {
    void powerOn();
    void dial(int phoneNumber);
    //we are just defining the interface
    //Not creating classes just the signature
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
    //Interface exists to define the methods
}
