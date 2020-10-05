package example.java;

public class Student {

	public int rollNo;
	public String name;
	public Address address;

	public String toString() {
		return rollNo+":"+name+":"+address.hNo+":"+address.area+":"+address.zip;
	}
}
