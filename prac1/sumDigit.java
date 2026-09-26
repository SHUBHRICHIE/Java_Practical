class sumDigit{
	public static void main(String[] cp){
	int digit=Integer.parseInt(cp[0]);
	int temp=digit;
	int sum=0;
	int rem=0;	
	while(temp!=0){
		rem=temp%10;
		sum+=rem;
		temp=temp/10;
		}
		
	System.out.println(sum);
	}
}