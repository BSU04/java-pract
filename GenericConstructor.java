class Name{
   String data;
   public <T> Name(T data){
      this.data = data.toString();
   }
   public void display() {
      System.out.println("value: "+this.data);
   }
}
public class GenericConstructor {
   public static void main(String args[]) {
      Name n1 = new Name("Rajagiri");
      n1.display();
      Name n2 = new Name(1965);
      n2.display();
   }
}