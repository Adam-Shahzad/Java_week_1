package files;

public class people {
	public String name;
	public int age;
	public String job_title;

	public people(String name, int age, String job_title) {
		super();
		this.name = name;
		this.age = age;
		this.job_title = job_title;
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

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	@Override
	public String toString() {
		return "people [name: " + name + ", age: " + age + ", job title:" + job_title + "]    " + "\n";
	}

}
