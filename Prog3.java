//hierarchical inheritance
class Parent{
	public void sum(int x,int y){
		System.out.println("Sum="+(x+y));
	}
} 
class Child1 extends Parent{
	public void sub(int x,int y){
		System.out.println("Sub="+(x-y));
	}
}
class Child2 extends Parent{
	public void Multi(int x,int y){
		System.out.println("Multi="+(x*y));
	}
}


class Prog3{
public static void main(String arg[]){
	Child1 c1=new Child1();
	c1.sum(10,2);
	c1.sub(10,2);
	
	Child2 c2=new Child2();
	c2.sum(20,10);
	c2.Multi(20,10);
}
}