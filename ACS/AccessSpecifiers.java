package ACS;

public class AccessSpecifiers {
    void display()
    {
    	System.out.println("Access Specifier is Default here");
    }
	public static void main(String[] args) {
		AccessSpecifiers obj = new AccessSpecifiers(); 
		 obj.display(); 
		}
}
