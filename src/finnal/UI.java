package finnal;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;
public class UI { 
	
	   UI() 
	    {    
	        JFrame frame = new JFrame("Login Example");
	        frame.setSize(600, 480);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        JPanel panel = new JPanel();    
	        frame.add(panel);
	        placeComponents(panel);
	        frame.setVisible(true);
	    }

	    private static void placeComponents(JPanel panel) {
	        panel.setLayout(null);
	        JLabel welcome=new JLabel("��ӭʹ�ã�������ѧ������ѧ����:");
	        panel.add(welcome);	
	        welcome.setBounds(10,20,200,50);
	        JLabel userLabel = new JLabel("ѧ����:");
	        userLabel.setBounds(10,100,80,25);
	        panel.add(userLabel);
	        JTextField userText = new JTextField(20);
	        userText.setBounds(100,100,165,25);
	        panel.add(userText);
	        JLabel passwordLabel = new JLabel("ѧ��:");
	        passwordLabel.setBounds(10,150,80,25);
	        panel.add(passwordLabel);
	        JPasswordField passwordText = new JPasswordField(20);
	       passwordText.setBounds(100,150,165,25);
	        panel.add(passwordText);
	        JButton loginButton = new JButton("��¼");
	        loginButton.setBounds(10, 250, 80, 25);
	        panel.add(loginButton);
	    }

	}

