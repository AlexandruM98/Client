package View;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ClientController;

import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class EventInfoFrame extends JFrame {
	
	 private static final String IMG_PATH_NUNTA = "C:/Users/Alexandru/git/Client/Client/lib/image01.jpg";
	 private static final String IMG_PATH_BOTEZ = "C:/Users/Alexandru/git/Client/Client/lib/image02.jpg";
	 private static final String IMG_PATH_MAJORAT = "C:/Users/Alexandru/git/Client/Client/lib/image03.jpg";
	

	private JPanel contentPane;
	private ClientController controller;
	
	
	
	public EventInfoFrame(ClientController controller) {
		this.controller = controller;
		JButton backBtn = new JButton("Back");		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 589, 399);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setForeground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNunti = new JLabel("Nunti");
		lblNunti.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 25));
		lblNunti.setBounds(22, 77, 108, 65);
		contentPane.add(lblNunti);
		
		JLabel lblBotezuri = new JLabel("Botezuri");
		lblBotezuri.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 25));
		lblBotezuri.setBounds(196, 77, 135, 65);
		contentPane.add(lblBotezuri);
		
		JLabel lblMajorate = new JLabel("Majorate");
		lblMajorate.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 25));
		lblMajorate.setBounds(400, 88, 144, 42);
		contentPane.add(lblMajorate);
		
		
		backBtn.setFont(new Font("Tahoma", Font.PLAIN, 19));
		backBtn.setBounds(453, 306, 90, 46);
		contentPane.add(backBtn);
		
		JLabel lblBunaZiua = new JLabel("Buna ziua ! Mai jos puteti vedea ce evenimente organizeaza firma noastra ");
		lblBunaZiua.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 13));
		lblBunaZiua.setBounds(22, 23, 555, 44);
		contentPane.add(lblBunaZiua);
		
		
		
		
		
		try {
	        BufferedImage img = ImageIO.read(new File(IMG_PATH_NUNTA));	        
	        ImageIcon icon = new ImageIcon(img);
	        
	        JLabel poza1 = new JLabel("");
	        poza1.setIcon(icon);
			poza1.setBounds(10, 128, 135, 224);
			contentPane.add(poza1);
			
			img = ImageIO.read(new File(IMG_PATH_BOTEZ));	        
	        icon = new ImageIcon(img);
			
			JLabel poza2 = new JLabel("");
			poza2.setIcon(icon);
			poza2.setBounds(196, 129, 144, 223);
			contentPane.add(poza2);
			
			img = ImageIO.read(new File(IMG_PATH_MAJORAT));	        
	        icon = new ImageIcon(img);			
			JLabel poza3 = new JLabel("");
			poza3.setIcon(icon);
			poza3.setBounds(400, 140, 129, 156);
			contentPane.add(poza3);
			setVisible(true);
			
	        
	      } catch (IOException e) {
	         e.printStackTrace();
	      }
		
		
		setVisible(true);
		backBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {				
				setVisible(false);
				
			}
			
		});
	}
}
