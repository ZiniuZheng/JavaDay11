package polymorphic;
/*
 * 多态的成员特点：
 * 		成员变量   编译时看的是左边，运行时看的也是左边
 * 		成员方法   编译时看的是左边，运行时看的是右边
 * 		静态方法   编译时看的是左边，运行时看的也是左边
 * 
 * 编译时看的都是左边，运行时成员方法看的是右边，其他（成员变量和静态方法）看的都是左边
 */
public class PolymorphicDemo2 {

	public static void main(String[] args) {
		Dad d = new Kid();
		//成员变量
		System.out.println(d.num);
		//成员方法
		d.method();
		//静态方法
		d.function(); //使用变量去调用静态方法，其实相当于用变量类型的类名去调用
	}
}

class Dad{
	int num = 20;
	
	public void method() {
		System.out.println("我是父类方法");
	}
	
	public static void function() {
		System.out.println("我是父类静态方法");
	}
}

class Kid extends Dad{
	int num = 10;
	
	public void method() {
		System.out.println("我是子类方法");
	}
	
	public static void function() {
		System.out.println("我是子类静态方法");
	}
}
