public class Mouse{
    private boolean full;
    Mouse(){

    }
    
    Mouse(boolean full){
        this.full = full;
    }

    public void setFull(boolean full){
        this.full = full;
    }


    public boolean isFull(){
        return full;
    }

    public static void main(String[] args){
        Mouse david = new Mouse();
        System.out.println(david.isFull());
    }
}