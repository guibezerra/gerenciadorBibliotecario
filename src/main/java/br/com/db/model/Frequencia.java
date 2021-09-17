package br.com.db.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;



public class Frequencia implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id_bibliotecario;
//	private	String dt_entrada;
//	private String hr_entrada;
//	private String hr_saida;
	
	private Date data_entrada; 
	private Time hora_entrada;
	private Time hora_saida;
	

	public Date getData_entrada() {
		return data_entrada;
	}

	public void setData_entrada(Date data_entrada) {
		this.data_entrada = data_entrada;
	}

	public Time getHora_entrada() {
		return hora_entrada;
	}

	public void setHora_entrada(Time hora_entrada) {
		this.hora_entrada = hora_entrada;
	}

	public Time getHora_saida() {
		return hora_saida;
	}

	public void setHora_saida(Time hora_saida) {
		this.hora_saida = hora_saida;
	}

	public Frequencia() {

	}

	public String getId_bibliotecario() {
		return id_bibliotecario;
	}

	public void setId_bibliotecario(String id_bibliotecario) {
		this.id_bibliotecario = id_bibliotecario;
	}

//	public String getDt_entrada() {
//		return dt_entrada;
//	}
//
//	public void setDt_entrada(String dt_entrada) {
//		this.dt_entrada = dt_entrada;
//	}
//
//	public String getHr_entrada() {
//		return hr_entrada;
//	}
//
//	public void setHr_entrada(String hr_entrada) {
//		this.hr_entrada = hr_entrada;
//	}
//
//	public String getHr_saida() {
//		return hr_saida;
//	}
//
//	public void setHr_saida(String hr_saida) {
//		this.hr_saida = hr_saida;
//	}



}
