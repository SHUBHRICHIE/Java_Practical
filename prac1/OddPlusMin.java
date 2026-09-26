class OddPlusMin{
	public static void main(String cp[]){
		int n = Integer.parseInt(cp[0]);
		int s=0;
		int sign=1;

		for(int i=1; i<=n ; i+=2){
			s+=sign*i;
			sign*=-1;
		}
		System.out.println( s+" is the answer");
	}
}