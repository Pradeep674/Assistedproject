
class StudentInfo{
	int id;
	String name;

void display() {
	System.out.println(id+" "+name);
	}
}

public class Construtor {

public static void main(String[] args) {

	StudentInfo emp1=new StudentInfo();
	StudentInfo emp2=new StudentInfo();

	emp1.display();
	emp2.display();
	}
}