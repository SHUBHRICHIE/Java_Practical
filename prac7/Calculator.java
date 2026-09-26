import java.awt.*;

class Calculator{
	public static void main(String[] args){
		Frame f=new Frame("calculator");

		f.setLayout(new BorderLayout());

		TextField t1=new TextField();
		t1.setFont(new Font("Arial", Font.PLAIN, 28));

		f.add(t1,BorderLayout.NORTH);

		Panel p1=new Panel();
		p1.setLayout(new GridLayout(4,4,5,5)); //4 rows, 4 columns, 5px spacing
		
		String[] Buttons={
			"7","8","9","%",
			"4","5","6","x",
			"3","2","1","-",
			"0",".","+","="
		};

		for(String label:Buttons){
			Button btn=new Button(label);
			btn.setFont(new Font("Arial", Font.BOLD, 20));
			
			if(label.equals("=")){
				btn.setBackground(new Color(247, 147, 43)); // orange color
			}
			
			p1.add(btn);
		}
		f.add(p1,BorderLayout.CENTER);
		
		f.setSize(350, 450);
		f.setVisible(true);
	}
}