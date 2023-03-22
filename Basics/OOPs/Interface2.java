
interface Sample50 {
    void product1(String msg);
    void product2(String msg);
    default void wholeSaler() {
        System.out.println("You can buy Products on Whole sale here");
    }
}
interface Sample51 extends Sample50 {
    void totalExport();
    void totalImport();
    default void totalGoods() {
        System.out.println("The Number of Goods Are totally 500");
    }
}
class Sample52 implements Sample51 {
    @Override
    public void totalImport() {
        System.out.println("Import is About to 200");
    }

    @Override
    public void totalExport() {
        System.out.println("Export is about to 300");
    }

    @Override
    public void product1(String msg) {
        System.out.println(msg);
    }

    @Override
    public void product2(String msg) {
        System.out.println(msg);
    }

}
public class Interface2 {
    public static void main(String[] args) {
        Sample52 obj = new Sample52();
        obj.wholeSaler();
        obj.totalGoods();
        obj.product1("Product1 :Chocolates");
        obj.product2("Product2 :Cookies");
        obj.totalImport();
        obj.totalExport();
    }
}
