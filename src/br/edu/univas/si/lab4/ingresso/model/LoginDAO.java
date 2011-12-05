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
public class LoginDAO extends ConnectDB {
	
	public boolean getLogin(Login login) {
		String sql = "SELECT * FROM usuarios WHERE usuario LIKE '" + login.getLogin() +"' AND senha LIKE '" + login.getSenha() + "';";
		boolean verif = false;
				
		Statement statement;
		try {
			statement = getStatement();
			
			ResultSet result = statement.executeQuery(sql);
			
			
			while(result.next()) {
				login.setTipo(result.getInt("tipo"));
				verif = true;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
			return verif;
		}
		return verif;
	}
}
