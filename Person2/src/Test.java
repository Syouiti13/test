
public class Test {

	public static void main(String[] args) {
		Person taro = new Person();
		taro.name="saburo";
		taro.age=0;
		System.out.println(taro.name);
		System.out.println(taro.age);

		Person hanako = new Person("hanako",17);
		System.out.println(hanako.name);
		System.out.println(hanako.age);

		Person nasi = new Person("名前なし",25);
		System.out.println(nasi.name);
		System.out.println(nasi.age);

	}

}
