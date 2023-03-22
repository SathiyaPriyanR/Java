
interface Sample4 {
    public String ex1();
    public Double ex2();
    default void ex3() {
        System.out.println("helllow");
    }
}
class Sample5 implements Sample4 {
    public String ex1() {
        String BrandName = "Addidas";
        return BrandName;
    }
    public Double ex2() {
        Double StockPrice = 146.96;
        ex3();
        return StockPrice;
    }
}
public class Interface {
    public static void main(String[] args) {
        Sample5 obj = new Sample5();
        System.out.println("Brand Name  :" + obj.ex1());
        System.out.println("StockPrice  :" + obj.ex2());

    }
}
