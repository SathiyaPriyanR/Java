
class Sample2{
     void phone(){

         System.out.println("Storge full");
    }
    void hi() {
        System.out.println("hi");
    }
}
public class OverRiding extends Sample2 {

    void phone() {
        System.out.println("Incoming Call");
        hi();
        super.phone();
    }
    public static void main(String[] args) {
        OverRiding obj = new OverRiding();
        Sample2 obj2 = new Sample2();
        obj.phone();
        obj2.phone();
    }
}
