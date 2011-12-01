/**
 * 
 */
package br.edu.univas.si.lab4.ingresso.view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import br.edu.univas.si.lab4.ingresso.model.Eventos;

/**
 * @author mauro
 *
 */
public class PanelDataEvento extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private JLabel nomeLabel;
	private JLabel localLabel;
	private JLabel horarioLabel;
	private JLabel precoLabel;
	private JLabel dataLabel;
	
	private JTextField nomeField;
	private JTextField localField;
	private JTextField horarioField;
	private JTextField precoField;
	private JTextField dataField;
	
	private GridBagConstraints nomeLabelConstraints;
	private GridBagConstraints localLabelConstraints;
	private GridBagConstraints horarioLabelConstraints;
	private GridBagConstraints precoLabelConstraints;
	private GridBagConstraints dataLabelConstraints;
	
	private GridBagConstraints nomeFieldConstraints;
	private GridBagConstraints localFieldConstraints;
	private GridBagConstraints horarioFieldConstraints;
	private GridBagConstraints precoFieldConstraints;
	private GridBagConstraints dataFieldConstraints;
	
	private JTable eventoTable;
	private DefaultTableModel tableModel;
	private JScrollPane tableScroll;
	private GridBagConstraints tableConstraints;
	
	public PanelDataEvento() {
		setLayout(new GridBagLayout());
		int space = 6;
		setBorder(new CompoundBorder(new EmptyBorder(space, space, space, space), new CompoundBorder(new TitledBorder("Cadastro de Pessoas"), new EmptyBorder(space, space, space, space))));
		initialize();
	}
	
	private void initialize() {
		add(getNomeLabel(), getNomeLabelConstraints());
		add(getLocalLabel(), getLocalLabelConstraints());
		add(getHorarioLabel(), getHorarioLabelConstraints());
		add(getPrecoLabel(), getPrecoLabelConstraints());
		add(getDataLabel(), getDataLabelConstraints());
		
		add(getNomeField(), getNomeFieldConstraints());
		add(getLocalField(), getLocalFieldConstraints());
		add(getHorarioField(), getHorarioFieldConstraints());
		add(getPrecoField(), getPrecoFieldConstraints());
		add(getDataField(), getDataFieldConstraints());
		add(getTableScroll(), getTableConstraints());
	}

	/**
	 * @return the nomeLabel
	 */
	private JLabel getNomeLabel() {
		if(nomeLabel == null) {
			nomeLabel = new JLabel();
			nomeLabel.setText("Nome:");
		}
		return nomeLabel;
	}
	/**
	 * @return the localLabel
	 */
	private JLabel getLocalLabel() {
		if(localLabel == null) {
			localLabel = new JLabel();
			localLabel.setText("Local:");
		}
		return localLabel;
	}
	/**
	 * @return the horarioLabel
	 */
	private JLabel getHorarioLabel() {
		if(horarioLabel == null) {
			horarioLabel = new JLabel();
			horarioLabel.setText("Horário:");
		}
		return horarioLabel;
	}
	/**
	 * @return the precoLabel
	 */
	private JLabel getPrecoLabel() {
		if(precoLabel == null) {
			precoLabel = new JLabel();
			precoLabel.setText("Preço:");
		}
		return precoLabel;
	}
	/**
	 * @return the dataLabel
	 */
	private JLabel getDataLabel() {
		if(dataLabel == null) {
			dataLabel = new JLabel();
			dataLabel.setText("Data:");
		}
		return dataLabel;
	}
	/**
	 * @return the nomeField
	 */
	private JTextField getNomeField() {
		if(nomeField == null) {
			nomeField = new JTextField();
		}
		return nomeField;
	}
	/**
	 * @return the localField
	 */
	private JTextField getLocalField() {
		if(localField == null) {
			localField = new JTextField();
		}
		return localField;
	}
	/**
	 * @return the horarioField
	 */
	public JTextField getHorarioField() {
		if(horarioField == null) {
			horarioField = new JTextField();
		}
		return horarioField;
	}
	/**
	 * @return the precoField
	 */
	public JTextField getPrecoField() {
		if(precoField == null) {
			precoField = new JTextField();
		}
		return precoField;
	}
	/**
	 * @return the dataField
	 */
	public JTextField getDataField() {
		if(dataField == null) {
			dataField = new JTextField();
		}
		return dataField;
	}
	
	private GridBagConstraints createConstraintsPrototype() {
		GridBagConstraints gbc = new GridBagConstraints();
		int space = 2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(space, space, space, space);
		return gbc;
	}
	
	/**
	 * @return the nomeLabelConstraints
	 */
	public GridBagConstraints getNomeLabelConstraints() {
		if(nomeLabelConstraints == null) {
			nomeLabelConstraints = createConstraintsPrototype();
			nomeLabelConstraints.gridx = 0;
			nomeLabelConstraints.gridy = 0;
		}
		return nomeLabelConstraints;
	}
	/**
	 * @return the localLabelConstraints
	 */
	public GridBagConstraints getLocalLabelConstraints() {
		if(localLabelConstraints == null) {
			localLabelConstraints = createConstraintsPrototype();
			localLabelConstraints.gridx = 0;
			localLabelConstraints.gridy = 1;
		}
		return localLabelConstraints;
	}
	/**
	 * @return the horarioLabelConstraints
	 */
	public GridBagConstraints getHorarioLabelConstraints() {
		if(horarioLabelConstraints == null) {
			horarioLabelConstraints = createConstraintsPrototype();
			horarioLabelConstraints.gridx = 2;
			horarioLabelConstraints.gridy = 1;
		}
		return horarioLabelConstraints;
	}
	/**
	 * @return the precoLabelConstraints
	 */
	public GridBagConstraints getPrecoLabelConstraints() {
		if(precoLabelConstraints == null) {
			precoLabelConstraints = createConstraintsPrototype();
			precoLabelConstraints.gridx = 0;
			precoLabelConstraints.gridy = 2;
		}
		return precoLabelConstraints;
	}
	/**
	 * @return the dataLabelConstraints
	 */
	public GridBagConstraints getDataLabelConstraints() {
		if(dataLabelConstraints == null) {
			dataLabelConstraints = createConstraintsPrototype();
			dataLabelConstraints.gridx = 4;
			dataLabelConstraints.gridy = 1;
		}
		return dataLabelConstraints;
	}
	/**
	 * @return the nomeFieldConstraints
	 */
	public GridBagConstraints getNomeFieldConstraints() {
		if(nomeFieldConstraints == null) {
			nomeFieldConstraints = createConstraintsPrototype();
			nomeFieldConstraints.gridx = 1;
			nomeFieldConstraints.gridy = 0;
			nomeFieldConstraints.gridwidth = 6;
		}
		return nomeFieldConstraints;
	}
	/**
	 * @return the localFieldConstraints
	 */
	public GridBagConstraints getLocalFieldConstraints() {
		if(localFieldConstraints == null) {
			localFieldConstraints = createConstraintsPrototype();
			localFieldConstraints.gridx = 1;
			localFieldConstraints.gridy = 1;
			localFieldConstraints.ipadx = 100;
		}
		return localFieldConstraints;
	}
	/**
	 * @return the horarioFieldConstraints
	 */
	public GridBagConstraints getHorarioFieldConstraints() {
		if(horarioFieldConstraints == null) {
			horarioFieldConstraints = createConstraintsPrototype();
			horarioFieldConstraints.gridx = 3;
			horarioFieldConstraints.gridy = 1;
			horarioFieldConstraints.ipadx = 100;
		}
		return horarioFieldConstraints;
	}
	/**
	 * @return the precoFieldConstraints
	 */
	public GridBagConstraints getPrecoFieldConstraints() {
		if(precoFieldConstraints == null) {
			precoFieldConstraints = createConstraintsPrototype();
			precoFieldConstraints.gridx = 1;
			precoFieldConstraints.gridy = 2;
		}
		return precoFieldConstraints;
	}
	/**
	 * @return the dataFieldConstraints
	 */
	public GridBagConstraints getDataFieldConstraints() {
		if(dataFieldConstraints == null) {
			dataFieldConstraints = createConstraintsPrototype();
			dataFieldConstraints.gridx = 5;
			dataFieldConstraints.gridy = 1;
			dataFieldConstraints.ipadx = 100;
		}
		return dataFieldConstraints;
	}
	/**
	 * @return the eventoTable
	 */
	public JTable getEventoTable() {
		if(eventoTable == null) {
			eventoTable = new JTable();
			eventoTable.setModel(getTableModel());
		}
		return eventoTable;
	}
	/**
	 * @return the tableModel
	 */
	public DefaultTableModel getTableModel() {
		if(tableModel == null) {
			tableModel = new DefaultTableModel();
			tableModel.setColumnIdentifiers(new String [] {
				"Nome", "local", "Horário", "Data", "Preço"	
			});
		}
		return tableModel;
	}
	/**
	 * @return the tableScroll
	 */
	public JScrollPane getTableScroll() {
		if(tableScroll == null) {
			tableScroll = new JScrollPane(getEventoTable());
			tableScroll.setPreferredSize(new Dimension(0, 0));
		}
		return tableScroll;
	}
	/**
	 * @return the tableConstraints
	 */
	public GridBagConstraints getTableConstraints() {
		if(tableConstraints == null) {
			tableConstraints = createConstraintsPrototype();
			tableConstraints.gridx = 0;
			tableConstraints.gridy = 3;
			tableConstraints.gridwidth = 7;
			tableConstraints.ipady = 200;
		}
		return tableConstraints;
	}
	
	public Eventos getEventos() {
		Eventos e = new Eventos();
		e.setNome(getNomeField().getText());
		e.setData(getDataField().getText());
		e.setHorario(getHorarioField().getText());
		e.setLocal(getLocalField().getText());
		e.setPreco(getPrecoField().getText());
		return e;
	}
	
	public void addEventos(Eventos evento) {
		String [] novaLinha = new String [] {
				evento.getNome(),
				evento.getLocal(),
				evento.getHorario(),
				evento.getData(),
				evento.getPreco()
		};
		getTableModel().addRow(novaLinha);
	}
}
