public class Mouse{
    private boolean full;
    private String skinColor = "Black";
    Mouse(){

    }
    
    Mouse(boolean full, String skinColor){
        this.full = full;
        this.skinColor = skinColor;
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