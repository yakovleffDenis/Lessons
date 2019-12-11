package lessons;

public class If {
    public static void main(String[] args) {
        for ( int myInt=0; myInt<22; myInt++){
            if(myInt<10){
                System.out.println("myInt: "+ myInt + " " +"It's true");
            } else if (myInt<=20) {
                System.out.println("myInt:" + myInt + " " + "It's wrong");
            }
            else {
                System.out.println("myInt: "+ myInt + " " + "Nothing");
            }
        }
    }
}