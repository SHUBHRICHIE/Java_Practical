class StrongNumber{
	public static void main(String cp[]){
		int original = Integer.parseInt(cp[0]);
		int temp = original;
		int sum=0;
		
		while(temp!=0){
			int num = temp % 10;
			int fact = 1;

			for(int i = 1;i<=num; i++){
				fact*=i;
			}

			sum+=fact;
			temp/=10;
		}

		if(sum==original){
			System.out.println("Its Strong number");
		}
		else{
			System.out.println("Its not a Strong number");
		}
		
	}




}