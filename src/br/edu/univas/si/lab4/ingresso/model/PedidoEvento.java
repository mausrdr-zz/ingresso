/**
 * 
 */
package br.edu.univas.si.lab4.ingresso.model;

/**
 * @author mauro
 *
 */
public class PedidoEvento {
	
	private String usuario;
	private String nome;
	private String data;
	private String horario;
	private String local;
	private String descTipo;
	private int quantidade;
	private Double preco;
	private Double precoMeia;
	
	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}
	/**
	 * @return the horario
	 */
	public String getHorario() {
		return horario;
	}
	/**
	 * @param horario the horario to set
	 */
	public void setHorario(String horario) {
		this.horario = horario;
	}
	/**
	 * @return the local
	 */
	public String getLocal() {
		return local;
	}
	/**
	 * @param local the local to set
	 */
	public void setLocal(String local) {
		this.local = local;
	}
	/**
	 * @return the descTipo
	 */
	public String getDescTipo() {
		return descTipo;
	}
	/**
	 * @param descTipo the descTipo to set
	 */
	public void setDescTipo(String descTipo) {
		this.descTipo = descTipo;
	}
	/**
	 * @return the quantidade
	 */
	public int getQuantidade() {
		return quantidade;
	}
	/**
	 * @param quantidade the quantidade to set
	 */
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	/**
	 * @return the preco
	 */
	public Double getPreco() {
		return preco;
	}
	/**
	 * @param preco the preco to set
	 */
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	/**
	 * @return the precoMeia
	 */
	public Double getPrecoMeia() {
		return precoMeia;
	}
	/**
	 * @param precoMeia the precoMeia to set
	 */
	public void setPrecoMeia(Double precoMeia) {
		this.precoMeia = precoMeia;
	}
		
}
