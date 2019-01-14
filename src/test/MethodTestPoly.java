package test;

public class MethodTestPoly {
	
	public static void main(String[] args) {
		/*Animal a = new Fish();
		a.eat(); //under water*/
		
		/*Animal a = new Duck();
		((Fish)a).swim(); //Class cast Exception*/
		
		/*Bird b = new Duck();
		b.breathe(); //with nose with beak*/
		
		/*Animal a = null;
		Bird b = new Bird();
		b.fly(a); //Compilation Error */
		
		/*Animal a = new Fish();
		((Fish)a).eat(5); //under water eat a lot*/
		
		/*Bird b = new Eagle();
		Eagle e = null;
		b.fly(e); //fly to escape */
		
		/*Animal a = new Duck();
		a.fly(); //Compilation Error */
		
		/*Bird b = new Duck();
		b.fly(); //with eyes flap wings very low*/
		
		/*Duck d = new Duck();
		d.quack(d); //with nose with beak quack-quack*/
		
		/*Bird b = new Duck();
		((Duck)b).swim(); //with eyes flap wings flap feet*/
		
		/*Fish f = new Animal();
		f.swim(); //Compilation Error */
		
		/*Eagle e = new Eagle();
		e.fly(e); //with nose with beak race ahead*/
	}

}

class Animal {
	public void see() {
		System.out.println("with eyes");
	}

	public void eat() {
		System.out.println("with mouth");
	}

	public void breathe() {
		System.out.println("with nose");
	}
}

class Human
{
	
}

class Faculty extends Human {
	String name;
	int age;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Faculty) {
			Faculty tmpObj = (Faculty) obj;
			if(tmpObj.getAge() == this.getAge() && tmpObj.getName().equals(this.getName()))
			{
				return (true && super.equals(obj));
			}
		}
		return false;
	}
	
	
}
class Fish extends Animal {
	public void eat() {
		System.out.println("under water");
	}

	public void eat(int x) {
		eat();
		System.out.println("eat a lot");
	}

	public void swim() {
		System.out.println("streamline");
	}
}

class Bird extends Animal {
	public void breathe() {
		super.breathe();
		System.out.println("with beak");
	}

	public void fly(Bird b) {
		System.out.println("form a line");
	}

	public void fly() {
		super.see();
		System.out.println("flap wings");
	}

	public void sleep() {
		System.out.println("close eyes");
	}
}

class Eagle extends Bird {
	public void fly(Eagle e) {
		super.breathe();
		System.out.println("race ahead");
	}

	public void fly(Bird b) {
		System.out.println("fly to escape");
	}

	public void see() {
		super.see();
		System.out.println("far far away");
	}
}

class Duck extends Bird {
	public void fly() {
		super.fly();
		System.out.println("very low");
	}

	public void quack(Bird b) {
		super.breathe();
		System.out.println("quack-quack");
	}

	public void swim() {
		super.fly();
		System.out.println("flap feet");
	}
}