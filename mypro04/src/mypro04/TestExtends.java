package mypro04;
/**
 * ≤‚ ‘ºÃ≥–
 * @author Small
 *
 */
public class TestExtends {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.name = "nancy";
		stu.height = 170;
		System.out.println(stu instanceof Person);            //true
		System.out.println(stu instanceof Student);           //true
		System.out.println(new Person() instanceof Student);  //false
	}

}
class Person{
	String name;
	int height;
	
	public void rest() {
		System.out.println("–›œ¢“ªª·");
	}
}

class Student extends Person{
	String major;
	public void study() {
		System.out.println("study a moment.");
	}
}
