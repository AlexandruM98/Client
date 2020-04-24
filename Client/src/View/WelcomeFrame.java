package View;

import java.awt.BorderLayout;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ClientController;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class WelcomeFrame extends JFrame {	
	
	
	private JPanel contentPane;	
	
	private JCheckBox checkBoxLocatie = new JCheckBox("");
	private JCheckBox checkBoxPers = new JCheckBox("");
	private JCheckBox checkBoxScop = new JCheckBox("");
	private JTextField inputText;
	
	ClientController clientController;
	
	public WelcomeFrame(ClientController clientController) {	
		this.clientController = clientController;
		JButton backBtn = new JButton("Exit");
	    JButton tipEventBtn = new JButton("Vezi evenimente");
	    JButton statisticiBtn= new JButton("Vezi statistici");
		JButton crudEventBtn = new JButton("CRUD Evenimente");
	    JButton filterBtn = new JButton("Filtreaza ");
		JButton saveBtn = new JButton("Save");
		JButton crudCoordBtn = new JButton("Crud Coordonatori");
		setTitle("ClientPage");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 742, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		JLabel lblBunaZiua = new JLabel("Mai multe informatii accesand butoanele de mai jos");
		lblBunaZiua.setBounds(30, 10, 716, 104);
		lblBunaZiua.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 25));
		contentPane.add(lblBunaZiua);
		setContentPane(contentPane);
		
		
		backBtn.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
		backBtn.setBounds(275, 616, 124, 37);
		contentPane.add(backBtn);
		
		JLabel lblInfoEvenimente = new JLabel("Accesand butonul urmator veti putea afla mai multe informatii despre evenimente");
		lblInfoEvenimente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInfoEvenimente.setBounds(10, 124, 586, 55);
		contentPane.add(lblInfoEvenimente);
		
		
		tipEventBtn.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 12));		
		tipEventBtn.setBounds(561, 124, 151, 55);
		contentPane.add(tipEventBtn);
		
		JLabel lblDacaDoritiSa = new JLabel("Vizualizare statistici");
		lblDacaDoritiSa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDacaDoritiSa.setBounds(10, 234, 551, 49);
		contentPane.add(lblDacaDoritiSa);
		
		
		statisticiBtn.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 12));
		statisticiBtn.setBounds(561, 235, 151, 49);
		contentPane.add(statisticiBtn);
		
		JLabel lblAdaugareaCitireaActualizarea = new JLabel("Adaugarea, Citirea, Actualizarea, Stergerea unui Eveniment");
		lblAdaugareaCitireaActualizarea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAdaugareaCitireaActualizarea.setBounds(16, 341, 510, 13);
		contentPane.add(lblAdaugareaCitireaActualizarea);
		
		
		crudEventBtn.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 11));
		crudEventBtn.setBounds(561, 322, 151, 55);
		contentPane.add(crudEventBtn);
		
		JLabel lblFiltrareEvenimente = new JLabel("Filtrare Evenimente");
		lblFiltrareEvenimente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFiltrareEvenimente.setBounds(10, 449, 140, 19);
		contentPane.add(lblFiltrareEvenimente);
		
		
		checkBoxLocatie.setBounds(156, 447, 21, 21);
		contentPane.add(checkBoxLocatie);
		
		JLabel lblLocatie = new JLabel("Locatie");
		lblLocatie.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLocatie.setBounds(145, 426, 45, 13);
		contentPane.add(lblLocatie);
		
		
		checkBoxPers.setBounds(236, 447, 21, 21);
		contentPane.add(checkBoxPers);
		
		JLabel lblNrPersoane = new JLabel("Nr. persoane");
		lblNrPersoane.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNrPersoane.setBounds(212, 426, 73, 13);
		contentPane.add(lblNrPersoane);
		
		JLabel lblScop = new JLabel("Scop");
		lblScop.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblScop.setBounds(317, 426, 73, 12);
		contentPane.add(lblScop);
		
		
		checkBoxScop.setBounds(317, 447, 21, 21);
		contentPane.add(checkBoxScop);
		
		
		filterBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		filterBtn.setBounds(561, 436, 151, 55);
		contentPane.add(filterBtn);
		
		JLabel lblSalvareRapoarteEve = new JLabel("Salvare rapoarte informatii evenimente ce vor fi organizate");
		lblSalvareRapoarteEve.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSalvareRapoarteEve.setBounds(10, 518, 369, 19);		
		contentPane.add(lblSalvareRapoarteEve);
		
		
		saveBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		saveBtn.setBounds(561, 519, 151, 29);
		contentPane.add(saveBtn);
		
		JLabel lblAdaugareaCitireaActualizarea_1 = new JLabel("Adaugarea, Citirea, Actualizarea, Stergerea unui Coordonator");
		lblAdaugareaCitireaActualizarea_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAdaugareaCitireaActualizarea_1.setBounds(10, 587, 413, 19);
		contentPane.add(lblAdaugareaCitireaActualizarea_1);
		
		
		crudCoordBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		crudCoordBtn.setBounds(561, 582, 151, 37);
		contentPane.add(crudCoordBtn);
		
		inputText = new JTextField();
		inputText.setBounds(361, 451, 165, 17);
		contentPane.add(inputText);
		inputText.setColumns(10);
		
		JLabel lblLocatieSauNr = new JLabel("Locatie sau nr persoase sau scop");
		lblLocatieSauNr.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLocatieSauNr.setBounds(355, 418, 183, 29);
		contentPane.add(lblLocatieSauNr);
		setVisible(true);		
		
		
		backBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
				
				
			}
			
			
		});
		
		tipEventBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clientController.openEventInfoFrame();
				
				
			}
			
		});
		
		statisticiBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
				
			}
			
		});
		
		crudEventBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				clientController.openLogInFrame("Coordonator","crud");
				
				
			}
			
		});
		
		filterBtn.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				clientController.openLogInFrame("Coordonator","filter");
					
				
			}
			
		});
		
		crudCoordBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clientController.openLogInFrame("Administrator","crud");
				
			}
			
		});
		
		saveBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
			
		});
		
		
		
		
		
	}

	public JCheckBox getCheckBoxLocatie() {
		return checkBoxLocatie;
	}




	public void setCheckBoxLocatie(JCheckBox checkBoxLocatie) {
		this.checkBoxLocatie = checkBoxLocatie;
	}




	public JCheckBox getCheckBoxPers() {
		return checkBoxPers;
	}




	public void setCheckBoxPers(JCheckBox checkBoxPers) {
		this.checkBoxPers = checkBoxPers;
	}




	public JCheckBox getCheckBoxScop() {
		return checkBoxScop;
	}




	public void setCheckBoxScop(JCheckBox checkBoxScop) {
		this.checkBoxScop = checkBoxScop;
	}




	public String getInputText() {
		return inputText.getText().toString();
	}




	public void setInputText(JTextField inputText) {
		this.inputText = inputText;
	}
	
	
	
}

	
	
	