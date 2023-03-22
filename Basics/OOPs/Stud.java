class Person {
    private String Name;
    private int Age;

    public Person(String Name, int Age) {
        this.Name = Name;
        this.Age = Age;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }
}

    class Student extends Person {
        private static String Id;

        public Student(String Name, int Age, String Id) {
            super(Name, Age);
            this.Id = Id;
        }

        public String getId() {
            return Id;
        }
    }


    public class Stud {
        public static void main(String[] args) {
            Person s1 = new Person("Dhina", 21);
            Student s2 = new Student("Sathiya", 24, "543");

            System.out.println(s1.getName() + " " + s1.getAge());
            System.out.println(s2.getName() + " " + s2.getAge() + " " + s2.getId());
        }
    }
