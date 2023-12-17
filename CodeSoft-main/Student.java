package StudentManagementSystem;

class Student {
    private String name;
    private int id;
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private int age;
    private String course;

    public Student(String name, int id, int age, String course) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.course = course;
    }

    public void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    public void updateDetails(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
        System.out.println("Student details updated successfully!");
    }
}

