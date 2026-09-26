class swapNum{
	public static void main(String[] cp){
		int num1=Integer.parseInt(cp[0]);
		int num2=Integer.parseInt(cp[1]);
		
		num1+=num2;
		num2=num1-num2;
		num1-=num2;
		System.out.println(num1);
		System.out.println(num2);
		}
}