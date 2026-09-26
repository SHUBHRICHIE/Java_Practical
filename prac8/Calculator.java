import java.awt.*;
import java.awt.event.*;

class Calculator{

	private static double firstNumber=0;
	private static String operator="";
	private static boolean isOperatorClicked=false;

	public static void main(String[] args){
		Frame f=new Frame("calculator");

		f.setLayout(new BorderLayout());

		TextField t1=new TextField("0");
		t1.setFont(new Font("Arial", Font.PLAIN, 28));
		t1.setEditable(false);
		f.add(t1,BorderLayout.NORTH);

		Panel p1=new Panel();
		p1.setLayout(new GridLayout(4,4,5,5)); //4 rows, 4 columns, 5px spacing
		
		String[] Buttons={
			"7","8","9","%",
			"4","5","6","x",
			"1","2","3","-",
			"0",".","+","="
		};

		
		ActionListener buttonListener=new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String label=e.getActionCommand();
				
				if((label.charAt(0)>='0' && label.charAt(0)<='9') || label.equals(".")){
					if(isOperatorClicked || t1.getText().equals("0")){
						t1.setText("");
						isOperatorClicked=false;
					}
					t1.setText(t1.getText()+label);
				}

				else if(label.equals("=")){
					double secondNumber=Double.parseDouble(t1.getText());
					double result=0;
	
					if(operator.equals("+"))result=firstNumber+secondNumber;
					else if(operator.equals("-"))result=firstNumber-secondNumber;
					else if(operator.equals("x"))result=firstNumber*secondNumber;
					else if(operator.equals("%")){
						if(secondNumber != 0 ) result=firstNumber/secondNumber;
						else{
							t1.setText("Error");
							return;
						}
					}
					if(result % 1==0){
						t1.setText(String.valueOf((int)result));
					}else{
						t1.setText(String.valueOf(result));
					}
					operator="";
				}

				else{
					firstNumber=Double.parseDouble(t1.getText());
					operator=label;
					isOperatorClicked=true;
				}
			}
		};


		for(String label:Buttons){
			Button btn=new Button(label);
			btn.setFont(new Font("Arial", Font.BOLD, 20));
			
			if(label.equals("=")){
				btn.setBackground(new Color(247, 147, 43)); // orange color
			}
			btn.addActionListener(buttonListener);
			p1.add(btn);
		}
		f.add(p1,BorderLayout.CENTER);
		
		f.setSize(350, 450);
		f.setVisible(true);

		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
}