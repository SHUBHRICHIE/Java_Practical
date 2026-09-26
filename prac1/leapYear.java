class leapYear{
	public static void main(String[] cp){

		int year=Integer.parseInt(cp[0]);

		if(((year%4==0) & (year%100!=100)) | (year%400==0)){
			System.out.println(year+" is a leap year ");
			}

		else{
			System.out.println(year+" is not a leap year ");
			}
		
		}
}