/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public static void main(String[] args) {
        Mobile mobileA = new Mobile("Mobile A", "blue", "Sony");
        mobileA.call("How are you?");

        iPhone iPhoneX = new iPhone("iPhone X","black","Apple");
        iPhoneX.call("iPhone is expensive!");

        AndroidMobile SamsungC9 = new AndroidMobile("Samsung C9","white","Samsung");
        SamsungC9.call("Samsung is good!");
    }
}



