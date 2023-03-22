

package com.mycompany.library;


class Library extends Main {
    String user;
    int books;
    String remmsg;
}    
class Main {
    public static void main(String[] args) {
        Library student = new Library();
        student.user = "Dhina";
        student.books = 60;
        student.remmsg = "Happy to see you again";
        System.out.println(student.user);
        System.out.println(student.books);
        System.out.println(student.remmsg);
        
        
        
        
    
    }

}


