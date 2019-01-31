
package inheritance;

class parent{
    int a;
	public parent()
	{
		System.out.println("Parent class 0-argument Constructor.");
	}
        public parent(int a)
        {
            this.a = a;
        }
}
class SuperClassConstructor extends parent{
	public SuperClassConstructor()
	{
		this(10);
		System.out.println("Child class 0-argument Constructor");
	}
	
	public SuperClassConstructor(int i)
	{
		//super(); //optional by default first parent class 0- arg constructor is called in every child class constructor...
		System.out.println("Child class 1-argument Constructor");
	}
	public static void main(String[] args)
	{
		new SuperClassConstructor();
	}
}
