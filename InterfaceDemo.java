package Interface;
/*
 * Java语言的继承是单一继承，一个子类只能有一个父类（一个儿子只能有一个亲爹）
 * Java语言给我们提供了一种机制，用于处理继承单一的局限性的，接口
 * 
 * 接口：接口是一个比抽象类还抽象的类，接口里所有的方法全是抽象方法，接口和类的关系是实现，implements
 * interface
 * 
 * 格式：
 * 		interface 接口名{
 * 		
 * 		}
 */
public class InterfaceDemo {

	public static void main(String[] args) {
		BillGates gates = new BillGates();
		gates.code();
	}
}

interface Boss{
	public void manage();
}

interface Programmer{
	public void code();
}

//比尔盖茨
class BillGates implements Boss,Programmer{

	@Override
	public void code() {
		System.out.println("打代码");
	}

	@Override
	public void manage() {
		System.out.println("管理公司");
	}
}
