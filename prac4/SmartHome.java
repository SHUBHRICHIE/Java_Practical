import java.util.Scanner;

class Device{
	public int  deviceId;
	public String deviceName;
	public boolean powerStatus;  
	
	public Device(int deviceId, String deviceName, boolean powerStatus) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.powerStatus = powerStatus;
    	}
	
	public Device() {
        this.deviceId = 0;
        this.deviceName = "Unknown";
        this.powerStatus = false;
    	}
	
	public void powerswitch(boolean power){
		powerStatus=power;	
	}
	
	public void displayDeviceInfo(){
		System.out.println("Device name is :" + deviceName);
		System.out.println("Device id is :" + deviceId);
		System.out.println("Device Power Status  is :" + powerStatus);
	}
		
}

class SmartLight extends Device{
	public int brightnessLevel;
	public int colorMode;
	
	public SmartLight(int deviceId, String deviceName , boolean powerStatus, int brightnessLevel, int colorMode){
			super(deviceId , deviceName, powerStatus);
			this.brightnessLevel=brightnessLevel;
			this.colorMode=colorMode;
		}

	public SmartLight(){
			super();
			this.brightnessLevel=0;
			this.colorMode=1;
		}
	
	
	public void BrightnessChange(int level){
		brightnessLevel=level;
	}
	
	public void displayDeviceInfo(){
		super.displayDeviceInfo();
		System.out.println("Device brightness leve is :" + brightnessLevel);
		System.out.println("Device color mode is :" + colorMode);
	}	
}

class SmartHome extends SmartLight{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		SmartLight light1 = new SmartLight();
		light1.displayDeviceInfo();
	
		SmartLight light2 = new SmartLight(101,"TubeLight", true , 5 , 2);
		light2.displayDeviceInfo();
		
		sc.close();
	}	
}
