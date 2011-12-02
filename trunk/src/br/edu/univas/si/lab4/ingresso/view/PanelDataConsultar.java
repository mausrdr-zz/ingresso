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

/**
 * @author mauro
 *
 */
public class PanelDataConsultar extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private JLabel cpfLabel;
	
	private JTextField cpfField;
	
	private GridBagConstraints cpfLabelConstraints;
	
	private GridBagConstraints cpfFieldConstraints;
	
	public PanelDataConsultar() {
		setLayout(new GridBagLayout());
		int space = 2;
		setBorder(new CompoundBorder(new EmptyBorder(space, space, space, space), new CompoundBorder(new TitledBorder("Busca"), new EmptyBorder(space, space, space, space))));
		initialize();
	}

	private void initialize() {
		add(getCpfLabel(), getCpfLabelConstraints());
		add(getCpfField(), getCpfFieldConstraints());
	}

	/**
	 * @return the cpfLabel
	 */
	public JLabel getCpfLabel() {
		if(cpfLabel == null) {
			cpfLabel = new JLabel();
			cpfLabel.setText("CPF: ");
		}
		return cpfLabel;
	}

	/**
	 * @return the cpfField
	 */
	public JTextField getCpfField() {
		if(cpfField == null) {
			cpfField = new JTextField();
			cpfField.setToolTipText("Informe o CPF a ser buscado");
		}
		return cpfField;
	}

	private GridBagConstraints createConstraintsPrototype() {
		GridBagConstraints gbc = new GridBagConstraints();
		int space = 2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(space, space, space, space);
		return gbc;
	}
	/**
	 * @return the cpfLabelConstraints
	 */
	public GridBagConstraints getCpfLabelConstraints() {
		if(cpfLabelConstraints == null) {
			cpfLabelConstraints = createConstraintsPrototype();
			cpfLabelConstraints.gridx = 0;
			cpfLabelConstraints.gridy = 0;
		}
		return cpfLabelConstraints;
	}

	/**
	 * @return the cpfFieldConstraints
	 */
	public GridBagConstraints getCpfFieldConstraints() {
		if(cpfFieldConstraints == null) {
			cpfFieldConstraints = createConstraintsPrototype();
			cpfFieldConstraints.gridx = 1;
			cpfFieldConstraints.gridy = 0;
			cpfFieldConstraints.ipadx = 100;
		}
		return cpfFieldConstraints;
	}
	
	public String getCpfBusca() {
		String s = getCpfField().getText();
		return s;
	}
}
