
class Teacher {
    String name1;
    String name2;

    public void setName1(String name1,String name2) {
        this.name1 = name1;
        this.name2 = name2;
    }

    String getName1(){ return name1 ;
    }
    String getName2(){ return name2 ; }
}
public class Sample7 extends Teacher {
    public static void main(String[] args) {
        Sample7 obj = new Sample7 ();
        obj.setName1("Dhina","Naveen");

        System.out.println(obj.getName1());
        System.out.println(obj.getName2());
    }
}
