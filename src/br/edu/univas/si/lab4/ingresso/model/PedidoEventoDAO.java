/**
 * 
 */
package br.edu.univas.si.lab4.ingresso.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

/**
 * @author mauro
 *
 */
public class PedidoEventoDAO extends ConnectDB {
	public void consultPedEvent(PedidoEvento pedido, OpcaoPedido op) {
		String sql = "SELECT u.nome AS \"usuario\", p.nome_evento AS \"nome\", p.data_evento AS \"data\", p.horario_evento AS \"horario\", p.local_evento AS \"local\", t.descricao AS \"descricao\", p.quantidade AS \"quantidade\", p.preco AS \"preco\", p.preco_meia AS \"preco_meia\" FROM pedido_evento p, pessoas u, tipo_evento t WHERE aprovado " + op.getOpcao() + " AND u.id = p.id_usuario AND t.id = p.ref_tipo;";
		String [] campo = new String [] {
				"usuario", "nome", "data", "horario", "local", 
				"descricao", "quantidade", "preco", "preco_meia"
		};
		int i = 0;
		int j = 1;
		
		Statement statement;
		
		try {
			statement = getStatement();
			ResultSet result = statement.executeQuery(sql);
			
			while(result.next()) {
				pedido.setUsuario(result.getString(campo[i++]));
				pedido.setNome(result.getString(campo[i++]));
				pedido.setData(invData(result.getDate(campo[i++]), false));
				pedido.setHorario(result.getString(campo[i++]));
				pedido.setLocal(result.getString(campo[i++]));
				pedido.setDescTipo(result.getString(campo[i++]));
				pedido.setQuantidade(result.getInt(campo[i++]));
				pedido.setPreco(result.getDouble(campo[i++]));
				pedido.setPrecoMeia(result.getDouble(campo[i]));
				i = 0;
				j++;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private String invData(Date data, boolean insert) {
		String inv;
		if(insert){
			SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
			inv = String.valueOf(s.format(data));
		}
		else{
			SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
			inv = String.valueOf(s.format(data));
		}
		return inv;
	}
	
	public int quantLinhas(){
		
		String sql = "SELECT COUNT(*) AS \"linhas\" FROM pedido_evento;";
		int linhas = 0;
		Statement statement;
		
		try {
			statement = getStatement();
			ResultSet result = statement.executeQuery(sql);
			
			if(result.next()) {
				linhas = result.getInt("linhas");
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
		}
		return linhas;
	}
	
}
