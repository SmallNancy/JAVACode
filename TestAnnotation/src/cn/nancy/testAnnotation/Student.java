package cn.nancy.testAnnotation;


@Table("s_student")
public class Student {
	@SFiled(columnName = "id",type = "int",length = 10)
	private int id;
	@SFiled(columnName = "Sname",type = "varchar",length = 10)
	private String name;
	@SFiled(columnName = "age",type = "int",length = 10)
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
