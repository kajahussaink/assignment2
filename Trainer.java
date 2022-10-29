package assignmentTwo;


public class Trainer {

	String name;
	String department;
	String email;
	int id;

	
	//String name;
	public Trainer(String nam, String depart, String ema, int n){
		
		this.name=nam;
		this.department=depart;
		this.email=ema;
		this.id=n;
		
		
	} 
	public void display() {
		System.out.println("Name - "+this.name);
		System.out.println("Department - "+this.department);
		System.out.println("Email - "+this.email);
		System.out.println("ID - "+this.id);

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trainer trainer1= new Trainer("Mukesh" ,"Testing","mukesh@gmail.com", 1);
		
		Trainer trainer2= new Trainer("Hitesh" ,"Dev","mukesh@gmail.com", 2);

		Trainer trainer3= new Trainer("Mukesh" ,"DevOps","mukesh@gmail.com", 3);
		
		System.out.println("Trainer 1 can teach Selenium");
		trainer1.display();
		System.out.println("Trainer 2 can teach Web Development");
		trainer2.display();
		System.out.println("Trainer 3 can teach DevOps.");
		trainer3.display();
	}

}
