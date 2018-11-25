class Person{
    String name;
    Mobile mobile;

    public Person (Mobile mobile, String name){
        this.mobile = mobile;
        this.name = name;
    }
    public void sentMessage(String message){
        this.mobile.call(message);
    }
    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
