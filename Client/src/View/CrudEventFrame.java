package View;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ClientController;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class CrudEventFrame extends JFrame {
	
	

	private JPanel contentPane;
	private JTextField tipField;
	private JTextField orasField;
	private JTextField numeField;
	private JTextField dataField;
	private JTextField nrField;
	private JTextField idField;
	private JTextArea infoArea;
	
	ClientController clientController;
	

	
	public CrudEventFrame(ClientController clientController) {
		this.clientController = clientController;
	    JButton btnAdaugaEveniment = new JButton("Adauga Eveniment");
		JButton btnStergeEveniment = new JButton("Sterge Eveniment");
		JButton btnActualizeazaEveniment = new JButton("Actualizeaza Eveniment");
		JButton btnGasesteEveniment = new JButton("Gaseste Eveniment");
		JButton clearBtn = 	new JButton("Clear Fields");
		
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
		
		JLabel lblTip = new JLabel("Tip");
		lblTip.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTip.setBounds(42, 34, 119, 13);
		contentPane.add(lblTip);
		
		JLabel lblOras = new JLabel("Oras");
		lblOras.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOras.setBounds(42, 77, 119, 13);
		contentPane.add(lblOras);
		
		JLabel lblNumeRestaurant = new JLabel("Nume Restaurant");
		lblNumeRestaurant.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNumeRestaurant.setBounds(42, 130, 119, 13);
		contentPane.add(lblNumeRestaurant);
		
		JLabel lblDataZilunaan = new JLabel("Data Zi/Luna/An");
		lblDataZilunaan.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDataZilunaan.setBounds(42, 197, 119, 13);
		contentPane.add(lblDataZilunaan);
		
		JLabel lblNrPersoane = new JLabel("Nr. persoane");
		lblNrPersoane.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNrPersoane.setBounds(42, 252, 119, 13);
		contentPane.add(lblNrPersoane);
		
		tipField = new JTextField();
		tipField.setBounds(179, 33, 96, 19);
		contentPane.add(tipField);
		tipField.setColumns(10);
		
		orasField = new JTextField();
		orasField.setBounds(179, 71, 96, 19);
		contentPane.add(orasField);
		orasField.setColumns(10);
		
		numeField = new JTextField();
		numeField.setBounds(179, 129, 96, 19);
		contentPane.add(numeField);
		numeField.setColumns(10);
		
		dataField = new JTextField();
		dataField.setBounds(179, 196, 96, 19);
		contentPane.add(dataField);
		dataField.setColumns(10);
		
		nrField = new JTextField();
		nrField.setBounds(179, 251, 96, 19);
		contentPane.add(nrField);
		nrField.setColumns(10);
		
		JLabel lblIdEveniment = new JLabel("Id Eveniment");
		lblIdEveniment.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIdEveniment.setBounds(42, 354, 119, 13);
		contentPane.add(lblIdEveniment);
		
		idField = new JTextField();
		idField.setBounds(179, 353, 96, 19);
		contentPane.add(idField);
		idField.setColumns(10);
		
		
		btnAdaugaEveniment.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAdaugaEveniment.setBounds(324, 32, 245, 56);
		contentPane.add(btnAdaugaEveniment);
		
		
		btnStergeEveniment.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnStergeEveniment.setBounds(324, 130, 245, 56);
		contentPane.add(btnStergeEveniment);
		
		
		btnActualizeazaEveniment.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnActualizeazaEveniment.setBounds(324, 229, 245, 56);
		contentPane.add(btnActualizeazaEveniment);
		
		
		btnGasesteEveniment.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnGasesteEveniment.setBounds(324, 331, 245, 56);
		contentPane.add(btnGasesteEveniment);
		
		JLabel lblIntroducetiIdulDaca = new JLabel("Introduceti id-ul daca doriti sa gasiti");
		lblIntroducetiIdulDaca.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIntroducetiIdulDaca.setBounds(634, 72, 261, 45);
		contentPane.add(lblIntroducetiIdulDaca);
		
		JLabel lblUnEvenimentSau = new JLabel("un eveniment sau sa-l actualizati");
		lblUnEvenimentSau.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUnEvenimentSau.setBounds(644, 109, 214, 27);
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
				clientController.backToMainFrame();
				
				
				
			}
			
		});
		
		btnAdaugaEveniment.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {					
				clientController.adaugaEveniment(tipField.getText().toString(),orasField.getText().toString(),dataField.getText().toString(),Integer.parseInt(nrField.getText().toString()));
				
			}
			
		});
		
		btnStergeEveniment.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clientController.stergeEveniment(Integer.parseInt(idField.getText().toString()));
				
			}
			
		});
		
		btnActualizeazaEveniment.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {				
				clientController.updateEveniment(Integer.parseInt(idField.getText().toString()),tipField.getText().toString(),orasField.getText().toString(),dataField.getText().toString(),Integer.parseInt(nrField.getText().toString()));
				
			}
			
		});
		
		btnGasesteEveniment.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clientController.gasesteEveniment(Integer.parseInt(idField.getText().toString()));
				
				
			}
			
		});
		
		clearBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tipField.setText("");
				orasField.setText("");
				numeField.setText("");
				dataField.setText("");
				nrField.setText("");
				idField.setText("");
			}
			
		});
		
		
	}

	public JTextArea getInfoArea() {
		return infoArea;
	}

	public void setInfoArea(String info) {
		this.infoArea.setText(info);
	}
}
