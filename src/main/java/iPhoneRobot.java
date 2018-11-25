public class iPhoneRobot {
    private iPhone iphone;

    public iPhone getIphone() {
        return iphone;
    }

    public void setIphone(iPhone iphone) {
        this.iphone = iphone;
    }

    public iPhoneRobot(iPhone iphone) {
        this.iphone = iphone;
    }

    public void sentMessage(String message){
        this.iphone.call(message);
    }
}
