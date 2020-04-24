package View;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Controller.ClientController;

import Model.Utilizator;

public class CrudCoordFrame extends JFrame {

	private JPanel contentPane;
	private ClientController ctrl;
	private JTextField numeField;
	private JTextField prenumeField;
	private JTextField userField;
	private JTextField passField;
	private JTextField idField;
	private JTextArea infoArea;
	
	
	public CrudCoordFrame(ClientController ctrl) {
		JButton btnAdaugaCoord = new JButton("Adauga Coordonator");
	    JButton btnStergeCoord = new JButton("Sterge Coordonator");
	    JButton btnActualizeazaCoord = new JButton("Actualizeaza Coordonator");
	    JButton btnGasesteCoord = new JButton("Gaseste Coordonator");
	    JButton clearBtn = 	new JButton("Clear Fields");
		this.ctrl = ctrl;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 934, 599);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton backBtn = new JButton("Back");
		backBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		backBtn.setBounds(784, 483, 111, 56);
		contentPane.add(backBtn);
		
		JLabel lblNume = new JLabel("Nume");
		lblNume.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNume.setBounds(42, 34, 119, 13);
		contentPane.add(lblNume);
		
		JLabel lblPrenume = new JLabel("Prenume");
		lblPrenume.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPrenume.setBounds(42, 77, 119, 13);
		contentPane.add(lblPrenume);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsername.setBounds(42, 130, 119, 13);
		contentPane.add(lblUsername);
		
		JLabel lblParola = new JLabel("Password");
		lblParola.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblParola.setBounds(42, 197, 119, 13);
		contentPane.add(lblParola);
		
		JLabel lbldCoordonator = new JLabel("Id Coordonator");
		lbldCoordonator.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbldCoordonator.setBounds(42, 252, 119, 13);
		contentPane.add(lbldCoordonator);
		
		numeField = new JTextField();
		numeField.setBounds(179, 33, 96, 19);
		contentPane.add(numeField);
		numeField.setColumns(10);
		
		prenumeField = new JTextField();
		prenumeField.setBounds(179, 71, 96, 19);
		contentPane.add(prenumeField);
		prenumeField.setColumns(10);
		
		userField = new JTextField();
		userField.setBounds(179, 129, 96, 19);
		contentPane.add(userField);
		userField.setColumns(10);
		
		passField = new JTextField();
		passField.setBounds(179, 196, 96, 19);
		contentPane.add(passField);
		passField.setColumns(10);
		
		idField = new JTextField();
		idField.setBounds(179, 251, 96, 19);
		contentPane.add(idField);
		idField.setColumns(10);
		
		
		btnAdaugaCoord.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAdaugaCoord.setBounds(324, 32, 245, 56);
		contentPane.add(btnAdaugaCoord);
		
		
		btnStergeCoord.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnStergeCoord.setBounds(324, 130, 245, 56);
		contentPane.add(btnStergeCoord);
		
		
		btnActualizeazaCoord.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnActualizeazaCoord.setBounds(324, 229, 245, 56);
		contentPane.add(btnActualizeazaCoord);
		
		
		btnGasesteCoord.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnGasesteCoord.setBounds(324, 331, 245, 56);
		contentPane.add(btnGasesteCoord);
		
		JLabel lblIntroducetiIdulDaca = new JLabel("Introduceti id-ul daca doriti sa gasiti");
		lblIntroducetiIdulDaca.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIntroducetiIdulDaca.setBounds(634, 72, 261, 45);
		contentPane.add(lblIntroducetiIdulDaca);
		
		JLabel lblUnEvenimentSau = new JLabel("un coordonator sau sa-l actualizati");
		lblUnEvenimentSau.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUnEvenimentSau.setBounds(631, 116, 238, 27);
		contentPane.add(lblUnEvenimentSau);
		
		
		clearBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		clearBtn.setBounds(674, 200, 184, 37);
		contentPane.add(clearBtn);
		
		infoArea = new JTextArea();
		infoArea.setBounds(91, 447, 594, 105);
		contentPane.add(infoArea);
		
		JLabel lblInformatii = new JLabel("Informatii");
		lblInformatii.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblInformatii.setBounds(324, 397, 87, 31);
		contentPane.add(lblInformatii);
		
		setVisible(true);
		
		backBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				ctrl.backToMainFrame();
				
				
			}
			
		});
		
		btnAdaugaCoord.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			//	ctrl.adaugaCoordonator(numeField.getText().toString(),prenumeField.getText().toString(), userField.getText().toString(),passField.getText().toString());
				
			}
			
		});
		
		btnStergeCoord.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			//	ctrl.stergeCoordonator(numeField.getText().toString(),prenumeField.getText().toString(), userField.getText().toString(),passField.getText().toString());
				
			}
			
		});
		
		btnActualizeazaCoord.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			//	ctrl.actualizeazaCoordonator(idField.getText().toString(),numeField.getText().toString(),prenumeField.getText().toString(), userField.getText().toString(),passField.getText().toString());
				
			}
			
		});
		
		btnGasesteCoord.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			//	ctrl.gasesteCoordonator(Integer.parseInt(idField.getText().toString()));
				
			}
			
		});
		
		
	}

	public void setInfoArea(String info) {
		this.infoArea.setText(info);
	}
}
