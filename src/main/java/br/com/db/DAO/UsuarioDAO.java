package br.com.db.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.db.config.ConnectionFactory;
import br.com.db.model.Endereco;
import br.com.db.model.Frequencia;
import br.com.db.model.Usuario;

public class UsuarioDAO {
	public void save(Usuario user, Endereco end) {
		if (user == null || user.getCpf() == null) {

			return;
		}
		if (end == null || end.getCep() == null) {

			return;
		}

		String sql_user = "INSERT INTO usuario (CPF, nome, telefone, login, senha, flag_bibli) "
				+ "VALUES (?, ?, ?, ?, ?, ?);";
		String sql_end = "INSERT INTO endereco (id_usuario, CEP, rua, numero, bairro, complemento) \n"
				+ "VALUES (?, ?, ?, ?, ?, ?);";

		Connection conn = ConnectionFactory.getConnection();

		try {
			PreparedStatement ps_user = conn.prepareStatement(sql_user);
			PreparedStatement ps_end = conn.prepareStatement(sql_end);

			ps_user.setString(1, user.getCpf());
			ps_user.setString(2, user.getNome());
			ps_user.setString(3, user.getTelefone());
			ps_user.setString(4, user.getLogin());
			ps_user.setString(5, user.getSenha());
			ps_user.setString(6, user.getFlag_bibli());

			ps_end.setString(1, end.getUsuario_id());
			ps_end.setString(2, end.getCep());
			ps_end.setString(3, end.getRua());
			ps_end.setString(4, end.getNumero());
			ps_end.setString(5, end.getBairro());
			ps_end.setString(6, end.getComplemento());

			ps_user.executeUpdate();
			ps_end.executeUpdate();

			ConnectionFactory.close(conn, ps_user);
			ConnectionFactory.close(conn, ps_end);
			
			System.out.println("Cadastro realizado com sucesso");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void register(Frequencia freq) {
		if (freq == null || freq.getId_bibliotecario() == null) {

			return;
		}
		
		
		String sql = "INSERT INTO frequencia (id_bibliotecario, dt_entrada, hr_entrada, hr_saida) VALUES (?, ?, ?, ?);";
		
		Connection conn = ConnectionFactory.getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);		
			
			ps.setString(1, freq.getId_bibliotecario());
			ps.setDate(2, freq.getData_entrada());
			ps.setTime(3, freq.getHora_entrada());
			ps.setTime(4, freq.getHora_saida());
			
			ps.executeUpdate();
			
			ConnectionFactory.close(conn, ps);
			
			System.out.println("frequencia resgistrada com sucesso");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
