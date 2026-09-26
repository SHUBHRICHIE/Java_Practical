import java.awt.*;

class LoginForm{
	public static void main(String[] args){
		Frame f=new Frame("Login");

		f.setLayout(null);
	
		Label l1=new Label("User");
		l1.setBounds(40,60,80,30); //(x,y,width,height)
		Label l2=new Label("Password");
		l2.setBounds(40,110,80,30);
		
		TextField t1=new TextField();
		t1.setBounds(130,60,200,30);
		TextField t2=new TextField();
		t2.setEchoChar('*');
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

		f.setSize(380, 250);
		f.setVisible(true);
	}
}