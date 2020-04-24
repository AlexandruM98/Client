package View;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;



import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class TabelFrame extends JFrame {
	
	private JTable table;
	


	public TabelFrame(String[][] data, String[] coloane) {	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 658, 427);
		getContentPane().setLayout(null);
		
		
		table = new JTable(data,coloane);
		table.setBackground(Color.LIGHT_GRAY);
		table.setBounds(10, 10, 624, 322);
		JScrollPane sp = new JScrollPane(table);
		sp.setBounds(0, 0, 644, 331);
		getContentPane().add(sp);		
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBack.setBounds(267, 359, 85, 21);
		getContentPane().add(btnBack);
		setVisible(true);
		
		btnBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
				
			}
			
		});
		
	
		
	}
}
