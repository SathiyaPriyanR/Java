
class Phone {
    void calls() {
        System.out.println("Phone is Ringing");
    }
}
class Battery extends Phone {
    void calls() {
        super.calls();
        System.out.println("But battery is about to die");
    }
}
public class Sample2 {
    public static void main(String[] args) {
        Battery obj = new Battery();
        obj.calls();
    }
}
