
package inheritance;

class Parent{
    public Parent() {
        System.out.println("Parent class 0 - arg constructor");   
    }
}

class Child extends Parent{
    
     /* 
    //Compiler generates that code 
        public Child() {
            super();
        }
    */
}
public class SuperClassConstructor_1 {

    public static void main(String[] args) {
        new Child();
    } 
}
