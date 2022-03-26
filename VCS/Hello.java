public class Hello{
    private String greeting = "How are you";
    public Hello(){

    }
    
    public static void status(){
        System.out.println("status: good");
    }

    public String getGreeting(){
        return greeting;
    }

    public static void main(String[] args){
        Hello hi = new Hello();
        hi.status;
        System.out.println(hi.getGreeting());
    }
}

