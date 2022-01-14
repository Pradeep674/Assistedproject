class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}
public class paraConstructor {
	public static void main(String[] args) {

		Std std1=new Std(12,"Minie");
		Std std2=new Std(11,"Reshmitha");
		std1.display();
		std2.display();
			}
}


