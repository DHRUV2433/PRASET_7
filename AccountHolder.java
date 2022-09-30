//This program is run by Dhruv Vekariya(21CE152)
public class AccountHolder {

	private int age;
	private String name;
	private int experience;
	private int salary;
	private String citizenship;
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public int getExperience() {
		return experience;
	}
	public int getSalary() {
		return salary;
	}
	public String getCitizenship() {
		return citizenship;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "AccountHolder age= " + age +", Name= " + name + ", experience=" + experience+" salary=" + salary + ", citizen=" + citizenship ;
	}
}
