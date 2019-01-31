
package inheritance;

class A
{
    void m1()
    {
        System.out.println("m1 A");
    }
}

class B extends A
{
    void m2()
    {
        System.out.println("m2 B");
    }
    
    void m3()
    {
        System.out.println("m3 B");
    }
}

class C extends B
{
    void m4()
    {
        System.out.println("m4 C");
    }
    
    @Override
    void m2()
    {
        System.out.println("m2 C class Implementation");
    }
}

public class Inheritance {

    public static void main(String[] args) {
        // TODO code application logic here
        
        C c = new C();
        c.m1();
        c.m2();
        c.m3();
        c.m4();
    }
    
}
