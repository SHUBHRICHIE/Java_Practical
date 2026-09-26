class primeNum{
	public static void main(String[] cp){
	int count=0;
	for(int i=2;i<=500;i++){
		if(isPrime(i)){
			System.out.println(i);
			}
		}
	}

	public static boolean isPrime(int num){
		if(num<=1){
			return false;}
		for(int i=2;i*i<=num;i++){
			if(num%i==0){
				return false;}
		}
		return true;
	}
}
