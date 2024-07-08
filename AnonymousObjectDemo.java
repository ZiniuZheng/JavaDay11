package anonymous;
/*
 * 匿名对象：没有名字的对象
 * 匿名对象的应用场景：
 * 		当方法只调用一次的时候可以使用匿名对象
 * 		可以当作参数进行传递，但是无法在传参之前做其他的事情
 * 
 * 注意：匿名对象可以调用成员变量并赋值，但是赋值并没有意义
 */
public class AnonymousObjectDemo {

	public static void main(String[] args) {
		Student s = new Student();
		s.study();
		s.study();
		s.study();
		
		new Student().study(); //匿名对象，没有变量引用的对象
		new Student().study();
		new Student().study();
		new Student().study();
		
		new Student().age = 18; //可以赋值，但是赋值没有意义
		System.out.println(new Student().age);
		
		s.age = 18;
		s.name = "张三";
		method(s);
		method(new Student());
	}
	
	public static void method(Student s) {
		System.out.println(s.name + "---" + s.age);
	}

}

class Student{
	String name;
	int age;
	
	public void study() {
		System.out.println("好好学习，高薪就业");
	}
}
