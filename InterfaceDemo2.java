package Interface;
/*
 * 接口的成员特点：
 * 		只能有抽象方法
 * 		只能有常量
 * 		默认使用public&abstract修饰方法
 * 		只能使用public&abstract修饰方法
 * 		默认使用public static final来修饰成员变量
 * 
 * 建议：建议大家手动的给上默认修饰符
 * 
 * 注意：
 * 		接口不能创建对象（不能实例化）
 * 		类与接口的关系是实现关系，一个类实现一个接口必须实现它的所有的方法
 */
public class InterfaceDemo2 {

	public static void main(String[] args) {
		Animal a = new Cat();
		int n = Animal.num;
		System.out.println(n);
	}
}

interface Animal{
	public static final int num = 10;
	public abstract void eat();
}

class Cat implements Animal{
	public void eat() {
	}
}
