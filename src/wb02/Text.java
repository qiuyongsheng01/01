package wb02;

public class Text {
	public static void main(String[] args) {
		ObjectFactory factory=new ObjectFactory();
		SayHello sayHello=factory.createSayHello();
		sayHello.setArg0(new User());
	}
}
