import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;

public class RegistrationFormAWT extends Frame implements ActionListener {
    TextField tfName, tfFatherName, tfAge;
    CheckboxGroup cbgGender;
    Checkbox cbMale, cbFemale;
    Choice choiceCourse;
    Checkbox cbDrawing, cbSinging, cbMusic, cbOthers;
    TextArea taAddress;
    Button btnSave, btnClear;

    public RegistrationFormAWT() {
        setTitle("Registration Form");
        setSize(500, 650);
        setLayout(new GridBagLayout());
        setBackground(new Color(44, 53, 64)); 
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        Font labelFont = new Font("Arial", Font.BOLD, 14);
        Color textColor = Color.WHITE;

        Label lblTitle = new Label("Registration Form", Label.CENTER);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 20));
        lblTitle.setForeground(Color.YELLOW);
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 2;
        add(lblTitle, gbc);
        gbc.gridwidth = 1; // Reset gridwidth

        Label lblName = new Label("Name");
        lblName.setFont(labelFont); lblName.setForeground(textColor);
        gbc.gridx = 0; gbc.gridy = 1; add(lblName, gbc);
        tfName = new TextField("Ram", 30);
        gbc.gridx = 1; gbc.gridy = 1; add(tfName, gbc);

        Label lblFather = new Label("Father Name");
        lblFather.setFont(labelFont); lblFather.setForeground(textColor);
        gbc.gridx = 0; gbc.gridy = 2; add(lblFather, gbc);
        tfFatherName = new TextField("Kumar", 30);
        gbc.gridx = 1; gbc.gridy = 2; add(tfFatherName, gbc);

        Label lblAge = new Label("Age");
        lblAge.setFont(labelFont); lblAge.setForeground(textColor);
        gbc.gridx = 0; gbc.gridy = 3; add(lblAge, gbc);
        tfAge = new TextField("23", 30);
        gbc.gridx = 1; gbc.gridy = 3; add(tfAge, gbc);

        Label lblGender = new Label("Gender");
        lblGender.setFont(labelFont); lblGender.setForeground(textColor);
        gbc.gridx = 0; gbc.gridy = 4; add(lblGender, gbc);
        
        Panel panelGender = new Panel(new FlowLayout(FlowLayout.LEFT));
        cbgGender = new CheckboxGroup();
        cbMale = new Checkbox("Male", cbgGender, true);
        cbMale.setForeground(textColor);
        cbFemale = new Checkbox("Female", cbgGender, false);
        cbFemale.setForeground(textColor);
        panelGender.add(cbMale); panelGender.add(cbFemale);
        gbc.gridx = 1; gbc.gridy = 4; add(panelGender, gbc);

        Label lblCourse = new Label("Course");
        lblCourse.setFont(labelFont); lblCourse.setForeground(textColor);
        gbc.gridx = 0; gbc.gridy = 5; add(lblCourse, gbc);
        
        choiceCourse = new Choice();
        choiceCourse.add("Java");
        choiceCourse.add("Python");
        choiceCourse.add("C++");
        gbc.gridx = 1; gbc.gridy = 5; add(choiceCourse, gbc);

        Label lblHobbies = new Label("Hobbies");
        lblHobbies.setFont(labelFont); lblHobbies.setForeground(textColor);
        gbc.gridx = 0; gbc.gridy = 6; add(lblHobbies, gbc);
        
        Panel panelHobbies = new Panel(new FlowLayout(FlowLayout.LEFT));
        cbDrawing = new Checkbox("Drawing", true); cbDrawing.setForeground(textColor);
        cbSinging = new Checkbox("Singing"); cbSinging.setForeground(textColor);
        cbMusic = new Checkbox("Music"); cbMusic.setForeground(textColor);
        cbOthers = new Checkbox("Others"); cbOthers.setForeground(textColor);
        panelHobbies.add(cbDrawing); panelHobbies.add(cbSinging); 
        panelHobbies.add(cbMusic); panelHobbies.add(cbOthers);
        gbc.gridx = 1; gbc.gridy = 6; add(panelHobbies, gbc);

        Label lblAddress = new Label("Address");
        lblAddress.setFont(labelFont); lblAddress.setForeground(textColor);
        gbc.gridx = 0; gbc.gridy = 7; add(lblAddress, gbc);
        
        taAddress = new TextArea("234 - 1d First Street,\nAnna Main Road\nNamakkal", 4, 30, TextArea.SCROLLBARS_VERTICAL_ONLY);
        gbc.gridx = 1; gbc.gridy = 7; add(taAddress, gbc);

        Panel panelButtons = new Panel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        btnSave = new Button("Save Details");
        btnSave.setBackground(Color.BLUE); btnSave.setForeground(Color.WHITE);
        
        btnClear = new Button("Clear All");
        btnClear.setBackground(Color.RED); btnClear.setForeground(Color.WHITE);
        
        panelButtons.add(btnSave); panelButtons.add(btnClear);
        gbc.gridx = 0; gbc.gridy = 8; gbc.gridwidth = 2;
        add(panelButtons, gbc);

        btnSave.addActionListener(this);
        btnClear.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSave) {
            String name = tfName.getText();
            String fatherName = tfFatherName.getText();
            String age = tfAge.getText();
            String gender = cbgGender.getSelectedCheckbox().getLabel();
            String course = choiceCourse.getSelectedItem();
            
            StringBuilder hobbies = new StringBuilder();
            if (cbDrawing.getState()) hobbies.append("Drawing ");
            if (cbSinging.getState()) hobbies.append("Singing ");
            if (cbMusic.getState()) hobbies.append("Music ");
            if (cbOthers.getState()) hobbies.append("Others ");
            String selectedHobbies = hobbies.toString().trim().replace(" ", ", ");

            String address = taAddress.getText();

            System.out.println("\n=== Form Inputs Received ===");
            System.out.println("Name        : " + name);
            System.out.println("Father Name : " + fatherName);
            System.out.println("Age         : " + age);
            System.out.println("Gender      : " + gender);
            System.out.println("Course      : " + course);
            System.out.println("Hobbies     : " + (selectedHobbies.isEmpty() ? "None" : selectedHobbies));
            System.out.println("Address     : \n" + address);

            try (FileWriter writer = new FileWriter("registration_output.txt")) {
                writer.write("Registration Record Data:\n");
                writer.write("Name: " + name + "\n");
                writer.write("Father Name: " + fatherName + "\n");
                writer.write("Age: " + age + "\n");
                writer.write("Gender: " + gender + "\n");
                writer.write("Course: " + course + "\n");
                writer.write("Hobbies: " + (selectedHobbies.isEmpty() ? "None" : selectedHobbies) + "\n");
                writer.write("Address:\n" + address + "\n");
                System.out.println("-> Success: Saved to 'registration_output.txt'");
            } catch (IOException ex) {
                System.out.println("Error saving file: " + ex.getMessage());
            }

        } else if (e.getSource() == btnClear) {
            tfName.setText("");
            tfFatherName.setText("");
            tfAge.setText("");
            cbgGender.setSelectedCheckbox(cbMale);
            choiceCourse.select(0);
            cbDrawing.setState(false);
            cbSinging.setState(false);
            cbMusic.setState(false);
            cbOthers.setState(false);
            taAddress.setText("");
        }
    }

    public static void main(String[] args) {
        new RegistrationFormAWT();
    }
}