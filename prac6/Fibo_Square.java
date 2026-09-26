class SharedData{
	private int number;
	private boolean isGenerated=false;

	public synchronized void put(int num){
		while(isGenerated){
			try{
				wait();
			}catch(InterruptedException e){
				System.out.println(e);
			}
		}

		this.number=num;
	    System.out.print("Generated Fibonacci: " + num);
		isGenerated=true;
		notify();	
	}

	public synchronized void computeSquare(){
		while(!isGenerated){
			try{
				wait();
			}catch(InterruptedException e){
				System.out.println(e);
			}
		}
		
		int square=number*number;
		System.out.println(" Sqaure: "+square);
		isGenerated=false;
		notify();
	}
}

class FibonnaciThread extends Thread{
	private SharedData data;

	public FibonnaciThread(SharedData data){
		this.data=data;
	}

	public void run(){
		int a=0, b=1;

		while(a<=20){
			data.put(a);
			int next=a+b;
			a=b;
			b=next;
		}
	}
}

class SquareThread extends Thread{
	private SharedData data;

	public SquareThread(SharedData data){
		this.data=data;
	}

	public void run(){
		for(int i=0;i<8;i++){
			data.computeSquare();
		}
	}
}

class Main4{
	public static void main(String[] args){
		SharedData sharedData=new SharedData();

		FibonnaciThread t1=new FibonnaciThread(sharedData);
		SquareThread t2=new SquareThread(sharedData);

		t1.start();
		t2.start();
	} 
}


