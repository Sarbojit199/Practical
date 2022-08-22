package Java;

public class nestedif {
	public static void main(String[] args) {
		
		String address = "kolkata, India";
		if(address.endsWith("India")){								//check if string end with India or not
			if(address.contains("Dunlop")) {						//no address
				System.out.println("Your city is Dunlop");
			}
			else if(address.contains("Newtown")) {
			}
			else {
				System.out.println(address.split(",")[1]); 			//it will take other part of comma if 1
			}
		}
		else{
			System.out.println("You are not living in India");
		}
	}
}
