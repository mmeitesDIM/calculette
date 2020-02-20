package com.octest.beans;

import javax.servlet.http.HttpServletRequest;

public class Calcul {
	private int operande1 = 0;
	private int operande2 = 0;
	private String operateur;
	private int resultat;
	
	public int getResultat() {
		return resultat;
	}
	public void setResultat(int resultat) {
		this.resultat = resultat;
	}
	public String getOperateur() {
		return operateur;
	}
	public void setOperateur(String operateur) {
		this.operateur = operateur;
	}
	public int getOperande1() {
		return operande1;
	}
	public void setOperande1(int operande1) {
		this.operande1 = operande1;
	}
	public int getOperande2() {
		return operande2;
	}
	public void setOperande2(int operande2) {
		this.operande2 = operande2;
	}
	
	public void realiseCalcul(HttpServletRequest request) {
		int ope1 =  Integer.parseInt(request.getParameter("operande1"));
		int ope2 =  Integer.parseInt(request.getParameter("operande2"));
		String operateur = request.getParameter("operateur");
		
		
		this.setOperande1(ope1);
		this.setOperande2(ope2);
		this.setOperateur(operateur);
		this.realisation();
	}
	public void realisation() {
		  if (this.operateur.equals("+")) {
	            this.resultat  = this.operande1 + this.operande2;
	        }
	        else if (this.operateur.equals("-")) {
	            this.resultat = this.operande1 - this.operande2;
	        }
	        else if (this.operateur.equals("x")) {
	            this.resultat = this.operande1 * this.operande2;
	        }
	        else this.resultat = this.operande1 / this.operande2;
	}
}
