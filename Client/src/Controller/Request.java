package Controller;

import java.io.Serializable;
import java.util.List;

public class Request implements Serializable {
	
	private String operation;
	private Object obj;
	private List<Object> objs;
	
	public Request() {
		
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public List<Object> getObjs() {
		return objs;
	}

	public void setObjs(List<Object> objs) {
		this.objs = objs;
	}
	
	

}
