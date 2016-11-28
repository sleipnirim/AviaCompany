package by.htp6.bean;

import java.io.Serializable;

public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String login;
	private String name;
	private String surname;
	private String position;
	private boolean errorStatus;
	private String errorMessage;
	
	

	public boolean isErrorStatus() {
		return errorStatus;
	}

	public void setErrorStatus(boolean errorStatus) {
		this.errorStatus = errorStatus;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public User(){};
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	public boolean equals (Object obj){
		if (this == obj) return true;
		if (obj == null) return false;
		if (this.getClass() != obj.getClass()) return false;
		User n = (User) obj;
		if(this.login != n.login) return false;
		if(this.name != n.name) return false;
		if(this.position != n.position) return false;
		if(this.surname != n.surname) return false;
		
		return true;
	}
	
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime*result + login.hashCode();
		result = prime*result + name.hashCode();
		result = prime*result + surname.hashCode();
		result = prime*result + position.hashCode();
		
		return result;
	}
	
	public String toString(){
		
		return "User (name = " + name + ", surname = " + surname + ", login = " + login + ", position = " + position + ".";
	}

}
