package Interface;

/*
 * 类与类：继承关系，单一继承，多层继承
 * 类与接口：实现关系，多实现
 * 接口与接口的关系：继承关系，多继承
 */
public class InterfaceDemo3 {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.function();
		d.method();
	}
}

interface InterA{
	public abstract void method();
}

interface InterB extends InterA{
	public abstract void function();
}

interface InterC extends InterA, InterB{
	
}

class Demo implements InterA, InterB, InterC{

	@Override
	public void function() {
		System.out.println("函数");
	}

	@Override
	public void method() {
		System.out.println("方法");
	}
	
}
