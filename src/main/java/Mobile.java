class Mobile {

    private String name;
    private String color;
    private String brand;

    public Mobile(String name, String color, String brand) {
        this.name = name;
        this.brand = brand;
        this.color = color;


    }

    public void call(String message) {
        System.out.println("Message: [" + message + "]");
    }

    /*public void getInfo() {
        System.out.println("name: [" + this.name + "]");
    }*/


}





