package model;

public class weatherapp {
	
	private String mesto;
	private double geoDuzina, geoSirina;
	public String getMesto() {
		return mesto;
	}
	public void setMesto(String mesto) {
		this.mesto = mesto;
	}
	public double getGeoDuzina() {
		return geoDuzina;
	}
	public void setGeoDuzina(double geoDuzina) {
		this.geoDuzina = geoDuzina;
	}
	public double getGeoSirina() {
		return geoSirina;
	}
	public void setGeoSirina(double geoSirina) {
		this.geoSirina = geoSirina;
	}
	public weatherapp(String mesto, double geoDuzina, double geoSirina) {
		super();
		this.mesto = mesto;
		this.geoDuzina = geoDuzina;
		this.geoSirina = geoSirina;
	}
	public weatherapp() {
		super();
	}
	@Override
	public String toString() {
		return "weatherapp [mesto=" + mesto + ", geoDuzina=" + geoDuzina + ", geoSirina=" + geoSirina + "]";
	}
	
	

}