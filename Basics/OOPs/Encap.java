
class Sample31{
    private String name;
    private Double income;
    private String ManagerName;
    public Sample31(String name1 , Double monthincome) {
        this.income=monthincome;
        this.name=name1;
    }
    public Sample31() {
    }
    public String getName() {
        return name;
    }
    public Double getIncome() {
        return income;
    }
    public String getManagerName() {
        return ManagerName;
    }
    public void setManagerName(String managerName) {
        this.ManagerName=managerName;
    }
}
public class Encap {
    public static void main(String[] args) {
    Sample31 obj = new Sample31("Harry" , 28525.45);
    Sample31 obj2 = new Sample31("Martin" , 48782.765);
    Sample31 obj3 = new Sample31();
    obj3.setManagerName("justin");

        System.out.println("Manager        :" + obj3.getManagerName());
        System.out.println("Employee_Name  :" + obj.getName());
        System.out.println("Monthly_Income :" + obj.getIncome());
        System.out.println("Employee_Name  :" + obj2.getName());
        System.out.println("Monthly_Income :" + obj2.getIncome());

    }
}
