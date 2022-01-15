package javadeepdive;



public class AccessSpecifier2 {
	public static void main(String[] args) {
	//private
	System.out.println("Access Specifier is private here");
	AccessSpecifier2 obj = new AccessSpecifier2(); 
	 //trying to access private method of another class 
	 obj.display();
	}

	private void display() {
		// TODO Auto-generated method stub
		
	}
}