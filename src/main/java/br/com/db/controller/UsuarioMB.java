package br.com.db.controller;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.db.DAO.UsuarioDAO;
import br.com.db.model.Endereco;
import br.com.db.model.Frequencia;
import br.com.db.model.Item;
import br.com.db.model.Usuario;

@SessionScoped
@Named
public class UsuarioMB implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Usuario user;

	@Inject
	private Endereco end;

	@Inject
	private Frequencia freq;

	@Inject
	private Item item;

	private UsuarioDAO managerBD = new UsuarioDAO();

	public UsuarioMB() {

	}

	public String cadastrarUser() {
		end.setUsuario_id(user.getCpf());

		managerBD.save(user, end);

		return "";
	}

	public String frequenciaBibli() {
		Date data_entrada = new Date(System.currentTimeMillis());
		Time hora_entrada = new Time(System.currentTimeMillis());
		Time hora_saida = new Time(System.currentTimeMillis());

		// somando 6 horas em milissegundos
		hora_saida.setTime((hora_saida.getTime() + 21600000));
		;

		freq.setData_entrada(data_entrada);
		freq.setHora_entrada(hora_entrada);
		freq.setHora_saida(hora_saida);

		managerBD.register(freq);

		return "";
	}

	public String emprestimo() {
		System.out.println("data emprestimo: "+item.getData_emprestimo());
		return "";
	}

	public Endereco getEnd() {
		return end;
	}

	public void setEnd(Endereco end) {
		this.end = end;
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Frequencia getFreq() {
		return freq;
	}

	public void setFreq(Frequencia freq) {
		this.freq = freq;
	}

}
