class SquareByFact{
	public static void main(String cp[]){
		int n = Integer.parseInt(cp[0]);
		double s = 0.0;

		for(int i=1;i<=n;i++){
			long fact = 1;
			for(int j=1; j<=i;j++){
				fact*=j;
			}
			double res=(double)(i*i)/fact;
			s+=res;
		}

		System.out.println(s+" is the result");
	}

}