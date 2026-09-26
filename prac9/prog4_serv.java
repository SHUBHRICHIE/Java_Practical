import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

class GUIServer {
    private static DataOutputStream dout;
    private static TextArea chatArea;
    private static TextField inputField;

    public static void main(String[] args) {
        // 1. Build the GUI Layout (Runs instantly)
        Frame frame = new Frame("Server Chat");
        frame.setLayout(new BorderLayout());

        chatArea = new TextArea();
        chatArea.setEditable(false);
        frame.add(chatArea, BorderLayout.CENTER);

        Panel bottomPanel = new Panel(new BorderLayout());
        inputField = new TextField();
        Button btnSend = new Button("Send");
        
        bottomPanel.add(inputField, BorderLayout.CENTER);
        bottomPanel.add(btnSend, BorderLayout.EAST);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.setSize(400, 400);
        frame.setVisible(true);

        chatArea.append("Initializing GUI... You can type now!\nWaiting for network connection...\n");

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { System.exit(0); }
        });

        // 2. Action listener to handle button clicks and enter key presses
        ActionListener sendAction = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String msg = inputField.getText().trim();
                    if (!msg.isEmpty() && dout != null) {
                        dout.writeUTF(msg);
                        dout.flush();
                        chatArea.append("Server (You): " + msg + "\n");
                        inputField.setText("");
                    }
                } catch (Exception ex) { chatArea.append("Error sending message.\n"); }
            }
        };
        btnSend.addActionListener(sendAction);
        inputField.addActionListener(sendAction);

        // 3. Move the blocking network code into a background thread
        new Thread(new Runnable() {
            public void run() {
                try {
                    ServerSocket ss = new ServerSocket(3333);
                    Socket s = ss.accept(); // Freezes HERE, but safely inside a background thread!
                    chatArea.append("Client Connected! Chat is now active.\n-------------------\n");

                    DataInputStream din = new DataInputStream(s.getInputStream());
                    dout = new DataOutputStream(s.getOutputStream());

                    // Continuous read loop
                    String incoming = "";
                    while (!incoming.equals("stop")) {
                        incoming = din.readUTF();
                        chatArea.append("Client: " + incoming + "\n");
                    }
                } catch (Exception e) {
                    chatArea.append("Connection status altered or lost.\n");
                }
            }
        }).start();
    }
}
