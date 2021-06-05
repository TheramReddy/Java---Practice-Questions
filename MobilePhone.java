package Examples.Interface;

import Composition.Motherboard;

public class MobilePhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("MObile phone powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing "+phoneNumber+" on mobilephone");

    }

    @Override
    public void answer() {
        System.out.println("answering the mobile phone");

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if((phoneNumber==myNumber)){
            isRinging = true;
            System.out.println("Ring ring");
        }else{
            isRinging=false;
            System.out.println("Mobile phone not turned on");

        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}

