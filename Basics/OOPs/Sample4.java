
class Shop{
    void bluetooth() {
        System.out.println("Can listen music using Bluetooth devices");
    }
}
class Mobile extends Shop{
    void bluetooth() {
        System.out.println("Use to Share Files from one device to Another");
    }
}
public class Sample4 {
    public static void main(String[] args) {
        Shop obj = new Shop();
        Shop obj1 = new Mobile();
        obj.bluetooth();
        obj1.bluetooth();
    }
}
