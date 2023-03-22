
class Person {
    String person;
    int id;
    Person(String person,int id) {
        this.person=person;
        this.id=id;
    }
    String getPerson(){ return person; }
    int getId(){ return  id; }
}
class Employee extends Person {
     int workdays;
     Employee(String person , int id ,int workdays ) {
         super(person, id);
         this.workdays=workdays;
     }
     int getWorkdays(){ return workdays; }
}
public class Sample3 {
    public static void main(String[] args) {
        Employee obj = new Employee("Dhina",001,25);
        Employee obj1 = new Employee("Thangam",002,20);
        System.out.println("Name  :" + obj.getPerson() + " " + "Id :" + obj.getId() + " " + "Workdays :" + obj.getWorkdays());
        System.out.println("Name  :" + obj1.getPerson() + " " + "Id :" + obj1.getId() + " " + "Workdays :" + obj1.getWorkdays());
    }
}
