package person;

public class Test {
	public static void main(String[] args) {
	Person taro = new Person();
	taro.name="山田太郎";
	taro.age = 20;

	System.out.println(taro.name);
	System.out.println(taro.age);
	taro.talk();
	taro.walk();

	Robot aibo = new Robot();
	aibo.name = "aibo";
	aibo.talk();
	aibo.walk();
	aibo.run();

	Robot asimo = new Robot();
	asimo.name = "asimo";
	asimo.talk();
	asimo.walk();
	asimo.run();

	Robot pepper = new Robot();
	pepper.name = "pepper";
	pepper.talk();
	pepper.walk();
	pepper.run();

	}
}
