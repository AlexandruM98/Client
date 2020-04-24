package Controller;

import java.net.*;
import java.sql.Date;

import Model.ContUtilizator;
import Model.Eveniment;
import Model.Utilizator;

import java.io.*;
import View.*;
public class ClientController {
	private Socket clientSocket;
	private ObjectOutputStream out;
	private ObjectInputStream in;
	
	private static Utilizator utilizator;
	
	private WelcomeFrame meniuPrincipal = new WelcomeFrame(this);
	private CrudEventFrame eventCrud;
	private EventInfoFrame eventInfo;
	private LogInFrame logInFrame;
	private CrudCoordFrame coordCrud;
	
	
	public void openCrudEventFrame() {
		eventCrud = new CrudEventFrame(this);
		
	}
	private void openCoordCrudFrame() {
		coordCrud = new CrudCoordFrame(this);
		
	}
	public void openEventInfoFrame() {
		eventInfo = new EventInfoFrame(this);
	}
	public void backToMainFrame() {
		meniuPrincipal.setVisible(true);	
		
	}
	
	public void openLogInFrame(String tipUtilizator,String action) {
		logInFrame = new LogInFrame(this,tipUtilizator,action);
	}
	
	@SuppressWarnings("deprecation")
	public void adaugaEveniment(String tip, String locatie, String data, Integer nrPers)  {
		String[] tokens = data.split("/");
		Integer an = Integer.parseInt(tokens[2]);
		Integer luna = Integer.parseInt(tokens[1]);
		Integer zi  = Integer.parseInt(tokens[0]);
		
		Eveniment event = new Eveniment(tip,locatie,new Date(an,luna,zi),nrPers);
		
		Request req = new Request();
		req.setOperation("addEvent");
		req.setObj(event);
		
		try {
			out.writeObject(req);
			out.flush();
			Integer id = (Integer) in.readObject();
			eventCrud.setInfoArea("Evenimentul a fost adaugat cu succes, id : " + id);
		}
		catch(Exception e) {
			e.printStackTrace();
		}	
		
	}
	
	public void stergeEveniment(Integer id) {
		Request req = new Request();
		req.setOperation("delEvent");
		req.setObj(id);
		try {
			out.writeObject(req);
			out.flush();
			boolean deleted = (boolean) in.readObject();
			if(deleted) {
				eventCrud.setInfoArea("Eveniment cu id : " + id +" sters !");
			}
			else {
				eventCrud.setInfoArea("Evenimentul nu exista !");
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void gasesteEveniment(Integer id) {
		Request req = new Request();
		req.setOperation("findEvent");
		req.setObj(id);
		try {
			out.writeObject(req);
			out.flush();
			Eveniment event = (Eveniment)in.readObject();
			
			if(event != null) {
				eventCrud.setInfoArea(event.toString());
			}
			else {
				eventCrud.setInfoArea("Evenimentul nu exista !");
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("deprecation")
	public void updateEveniment(int id, String tip, String locatie, String data, int nrPers) {
		String[] tokens = data.split("/");
		Integer an = Integer.parseInt(tokens[2]);
		Integer luna = Integer.parseInt(tokens[1]);
		Integer zi  = Integer.parseInt(tokens[0]);		
		Eveniment event = new Eveniment();
		event.setId(id);
		event.setTip(tip);
		event.setPersoane(nrPers);
		event.setLocatie(locatie);
		event.setData(new Date(an,luna,zi));
		
		Request req = new Request();
		req.setOperation("updateEvent");
		req.setObj(event);
		
		try {
			out.writeObject(req);
			out.flush();
			Integer idd = (Integer)in.readObject();
			if(idd!=null)			
				eventCrud.setInfoArea("Update cu succes la id : "+idd);
			else
				eventCrud.setInfoArea("Evenimentul nu exista");			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void verificaCont(String user, String pass,String tip,String action) {
		Request req = new Request();
		req.setOperation("logIn");
		ContUtilizator cont = new ContUtilizator();
		cont.setUser(user);
		cont.setPass(pass);
		cont.setUtilizator(new Utilizator("_","_",tip));
		req.setObj(cont);
		try {
			out.writeObject(req);
			out.flush();
			boolean ok = (boolean)in.readObject();
			if(ok) {
				logInFrame.setVisible(false);
				if(tip.equals("Coordonator")) {
					if(action.equals("crud")) {						
						openCrudEventFrame();
						eventCrud.setInfoArea("V-ati logat cu succes !");
					}
					else {
						//aici deschidem aia cu filtrare
					}
				}
				else {
					openCoordCrudFrame();
					coordCrud.setInfoArea("V-ati logat cu succes !");
					
				}
			}				
			else
				logInFrame.setInfoArea("Ceva nu a mers bine!");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}		
		
	}
	
	
	public void salvareCont(String user, String pass) {
		Request req = new Request();
		req.setOperation("saveAcc");
		ContUtilizator cont = new ContUtilizator();
		cont.setUtilizator(utilizator);
		cont.setUser(user);
		cont.setPass(pass);
		req.setObj(cont);
		try {
			out.writeObject(req);
			out.flush();
			Integer id = (Integer)in.readObject();
			if(id != null) {
				logInFrame.setInfoArea("Contul a fost salvat cu succes !");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void startConnection(String ip, int port) {
		try {
			clientSocket = new Socket(ip,port);
			out = new ObjectOutputStream(clientSocket.getOutputStream());
			in = new ObjectInputStream(clientSocket.getInputStream());

	
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}		
	
	public void stopConnection() {
		try {
			in.close();
			out.close();
			clientSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("Eu sunt clientul !");
		utilizator = new Utilizator("Naulea","Stefania","Administrator");
		ClientController client = new ClientController();
		client.startConnection("localhost", 6666);		
		
	
		
		
	}
	
	

}
