import java.awt.*;
import java.awt.event.*;

class LoginForm{
	public static void main(String[] args){
		Frame f=new Frame("Login");

		f.setLayout(null);
	
		Label l1=new Label("User");
		l1.setBounds(40,60,80,30); //(x,y,width,height)
		Label l2=new Label("Password");
		l2.setBounds(40,110,80,30);
		Label l3=new Label(""); //small label to show error alerts
		l3.setBounds(40,210,300,30);
		
		TextField t1=new TextField();
		t1.setBounds(130,60,200,30);
		TextField t2=new TextField();
		//t2.setEchoChar('*');
		t2.setBounds(130,110,200,30);
	
		Button b1=new Button("Login");
		b1.setBounds(40,170,100,35);
		Button b2=new Button("Register");
		b2.setBounds(230,170,100,35);

		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(t2);
		f.add(b1);
		f.add(b2);	
		f.add(l3);

		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String username=t1.getText().trim();
				String password=t2.getText().trim();

				if(!username.endsWith("@gmail.com")){
					l3.setForeground(Color.RED);
					l3.setText("Error: User must enter a valid gmail id");
					return;
				}
				if(password.length()<8){
					l3.setForeground(Color.RED);
					l3.setText("Error: Password should be minimum 8 characters");
					return;
				}
				if(username=="name@gmail.com" && password=="pass12345"){
					l3.setText("Login Successful");
					l3.setForeground(Color.GREEN);
				}else{
					l3.setText("Login UnSuccessful");
					l3.setForeground(Color.BLUE);
				}
				
			}
		});

		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				l3.setText("Regsitered...");
			}
		});

		f.setSize(380, 250);
		f.setVisible(true);

		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			} 
		});
	}
}