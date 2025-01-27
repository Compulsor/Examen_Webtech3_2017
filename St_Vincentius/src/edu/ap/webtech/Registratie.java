package edu.ap.webtech;

import java.util.Date;

public class Registratie {
	
	private Date datumEnUurInterventie;
	private String naamPatient;
	private Date geboorteDatum;
	private String naamVerpleegkundige;
	private String diagnose;
	
	public Registratie(Date datumEnUurInterventie, String naamPatient, Date geboorteDatum, String naamVerpleegkundige, String diagnose){
		this.datumEnUurInterventie = datumEnUurInterventie;
		this.naamPatient = naamPatient;
		this.geboorteDatum = geboorteDatum;
		this.naamVerpleegkundige = naamVerpleegkundige;
		this.diagnose = diagnose;
	}
	
	public Date getDatumEnUurInterventie() {
		return datumEnUurInterventie;
	}
	public void setDatumEnUurInterventie(Date datum) {
		this.datumEnUurInterventie = datum;
	}
	public String getNaamPatient() {
		return naamPatient;
	}
	public void setNaamPatient(String naamPatient) {
		this.naamPatient = naamPatient;
	}
	public Date getGeboorteDatum() {
		return geboorteDatum;
	}
	public void setGeboorteDatum(Date geboorteDatum) {
		this.geboorteDatum = geboorteDatum;
	}
	public String getNaamVerpleegkundige() {
		return naamVerpleegkundige;
	}
	public void setNaamVerpleegkundige(String naamVerpleegkundige) {
		this.naamVerpleegkundige = naamVerpleegkundige;
	}
	public String getDiagnose() {
		return diagnose;
	}
	public void setDiagnose(String diagnose) {
		this.diagnose = diagnose;
	}
	
	
}
