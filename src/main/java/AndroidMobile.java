class AndroidMobile extends Mobile {
    public AndroidMobile(String name, String color, String brand){
        super(name, color, brand);
    }
    @Override
    public void call(String message) {
        if (message.length() > 25) {
            System.out.print("<Andriod> Message cannot be sent\n");
        } else {
            System.out.println("<Android>");
            super.call(message);
        }
    }
}

