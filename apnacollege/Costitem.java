public class Costitem {
   public static void main(String[] args) {
    float pencil=23;
    float pen=67;
    float eraser=45;
    float total=pencil+pen+eraser;
    System.out.println("total cost of items is : "+ total);
    float totalwithgst=total+(total*0.18f);  
    System.out.println("total cost of items with gst is : "+ totalwithgst);  
   } 
}
