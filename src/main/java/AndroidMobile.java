class AndroidMobile extends Mobile {
    public AndroidMobile(String name, String color, String brand){
        super(name, color, brand);
    }
    @Override
    public void call(String message){
        System.out.println("<Android>");
        super.call(message);
    }

}

