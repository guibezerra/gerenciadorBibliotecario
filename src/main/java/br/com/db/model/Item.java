package br.com.db.model;

import java.io.Serializable;
import java.sql.Date;

public class Item implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Date data_emprestimo;
	private Date data_final;
	private Date data_entrega;
	private String titulo;
	private String ano;
	private float valor_patrimonial;
	private String flag_L;
	private String autor;
	private String edicao;
	private String flag_R;
	private String editora;
	private int volume_exemplar;
	private int numero_exemplar;
	
	public Item () {
		
	}
	
	public Date getData_emprestimo() {
		return data_emprestimo;
	}
	public void setData_emprestimo(Date data_emprestimo) {
		this.data_emprestimo = data_emprestimo;
	}
	public Date getData_final() {
		return data_final;
	}
	public void setData_final(Date data_final) {
		this.data_final = data_final;
	}
	public Date getData_entrega() {
		return data_entrega;
	}
	public void setData_entrega(Date data_entrega) {
		this.data_entrega = data_entrega;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public float getValor_patrimonial() {
		return valor_patrimonial;
	}
	public void setValor_patrimonial(float valor_patrimonial) {
		this.valor_patrimonial = valor_patrimonial;
	}
	public String getFlag_L() {
		return flag_L;
	}
	public void setFlag_L(String flag_L) {
		this.flag_L = flag_L;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEdicao() {
		return edicao;
	}
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	public String getFlag_R() {
		return flag_R;
	}
	public void setFlag_R(String flag_R) {
		this.flag_R = flag_R;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getVolume_exemplar() {
		return volume_exemplar;
	}
	public void setVolume_exemplar(int volume_exemplar) {
		this.volume_exemplar = volume_exemplar;
	}
	public int getNumero_exemplar() {
		return numero_exemplar;
	}
	public void setNumero_exemplar(int numero_exemplar) {
		this.numero_exemplar = numero_exemplar;
	}
	
	
	
}
