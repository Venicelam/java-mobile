class iPhone extends Mobile {
    public iPhone(String name, String color, String brand){
        super(name, color, brand);
    }
    @Override
    public void call(String message){
        System.out.println("<iPhone>");
        super.call(message);
    }

}