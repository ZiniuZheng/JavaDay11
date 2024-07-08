package polymorphic;
/*
 * 多态的优缺点
 * 		优点：可以提高可维护性（多态前提所保证的），提高代码的可扩展性
 * 		缺点：无法直接访问子类特有的成员
 */
public class PolymorphicDemo4 {

	public static void main(String[] args) {
		MiFactory factory = new MiFactory();
		factory.make(new NoteMi());
		factory.make(new RedMi());
		factory.make(new HeiMi());
		factory.make(new ZiMi());
	}
}

class MiFactory{
	/*public void make(NoteMi p) {
		p.call();
	}
	
	public void make(RedMi p) {
		p.call();
	}
	
	public void make(HeiMi p) {
		p.call();
	}*/
	
	public void make(Phone p) {
		p.call();
	}
}

interface Phone{
	public void call();
}

class NoteMi implements Phone{
	public void call() {
		System.out.println("NoteMi打电话");
	}
}

class RedMi implements Phone{
	public void call() {
		System.out.println("RedMi打电话");
	}
}

class HeiMi implements Phone{
	public void call() {
		System.out.println("HeiMi打电话");
	}
}

class ZiMi implements Phone{
	public void call() {
		System.out.println("ZiMi打电话");
	}
}
