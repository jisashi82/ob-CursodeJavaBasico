package io.codemalone33.tema4;

public class AppMain {

	public static void main(String[] args) {

		SmartPhone phone = new SmartPhone("Motorola", "negro", 2019, "Korea", 5000, true, true, 3990, 180, "Telcel");
		SmartWatch watch = new SmartWatch("Huawei", "Azul", 2021, "Taiwan", 1000, false, true, 1499.34,91 ,true, true);
		
		System.out.println(phone.toString());
		System.out.println(watch.toString());

	}

}
