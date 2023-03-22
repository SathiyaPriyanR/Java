class ExSample2 {
        private String ex1() {
            String a = "hello";
            return a;
        }
         public String ex2() {

            return ex1();
        }
    }
    public class ExSample1
    {
        public static void main(String[] args) {
            ExSample2 obj = new ExSample2();
            System.out.println(obj.ex2());
        }
    }


