/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public static void main(String[] args) {
        Mobile mobileA = new Mobile("Mobile A", "blue", "Sony");
        mobileA.call("How are you?");
        mobileA.getInfo();

        iPhone iPhoneX = new iPhone("iPhone X","black","Apple");
        iPhoneX.call("iPhone is expensive!");
        iPhoneX.getInfo();

        AndroidMobile SamsungC9 = new AndroidMobile("Samsung C9","white","Samsung");
        SamsungC9.call("Samsung is good!");
        SamsungC9.getInfo();

        Person venice = new Person(mobileA, "Venice");
        venice.sentMessage("My name is Venice, I like to play badminton.");

        Person Mum = new Person(iPhoneX, "Mum");

        Mum.sentMessage("I am Mum");
        Mum.sentMessage("I ammmmmmmmmmmmmmmmm Mum");
        Mum.setMobile(SamsungC9);
        Mum.sentMessage("I miss Dad");
        Mum.sentMessage("I misssssssssssssssssss Dad");

       iPhoneRobot iphoneRobotTest = new iPhoneRobot(iPhoneX);
       iphoneRobotTest.sentMessage("Test");

    }
}




