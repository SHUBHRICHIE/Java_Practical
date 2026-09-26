import java.awt.*;

class RegistrationForm{
	public static void main(String[] args){
		Frame f=new Frame("Registration");

		f.setLayout(null);
		f.setBackground(new Color(44,53,64)); 

		Label l0 = new Label("Registration Form");
        l0.setBounds(40, 50, 300, 35);
		l0.setForeground(Color.YELLOW);

		Label l1=new Label("Name");
		l1.setBounds(40,100,100,30);
		l1.setForeground(Color.WHITE);
		TextField t1=new TextField("Ram");
		t1.setBounds(180,100,380,30);

		Label l2=new Label("Father Name");
		l2.setBounds(40,150,100,30);
		l2.setForeground(Color.WHITE);
		TextField t2=new TextField("Kumar");
		t2.setBounds(180,150,380,30);
	
		Label l3=new Label("Age");
		l3.setForeground(Color.WHITE);
		l3.setBounds(40,200,100,30);
		TextField t3=new TextField("23");
		t3.setBounds(180,200,380,30);

		Label Gender=new Label("Gender");
		Gender.setForeground(Color.WHITE);
		Gender.setBounds(40,250,100,30);
		CheckboxGroup genderGroup=new CheckboxGroup();
		Checkbox Male=new Checkbox("Male",genderGroup, true);
		Male.setBounds(180,250,80,30);
		Male.setForeground(Color.WHITE);
		Checkbox Female=new Checkbox("Female",genderGroup,false);
		Female.setBounds(280,250,80,30);
		Female.setForeground(Color.WHITE);	

		Label Course=new Label("Course");
		Course.setForeground(Color.WHITE);
		Course.setBounds(40,300,100,30);
		Choice courseChoice=new Choice();
		courseChoice.add("Java");
		courseChoice.add("Python");
		courseChoice.add("C++");
		courseChoice.setBounds(180,300,380,30);

		Label Hobbies=new Label("Hobbies");
		Hobbies.setBounds(40,350,100,30);
		Hobbies.setForeground(Color.WHITE);
		Checkbox drawing=new Checkbox("Drawing",true);
		drawing.setBounds(180,350,80,30);
		drawing.setForeground(Color.WHITE);
		Checkbox singing=new Checkbox("Singing");
		singing.setBounds(270,350,80,30);
		singing.setForeground(Color.WHITE);
		Checkbox music=new Checkbox("Music");
		music.setBounds(360,350,70,30);
		music.setForeground(Color.WHITE);
		Checkbox others=new Checkbox("Others");
		others.setBounds(440,350,70,30);
		others.setForeground(Color.WHITE);

		Label address=new Label("Address");
		address.setBounds(40,400,100,30);
		address.setForeground(Color.WHITE);
		TextArea ta=new TextArea("234 - 1d First Street,\nAnna Main Road\nNamakkal", 3, 30, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBounds(180,400,380,110);

		Button b1=new Button("Save Details");
		b1.setBounds(180,540,130,35);
		b1.setBackground(Color.BLUE);
		b1.setForeground(Color.WHITE);

		Button b2=new Button("Clear All");
		b2.setBounds(330,540,130,35);
		b2.setBackground(Color.RED);
		b2.setForeground(Color.WHITE);

		f.add(l0);
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.add(Gender);
		f.add(Male);
		f.add(Female);
		f.add(Course);
		f.add(courseChoice);
		f.add(Hobbies);
		f.add(drawing);
		f.add(singing);
		f.add(music);
		f.add(others);
		f.add(address);
		f.add(ta);
		f.add(b1);
		f.add(b2);

		f.setSize(200,300);
		f.setVisible(true);
	}
}