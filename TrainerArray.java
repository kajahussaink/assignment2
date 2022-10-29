package assignmentTwo;

public class TrainerArray {
	
	String name;
	String department;
	String email;
	int id;
	
	public TrainerArray(String nam, String depart, String ema, int n){
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
		
		TrainerArray[] trainer= new TrainerArray[3];
		
		trainer[0]=new TrainerArray("Mukesh" ,"Testing","mukesh@gmail.com", 1);
		trainer[1]=new TrainerArray("Hitesh" ,"Dev","mukesh@gmail.com", 2);
		trainer[2]=new TrainerArray("Mukesh" ,"DevOps","mukesh@gmail.com", 3);
		
		for (int i = 0; i < 3; ++i) {
			trainer[i].display();
		}
		
		
 
	}

}
