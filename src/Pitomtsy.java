
public class Pitomtsy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat baks = new Cat();
		baks.owner = new  Woman();
		Dog jack = new Dog();
		jack.owner = new Woman();
		Fish ann = new Fish();
		ann.owner = new Woman();
	}
	public static class Cat {
		public Woman owner;
	}
	public static class Dog {
		public Woman owner;
	}
	public static class Fish {
		public Woman owner;
	}
	public static class Woman {
	}
}
