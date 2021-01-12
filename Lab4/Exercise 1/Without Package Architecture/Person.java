
public class Person {

	String name;
	float age;
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name=name;
	}
	
	float getAge() {
		return age;
	}
	void setAge(float age)
	{
		if(age<=0)
			System.out.println("Age cannot be less than 0. Enter a valid age.");
		else
			this.age=age;
	}
}

