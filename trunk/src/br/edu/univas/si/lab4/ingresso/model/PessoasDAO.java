/**
 * 
 */
package br.edu.univas.si.lab4.ingresso.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

/**
 * @author mauro
 *
 */
public class PessoasDAO extends ConnectDB {
	
	public void consultaPessoa(String cpf, PessoasTO pessoa) {
		String sql = "SELECT * FROM pessoas WHERE cpf LIKE '" + cpf + "';";
		
		Statement statement;
		
		try {
			statement = getStatement();
			ResultSet result = statement.executeQuery(sql);
			
			while(result.next()) {
				pessoa.setNome(result.getString("nome"));
				pessoa.setCpf(result.getString("cpf"));
				pessoa.setCartaoCred(result.getString("cartao_cred"));
				pessoa.setBandeiraCC(result.getString("bandeira_cartao"));
				pessoa.setValidadeCC(result.getString("validade_cartao"));
				pessoa.setEmail(result.getString("email"));
				pessoa.setEndereco(result.getString("endereco"));
				pessoa.setCep(result.getString("cep"));
				pessoa.setCidade(result.getString("cidade"));
				pessoa.setEstado(result.getString("estado"));
				pessoa.setTelefone(result.getString("telefone"));
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
		}
	}

}
