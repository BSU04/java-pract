class MotherBoard {

   static class USB{// static nested class
       int usb2 = 2;
       int usb3 = 1;
       int getTotalPorts(){
           return usb2 + usb3;
       }
   }

}
public class StaticNestedClass {
   public static void main(String[] args) {
       MotherBoard.USB usb = new MotherBoard.USB();// create an object of the static nested class 
												   //using the name of the outer class
       System.out.println("Total Ports = " + usb.getTotalPorts());
   }
}