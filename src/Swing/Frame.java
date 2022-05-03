package Swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Frame {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Some Text");
		JButton btn1 = new JButton("누르세요.");
		JButton btn2 = new JButton("종료.");
		JTextArea txtArea = new JTextArea(); // 한줄 이상의 글씨를 작성할 때 좋아요
		//JTextField txtField = new JTextField(); // 한줄 이하의 글을 작성시(괄호안에 글자수 할당)
		JPanel btnPanel = new JPanel();
		
		panel.setLayout(new BorderLayout()); 
		
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		panel.add(label, BorderLayout.NORTH);
		panel.add(btnPanel, BorderLayout.WEST);
		panel.add(txtArea, BorderLayout.CENTER);
		
		/* btn1.addActionListener(new ActionListener() { //버튼 기능을 추가
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtArea.append("반갑습니다.\n");
			}
			
		});
		*/
		
	
		btn1.addActionListener(new ActionListener() { //버튼눌렀을때 작성한 글자로 상단 change
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText(txtArea.getText());
			}
			
		});
				
		btn2.addActionListener(new ActionListener() { // 종료 버튼 눌렀을 시 프로그램 종료

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		
		frame.add(panel);
		
		frame.setResizable(false); //사이즈 조정 고정
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(840, 840/12*9));
		frame.setSize(840, 840/12*9);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램 종료시 모든 프로그램 종료

	}

}
