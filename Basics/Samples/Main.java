public class Main {
    public static void main(String[] args) {

        String a = "JHON";
        String b = "peter";
        String c = "peter";
        String d = "hello world " + "         hello world ";
        String e = "dhina ad";
        String f = "dhina ad";
        System.out.println(a.equals(b));                  // using equals
        System.out.println(b.equalsIgnoreCase(c));        // equalsIgnoreCase
        System.out.println(c.compareTo(b));               // compareTo
        System.out.println(b.compareToIgnoreCase(c));     // compareToIgnoreCase
        System.out.println(a.concat(" " + b).concat(" " + c));  // concat
        System.out.println(c.toUpperCase());              // toUpperCase
        System.out.println(a.toLowerCase());              // toLowerCase
        System.out.println(b.length());                   // length
        System.out.println(c.substring(2,4));             // subString
        System.out.println(d.trim());                     // trim
        System.out.println(e.replace("a","d").replace("d","a"));  /// replace
    }
}