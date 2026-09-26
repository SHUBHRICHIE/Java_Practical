import java.util.Scanner;

class PassCheck{
	public static void main(String[] cp){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the password to check its Strength: ");
		String pass = sc.nextLine();
		boolean hasUpper= false;
		boolean hasLower= false;
		boolean hasSpecial= false;
		boolean hasDigit= false;

		for(int i=0;i<pass.length();i++){
			char c = pass.charAt(i);
			
			if(Character.isUpperCase(c)){
				hasUpper = true;
			}
			else if(Character.isLowerCase(c)){
				hasLower = true;
			}
			else if(Character.isDigit(c)){
				hasDigit = true;
			}else if(c!=' '){
				hasSpecial = true;
			}
		}
		if (pass.length()>=8 && hasUpper && hasLower && hasDigit && hasSpecial){
			System.out.println("String Password!");
		}else{
			StringBuilder message = new StringBuilder("Weak Password, You are missing: ");
			
			if(pass.length()<8) message.append("at least 8 characters, ");
			if(!hasUpper) message.append("an uppercase letter, ");
			if(!hasLower) message.append("an lowercase letter, ");
			if(!hasDigit) message.append("an Digit, ");
			if(!hasSpecial) message.append("an Special character, ");
			
			message.setLength(message.length()-2);
			
			System.out.println(message.toString());
			
		}
		sc.close();	
	}
}