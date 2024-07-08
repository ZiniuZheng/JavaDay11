package polymorphic;
/*
 * 多态的前提：
 * 	子父类的继承关系
 * 	方法的重写
 * 	父类引用指向子类对象
 * 
 * 动态绑定：运行期间调用的方法，是根据其具体的类型
 */
public class PolymorphicDemo {

	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();
		//父类引用 Animal a
		//指向		=
		//子类对象 new Cat()
		
		Maoke a = new Cat();
		a.eat();
	}
}

interface Animal{
	public void eat();
}

abstract class Maoke{
	public void eat() {
		System.out.println("吃东西");
	}
}

class Cat extends Maoke{
	
}
