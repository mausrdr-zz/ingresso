/**
 * 
 */
package br.edu.univas.si.lab4.ingresso.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

/**
 * @author mauro
 *
 */
public abstract class ConnectDB {
	protected static final String JDBC_DRIVER = "org.postgresql.Driver";
	protected static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/ingresso";
	protected static final String USER = "ingresso";
	protected static final String PASSWORD = "obladioblada";
	private Connection connection = null;
	private Statement statement = null;
	
	protected ConnectDB() {
		try {
			this.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			this.getStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected Connection getConnection() throws SQLException {
		if(connection == null) {
			//Conexão com o Banco
			connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
		}
		return connection;
	}

	protected Statement getStatement() throws SQLException {
		if(statement == null) {
			statement = getConnection().createStatement();
		}
		return statement;
	}
	
	protected void Close() {
		try {
			if(statement != null) {
				statement.close();
			}
			if(connection != null) {
				connection.close();
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
		}
	}
}
