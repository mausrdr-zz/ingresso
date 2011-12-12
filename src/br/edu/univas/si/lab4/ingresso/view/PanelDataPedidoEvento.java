/**
 * 
 */
package br.edu.univas.si.lab4.ingresso.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import br.edu.univas.si.lab4.ingresso.model.PedidoEvento;

/**
 * @author mauro
 *
 */
public class PanelDataPedidoEvento extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private JLabel usuarioLabel;
	private JLabel eventoLabel;
	private JLabel dataLabel;
	private JLabel horarioLabel;
	private JLabel localLabel;
	private JLabel tipoLabel;
	private JLabel quantidadeLabel;
	private JLabel precoLabel;
	private JLabel precoMeiaLabel;
	
	private JTextField usuarioField;
	private JTextField eventoField;
	private JTextField dataField;
	private JTextField horarioField;
	private JTextField localField;
	private JTextField tipoField;
	private JTextField quantidadeField;
	private JTextField precoField;
	private JTextField precoMeiaField;
	
	private GridBagConstraints usuarioLabelConstraints;
	private GridBagConstraints eventoLabelConstraints;
	private GridBagConstraints dataLabelConstraints;
	private GridBagConstraints horarioLabelConstraints;
	private GridBagConstraints localLabelConstraints;
	private GridBagConstraints tipoLabelConstraints;
	private GridBagConstraints quantidadeLabelConstraints;
	private GridBagConstraints precoLabelConstraints;
	private GridBagConstraints precoMeiaLabelConstraints;
	
	private GridBagConstraints usuarioFieldConstraints;
	private GridBagConstraints eventoFieldConstraints;
	private GridBagConstraints dataFieldConstraints;
	private GridBagConstraints horarioFieldConstraints;
	private GridBagConstraints localFieldConstraints;
	private GridBagConstraints tipoFieldConstraints;
	private GridBagConstraints quantidadeFieldConstraints;
	private GridBagConstraints precoFieldConstraints;
	private GridBagConstraints precoMeiaFieldConstraints;
	
	public PanelDataPedidoEvento(PedidoEvento pedido) {
		setLayout(new GridBagLayout());
		int space = 6;
		setBorder(new CompoundBorder(new EmptyBorder(space, space, space, space), new CompoundBorder(new TitledBorder("Pedido de Eventos"), new EmptyBorder(space, space, space, space))));
		initialize(pedido);
	}
	
	private void initialize(PedidoEvento pedido) {
		add(getUsuarioLabel(), getUsuarioLabelConstraints());
		add(getEventoLabel(), getEventoLabelConstraints());
		add(getDataLabel(), getDataLabelConstraints());
		add(getHorarioLabel(), getHorarioLabelConstraints());
		add(getLocalLabel(), getLocalLabelConstraints());
		add(getTipoLabel(), getTipoLabelConstraints());
		add(getQuantidadeLabel(), getQuantidadeLabelConstraints());
		add(getPrecoLabel(), getPrecoLabelConstraints());
		add(getPrecoMeiaLabel(), getPrecoMeiaLabelConstraints());
		
		add(getUsuarioField(pedido), getUsuarioFieldConstraints());
		add(getEventoField(pedido), getEventoFieldConstraints());
		add(getDataField(pedido), getDataFieldConstraints());
		add(getHorarioField(pedido), getHorarioFieldConstraints());
		add(getLocalField(pedido), getLocalFieldConstraints());
		add(getTipoField(pedido), getTipoFieldConstraints());
		add(getQuantidadeField(pedido), getQuantidadeFieldConstraints());
		add(getPrecoField(pedido), getPrecoFieldConstraints());
		add(getPrecoMeiaField(pedido), getPrecoMeiaFieldConstraints());
	}

	/**
	 * @return the usuarioLabel
	 */
	public JLabel getUsuarioLabel() {
		if(usuarioLabel == null) {
			usuarioLabel = new JLabel();
			usuarioLabel.setText("Promotor do Evento:");
		}
		return usuarioLabel;
	}
	/**
	 * @return the nomeLabel
	 */
	public JLabel getEventoLabel() {
		if(eventoLabel == null) {
			eventoLabel = new JLabel();
			eventoLabel.setText("Nome do Evento:");
		}
		return eventoLabel;
	}
	/**
	 * @return the dataLabel
	 */
	public JLabel getDataLabel() {
		if(dataLabel == null) {
			dataLabel = new JLabel();
			dataLabel.setText("Data do Evento");
		}
		return dataLabel;
	}
	/**
	 * @return the horarioLabel
	 */
	public JLabel getHorarioLabel() {
		if(horarioLabel == null) {
			horarioLabel = new JLabel();
			horarioLabel.setText("Horário do Evento:");
		}
		return horarioLabel;
	}
	/**
	 * @return the localLabel
	 */
	public JLabel getLocalLabel() {
		if(localLabel == null) {
			localLabel = new JLabel();
			localLabel.setText("Local do Evento:");
		}
		return localLabel;
	}
	/**
	 * @return the tipoLabel
	 */
	public JLabel getTipoLabel() {
		if(tipoLabel == null) {
			tipoLabel = new JLabel();
			tipoLabel.setText("Tipo do Evento:");
		}
		return tipoLabel;
	}
	/**
	 * @return the quantidadeLabel
	 */
	public JLabel getQuantidadeLabel() {
		if(quantidadeLabel == null) {
			quantidadeLabel = new JLabel();
			quantidadeLabel.setText("Quantidade de Ingressos:");
		}
		return quantidadeLabel;
	}
	/**
	 * @return the precoLabel
	 */
	public JLabel getPrecoLabel() {
		if(precoLabel == null) {
			precoLabel = new JLabel();
			precoLabel.setText("Preço Unitário:");
		}
		return precoLabel;
	}
	/**
	 * @return the precoMeiaLabel
	 */
	public JLabel getPrecoMeiaLabel() {
		if(precoMeiaLabel == null) {
			precoMeiaLabel = new JLabel();
			precoMeiaLabel.setText("Preço da Meia Entrada:");
		}
		return precoMeiaLabel;
	}
	/** 
	 * @param pedido 
	 * @return the usuarioField
	 */
	public JTextField getUsuarioField(PedidoEvento pedido) {
		if(usuarioField == null) {
			usuarioField = new JTextField();
			usuarioField.setEditable(false);
			usuarioField.setText(pedido.getUsuario());
		}
		return usuarioField;
	}
	/**
	 * @param pedido 
	 * @return the nomeField
	 */
	public JTextField getEventoField(PedidoEvento pedido) {
		if(eventoField == null) {
			eventoField = new JTextField();
			eventoField.setEditable(false);
			eventoField.setText(pedido.getNome());
		}
		return eventoField;
	}
	/**
	 * @param pedido 
	 * @return the dataField
	 */
	public JTextField getDataField(PedidoEvento pedido) {
		if(dataField == null) {
			dataField = new JTextField();
			dataField.setEditable(false);
			dataField.setText(pedido.getData());
		}
		return dataField;
	}
	/**
	 * @param pedido 
	 * @return the horarioField
	 */
	public JTextField getHorarioField(PedidoEvento pedido) {
		if(horarioField == null) {
			horarioField = new JTextField();
			horarioField.setEditable(false);
			horarioField.setText(pedido.getHorario());
		}
		return horarioField;
	}
	/**
	 * @param pedido 
	 * @return the localField
	 */
	public JTextField getLocalField(PedidoEvento pedido) {
		if(localField == null) {
			localField = new JTextField();
			localField.setEditable(false);
			localField.setText(pedido.getLocal());
		}
		return localField;
	}
	/**
	 * @param pedido 
	 * @return the tipoField
	 */
	public JTextField getTipoField(PedidoEvento pedido) {
		if(tipoField == null) {
			tipoField = new JTextField();
			tipoField.setEditable(false);
			tipoField.setText(pedido.getDescTipo());
		}
		return tipoField;
	}
	/**
	 * @param pedido 
	 * @return the quantidadeField
	 */
	public JTextField getQuantidadeField(PedidoEvento pedido) {
		if(quantidadeField == null) {
			quantidadeField = new JTextField();
			quantidadeField.setEditable(false);
			quantidadeField.setText(String.valueOf(pedido.getQuantidade()));
		}
		return quantidadeField;
	}
	/**
	 * @param pedido 
	 * @return the precoField
	 */
	public JTextField getPrecoField(PedidoEvento pedido) {
		if(precoField == null) {
			precoField = new JTextField();
			precoField.setEditable(false);
			precoField.setText("R$ " + String.valueOf(pedido.getPreco()));
		}
		return precoField;
	}
	/**
	 * @param pedido 
	 * @return the precoMeiaField
	 */
	public JTextField getPrecoMeiaField(PedidoEvento pedido) {
		if(precoMeiaField == null) {
			precoMeiaField = new JTextField();
			precoMeiaField.setEditable(false);
			precoMeiaField.setText("R$ " + String.valueOf(pedido.getPrecoMeia()));
		}
		return precoMeiaField;
	}
	
	private GridBagConstraints createConstraintsPrototype() {
		GridBagConstraints gbc = new GridBagConstraints();
		int space = 2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(space, space, space, space);
		return gbc;
	}
	
	/**
	 * @return the usuarioLabelConstraints
	 */
	public GridBagConstraints getUsuarioLabelConstraints() {
		if(usuarioLabelConstraints == null) {
			usuarioLabelConstraints = createConstraintsPrototype();
			usuarioLabelConstraints.gridx = 0;
			usuarioLabelConstraints.gridy = 0;
		}
		return usuarioLabelConstraints;
	}
	/**
	 * @return the nomeLabelConstraints
	 */
	public GridBagConstraints getEventoLabelConstraints() {
		if(eventoLabelConstraints == null) {
			eventoLabelConstraints = createConstraintsPrototype();
			eventoLabelConstraints.gridx = 0;
			eventoLabelConstraints.gridy = 1;
		}
		return eventoLabelConstraints;
	}
	/**
	 * @return the dataLabelConstraints
	 */
	public GridBagConstraints getDataLabelConstraints() {
		if(dataLabelConstraints == null) {
			dataLabelConstraints = createConstraintsPrototype();
			dataLabelConstraints.gridx = 0;
			dataLabelConstraints.gridy = 3;
		}
		return dataLabelConstraints;
	}
	/**
	 * @return the horarioLabelConstraints
	 */
	public GridBagConstraints getHorarioLabelConstraints() {
		if(horarioLabelConstraints == null) {
			horarioLabelConstraints = createConstraintsPrototype();
			horarioLabelConstraints.gridx = 2;
			horarioLabelConstraints.gridy = 3;
		}
		return horarioLabelConstraints;
	}
	/**
	 * @return the localLabelConstraints
	 */
	public GridBagConstraints getLocalLabelConstraints() {
		if(localLabelConstraints == null) {
			localLabelConstraints = createConstraintsPrototype();
			localLabelConstraints.gridx = 0;
			localLabelConstraints.gridy = 2;
		}
		return localLabelConstraints;
	}
	/**
	 * @return the tipoLabelConstraints
	 */
	public GridBagConstraints getTipoLabelConstraints() {
		if(tipoLabelConstraints == null) {
			tipoLabelConstraints = createConstraintsPrototype();
			tipoLabelConstraints.gridx = 4;
			tipoLabelConstraints.gridy = 3;
		}
		return tipoLabelConstraints;
	}
	/**
	 * @return the quantidadeLabelConstraints
	 */
	public GridBagConstraints getQuantidadeLabelConstraints() {
		if(quantidadeLabelConstraints == null) {
			quantidadeLabelConstraints = createConstraintsPrototype();
			quantidadeLabelConstraints.gridx = 0;
			quantidadeLabelConstraints.gridy = 4;
		}
		return quantidadeLabelConstraints;
	}
	/**
	 * @return the precoLabelConstraints
	 */
	public GridBagConstraints getPrecoLabelConstraints() {
		if(precoLabelConstraints == null) {
			precoLabelConstraints = createConstraintsPrototype();
			precoLabelConstraints.gridx = 2;
			precoLabelConstraints.gridy = 4;
		}
		return precoLabelConstraints;
	}
	/**
	 * @return the precoMeiaLabelConstraints
	 */
	public GridBagConstraints getPrecoMeiaLabelConstraints() {
		if(precoMeiaLabelConstraints == null) {
			precoMeiaLabelConstraints = createConstraintsPrototype();
			precoMeiaLabelConstraints.gridx = 4;
			precoMeiaLabelConstraints.gridy = 4;
		}
		return precoMeiaLabelConstraints;
	}
	/**
	 * @return the usuarioFieldConstraints
	 */
	public GridBagConstraints getUsuarioFieldConstraints() {
		if(usuarioFieldConstraints == null) {
			usuarioFieldConstraints = createConstraintsPrototype();
			usuarioFieldConstraints.gridx = 1;
			usuarioFieldConstraints.gridy = 0;
			usuarioFieldConstraints.gridwidth = 5;
		}
		return usuarioFieldConstraints;
	}
	/**
	 * @return the nomeFieldConstraints
	 */
	public GridBagConstraints getEventoFieldConstraints() {
		if(eventoFieldConstraints == null) {
			eventoFieldConstraints = createConstraintsPrototype();
			eventoFieldConstraints.gridx = 1;
			eventoFieldConstraints.gridy = 1;
			eventoFieldConstraints.gridwidth = 5;
		}
		return eventoFieldConstraints;
	}
	/**
	 * @return the dataFieldConstraints
	 */
	public GridBagConstraints getDataFieldConstraints() {
		if(dataFieldConstraints == null) {
			dataFieldConstraints = createConstraintsPrototype();
			dataFieldConstraints.gridx = 1;
			dataFieldConstraints.gridy = 3;
			dataFieldConstraints.ipadx = 80;
		}
		return dataFieldConstraints;
	}
	/**
	 * @return the horarioFieldConstraints
	 */
	public GridBagConstraints getHorarioFieldConstraints() {
		if(horarioFieldConstraints == null) {
			horarioFieldConstraints = createConstraintsPrototype();
			horarioFieldConstraints.gridx = 3;
			horarioFieldConstraints.gridy = 3;
			horarioFieldConstraints.ipadx = 80;
		}
		return horarioFieldConstraints;
	}
	/**
	 * @return the localFieldConstraints
	 */
	public GridBagConstraints getLocalFieldConstraints() {
		if(localFieldConstraints == null) {
			localFieldConstraints = createConstraintsPrototype();
			localFieldConstraints.gridx = 1;
			localFieldConstraints.gridy = 2;
			localFieldConstraints.gridwidth = 5;
		}
		return localFieldConstraints;
	}
	/**
	 * @return the tipoFieldConstraints
	 */
	public GridBagConstraints getTipoFieldConstraints() {
		if(tipoFieldConstraints == null) {
			tipoFieldConstraints = createConstraintsPrototype();
			tipoFieldConstraints.gridx = 5;
			tipoFieldConstraints.gridy = 3;
			tipoFieldConstraints.ipadx = 80;
		}
		return tipoFieldConstraints;
	}
	/**
	 * @return the quantidadeFieldConstraints
	 */
	public GridBagConstraints getQuantidadeFieldConstraints() {
		if(quantidadeFieldConstraints == null) {
			quantidadeFieldConstraints = createConstraintsPrototype();
			quantidadeFieldConstraints.gridx = 1;
			quantidadeFieldConstraints.gridy = 4;
			quantidadeFieldConstraints.ipadx = 80;
		}
		return quantidadeFieldConstraints;
	}
	/**
	 * @return the precoFieldConstraints
	 */
	public GridBagConstraints getPrecoFieldConstraints() {
		if(precoFieldConstraints == null) {
			precoFieldConstraints = createConstraintsPrototype();
			precoFieldConstraints.gridx = 3;
			precoFieldConstraints.gridy = 4;
			precoFieldConstraints.ipadx = 80;
		}
		return precoFieldConstraints;
	}
	/**
	 * @return the precoMeiaFieldConstraints
	 */
	public GridBagConstraints getPrecoMeiaFieldConstraints() {
		if(precoMeiaFieldConstraints == null) {
			precoMeiaFieldConstraints = createConstraintsPrototype();
			precoMeiaFieldConstraints.gridx = 5;
			precoMeiaFieldConstraints.gridy = 4;
			precoMeiaFieldConstraints.ipadx = 80;
		}
		return precoMeiaFieldConstraints;
	}
	
	
}
