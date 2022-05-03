package Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LogIn extends JFrame{
	public LogIn() {
		JPanel panel = new JPanel();
		JLabel label = new JLabel("ID : ");
		JLabel pswrd = new JLabel("Password : ");
		JTextField txtID = new JTextField(10);
		JPasswordField txtPass = new JPasswordField(10); // 암호화 되는 textField
		JButton logBtn = new JButton("로그인");
		
	
		
		panel.add(label);
		panel.add(txtID);
		panel.add(pswrd);
		panel.add(txtPass);
		panel.add(logBtn);
		
		
		logBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = "yeji";
				String pass = "1234";

				if(id.equals(txtID.getText())&&pass.equals(txtPass.getText())) {
					JOptionPane.showMessageDialog(null, "로그인에 성공하였습니다.");
				}else {
					JOptionPane.showMessageDialog(null, "로그인에 실패하였습니다.");
				}
			}
		});
		
		
		
		
		
		
		
		add(panel);
		
		setVisible(true);
		setSize(600, 400);
		setLocationRelativeTo(null);//스크린이 가운데서 뜰 수 있도록 설정
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

	public static void main(String[] args) {
		new LogIn();

	}

}
