package example.java;

public class Main {

	public static void main(String[] args) {

		Student annu = new Student();
		annu.rollNo = 1;
		annu.name = "anirudh";

		annu.address = new Address();
		annu.address.area = "krishnannagr";

		System.out.println(annu);

		Student siri = new Student();
		siri.address =new Address();
		siri.address.zip=22222;
		
		System.out.println(siri);
		System.out.println(annu);

		Student raki = annu;
		
		
		System.out.println(raki==annu);
		

	}

}
