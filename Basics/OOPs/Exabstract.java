
package com.mycompany.exabstract;

 abstract class Sample1{
    
    abstract void samplemethod();
    
    void newmethod(){
        System.out.println("hello");
    }    
}

class Sample2 extends Sample1{
    @Override
    public void samplemethod(){
        System.out.println(" 'Example Abstract' ");
    }
}
public class Exabstract {

    public static void main(String[] args) {
        
        Sample2 obj = new Sample2();
        obj.samplemethod();
    }
}
