/**
 * 
 */
package br.edu.univas.si.lab4.ingresso.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

import br.edu.univas.si.lab4.ingresso.model.PessoasTO;

/**
 * @author mauro
 *
 */
public class PanelDataResultPessoa extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private JLabel nomeLabel;
	private JLabel cpfLabel;
	private JLabel cartaoCredLabel;
	private JLabel bandeiraCCLabel;
	private JLabel validadeCCLabel;
	private JLabel emailLabel;
	private JLabel enderecoLabel;
	private JLabel cepLabel;
	private JLabel cidadeLabel;
	private JLabel estadoLabel;
	private JLabel telefoneLabel;
	
	private JTextField nomeField;
	private JTextField cpfField;
	private JTextField cartaoCredField;
	private JTextField bandeiraCCField;
	private JTextField validadeCCField;
	private JTextField emailField;
	private JTextField enderecoField;
	private JTextField cepField;
	private JTextField cidadeField;
	private JTextField estadoField;
	private JTextField telefoneField;
	
	private GridBagConstraints nomeLabelConstraints;
	private GridBagConstraints cpfLabelConstraints;
	private GridBagConstraints cartaoCredLabelConstraints;
	private GridBagConstraints bandeiraCCLabelConstraints;
	private GridBagConstraints validadeCCLabelConstraints;
	private GridBagConstraints emailLabelConstraints;
	private GridBagConstraints enderecoLabelConstraints;
	private GridBagConstraints cepLabelConstraints;
	private GridBagConstraints cidadeLabelConstraints;
	private GridBagConstraints estadoLabelConstraints;
	private GridBagConstraints telefoneLabelConstraints;
	
	private GridBagConstraints nomeFieldConstraints;
	private GridBagConstraints cpfFieldConstraints;
	private GridBagConstraints cartaoCredFieldConstraints;
	private GridBagConstraints bandeiraCCFieldConstraints;
	private GridBagConstraints validadeCCFieldConstraints;
	private GridBagConstraints emailFieldConstraints;
	private GridBagConstraints enderecoFieldConstraints;
	private GridBagConstraints cepFieldConstraints;
	private GridBagConstraints cidadeFieldConstraints;
	private GridBagConstraints estadoFieldConstraints;
	private GridBagConstraints telefoneFieldConstraints;
	
	public PanelDataResultPessoa(PessoasTO pessoa) {
		setLayout(new GridBagLayout());
		int space = 6;
		setBorder(new CompoundBorder(new EmptyBorder(space, space, space, space), new CompoundBorder(new TitledBorder("Resultado da Consulta"), new EmptyBorder(space, space, space, space))));
		initialize(pessoa);
	}

	private void initialize(PessoasTO pessoa) {
		add(getNomeLabel(), getNomeLabelConstraints());
		add(getCpfLabel(), getCpfLabelConstraints());
		add(getCartaoCredLabel(), getCartaoCredLabelConstraints());
		add(getValidadeCCLabel(), getValidadeCCLabelConstraints());
		add(getBandeiraCCLabel(), getBandeiraCCLabelConstraints());
		add(getEmailLabel(), getEmailLabelConstraints());
		add(getTelefoneLabel(), getTelefoneLabelConstraints());
		add(getEnderecoLabel(), getEnderecoLabelConstraints());
		add(getCepLabel(), getCepLabelConstraints());
		add(getCidadeLabel(), getCidadeLabelConstraints());
		add(getEstadoLabel(), getEstadoLabelConstraints());
		
		add(getNomeField(pessoa), getNomeFieldConstraints());
		add(getCpfField(pessoa), getCpfFieldConstraints());
		add(getCartaoCredField(pessoa), getCartaoCredFieldConstraints());
		add(getValidadeCCField(pessoa), getValidadeCCFieldConstraints());
		add(getBandeiraCCField(pessoa), getBandeiraCCFieldConstraints());
		add(getEmailField(pessoa), getEmailFieldConstraints());
		add(getTelefoneField(pessoa), getTelefoneFieldConstraints());
		add(getEnderecoField(pessoa), getEnderecoFieldConstraints());
		add(getCepField(pessoa), getCepFieldConstraints());
		add(getCidadeField(pessoa), getCidadeFieldConstraints());
		add(getEstadoField(pessoa), getEstadoFieldConstraints());
	}

	/**
	 * @return the nomeLabel
	 */
	public JLabel getNomeLabel() {
		if(nomeLabel == null) {
			nomeLabel = new JLabel();
			nomeLabel.setText("Nome:");
		}
		return nomeLabel;
	}

	/**
	 * @return the cpfLabel
	 */
	public JLabel getCpfLabel() {
		if(cpfLabel == null) {
			cpfLabel = new JLabel();
			cpfLabel.setText("CPF:");
		}
		return cpfLabel;
	}

	/**
	 * @return the cartaoCredLabel
	 */
	public JLabel getCartaoCredLabel() {
		if(cartaoCredLabel == null) {
			cartaoCredLabel = new JLabel();
			cartaoCredLabel.setText("Cartão de Crédito Nº:");
		}
		return cartaoCredLabel;
	}

	/**
	 * @return the bandeiraCCLabel
	 */
	public JLabel getBandeiraCCLabel() {
		if(bandeiraCCLabel == null) {
			bandeiraCCLabel = new JLabel();
			bandeiraCCLabel.setText("Bandeira do Cartão:");
		}
		return bandeiraCCLabel;
	}

	/**
	 * @return the validadeCCLabel
	 */
	public JLabel getValidadeCCLabel() {
		if(validadeCCLabel == null) {
			validadeCCLabel = new JLabel();
			validadeCCLabel.setText("Data da validade (mês/ano):");
		}
		return validadeCCLabel;
	}

	/**
	 * @return the emailLabel
	 */
	public JLabel getEmailLabel() {
		if(emailLabel == null) {
			emailLabel = new JLabel();
			emailLabel.setText("E-mail:");
		}
		return emailLabel;
	}

	/**
	 * @return the enderecoLabel
	 */
	public JLabel getEnderecoLabel() {
		if(enderecoLabel == null) {
			enderecoLabel = new JLabel();
			enderecoLabel.setText("Endereço:");
		}
		return enderecoLabel;
	}

	/**
	 * @return the cepLabel
	 */
	public JLabel getCepLabel() {
		if(cepLabel == null) {
			cepLabel = new JLabel();
			cepLabel.setText("CEP:");
		}
		return cepLabel;
	}

	/**
	 * @return the cidadeLabel
	 */
	public JLabel getCidadeLabel() {
		if(cidadeLabel == null) {
			cidadeLabel = new JLabel();
			cidadeLabel.setText("Cidade:");
		}
		return cidadeLabel;
	}

	/**
	 * @return the estadoLabel
	 */
	public JLabel getEstadoLabel() {
		if(estadoLabel == null) {
			estadoLabel = new JLabel();
			estadoLabel.setText("Estado:");
		}
		return estadoLabel;
	}

	/**
	 * @return the telefoneLabel
	 */
	public JLabel getTelefoneLabel() {
		if(telefoneLabel == null) {
			telefoneLabel = new JLabel();
			telefoneLabel.setText("Telefone:");
		}
		return telefoneLabel;
	}

	/**
	 * @param pessoa 
	 * @return the nomeField
	 */
	public JTextField getNomeField(PessoasTO pessoa) {
		if(nomeField == null) {
			nomeField = new JTextField();
			nomeField.setEditable(false);
			nomeField.setText(pessoa.getNome());
		}
		return nomeField;
	}

	/**
	 * @param pessoa 
	 * @return the cpfField
	 */
	public JTextField getCpfField(PessoasTO pessoa) {
		if(cpfField == null) {
			cpfField = new JTextField();
			try {
				cpfField = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			cpfField.setEditable(false);
			cpfField.setText(pessoa.getCpf());
		}
		return cpfField;
	}

	/**
	 * @param pessoa 
	 * @return the cartaoCredField
	 */
	public JTextField getCartaoCredField(PessoasTO pessoa) {
		if(cartaoCredField == null) {
			cartaoCredField = new JTextField();
			cartaoCredField.setEditable(false);
			cartaoCredField. setText(pessoa.getCartaoCred());
		}
		return cartaoCredField;
	}

	/**
	 * @param pessoa 
	 * @return the bandeiraCCField
	 */
	public JTextField getBandeiraCCField(PessoasTO pessoa) {
		if(bandeiraCCField == null) {
			bandeiraCCField = new JTextField();
			bandeiraCCField.setEditable(false);
			bandeiraCCField.setText(pessoa.getBandeiraCC());
		}
		return bandeiraCCField;
	}

	/**
	 * @param pessoa 
	 * @return the validadeCCField
	 */
	public JTextField getValidadeCCField(PessoasTO pessoa) {
		if(validadeCCField == null) {
			validadeCCField = new JTextField();
			validadeCCField.setEditable(false);
			validadeCCField.setText(pessoa.getValidadeCC());
		}
		return validadeCCField;
	}

	/**
	 * @param pessoa 
	 * @return the emailField
	 */
	public JTextField getEmailField(PessoasTO pessoa) {
		if(emailField == null) {
			emailField = new JTextField();
			emailField.setEditable(false);
			emailField.setText(pessoa.getEmail());
		}
		return emailField;
	}

	/**
	 * @param pessoa 
	 * @return the enderecoField
	 */
	public JTextField getEnderecoField(PessoasTO pessoa) {
		if(enderecoField == null) {
			enderecoField = new JTextField();
			enderecoField.setEditable(false);
			enderecoField.setText(pessoa.getEndereco());
		}
		return enderecoField;
	}

	/**
	 * @param pessoa 
	 * @return the cepField
	 */
	public JTextField getCepField(PessoasTO pessoa) {
		if(cepField == null) {
			cepField = new JTextField();
			try {
				cepField = new JFormattedTextField(new MaskFormatter("#####-###"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			cepField.setEditable(false);
			cepField.setText(pessoa.getCep());
		}
		return cepField;
	}

	/**
	 * @param pessoa 
	 * @return the cidadeField
	 */
	public JTextField getCidadeField(PessoasTO pessoa) {
		if(cidadeField == null) {
			cidadeField = new JTextField();
			cidadeField.setEditable(false);
			cidadeField.setText(pessoa.getCidade());
		}
		return cidadeField;
	}

	/**
	 * @param pessoa 
	 * @return the estadoField
	 */
	public JTextField getEstadoField(PessoasTO pessoa) {
		if(estadoField == null) {
			estadoField = new JTextField();
			estadoField.setEditable(false);
			estadoField.setText(pessoa.getEstado());
		}
		return estadoField;
	}

	/**
	 * @param pessoa 
	 * @return the telefoneField
	 */
	public JTextField getTelefoneField(PessoasTO pessoa) {
		if(telefoneField == null) {
			telefoneField = new JTextField();
			try {
				telefoneField = new JFormattedTextField(new MaskFormatter("(##)#### ####"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			telefoneField.setEditable(false);
			telefoneField.setText(pessoa.getTelefone());
		}
		return telefoneField;
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
	 * @return the cpfLabelConstraints
	 */
	public GridBagConstraints getCpfLabelConstraints() {
		if(cpfLabelConstraints == null) {
			cpfLabelConstraints = createConstraintsPrototype();
			cpfLabelConstraints.gridx = 0;
			cpfLabelConstraints.gridy = 1;
		}
		return cpfLabelConstraints;
	}

	/**
	 * @return the cartaoCredLabelConstraints
	 */
	public GridBagConstraints getCartaoCredLabelConstraints() {
		if(cartaoCredLabelConstraints == null) {
			cartaoCredLabelConstraints = createConstraintsPrototype();
			cartaoCredLabelConstraints.gridx = 4;
			cartaoCredLabelConstraints.gridy = 1;
		}
		return cartaoCredLabelConstraints;
	}

	/**
	 * @return the bandeiraCCLabelConstraints
	 */
	public GridBagConstraints getBandeiraCCLabelConstraints() {
		if(bandeiraCCLabelConstraints == null) {
			bandeiraCCLabelConstraints = createConstraintsPrototype();
			bandeiraCCLabelConstraints.gridx = 0;
			bandeiraCCLabelConstraints.gridy = 2;
		}
		return bandeiraCCLabelConstraints;
	}

	/**
	 * @return the validadeCCLabelConstraints
	 */
	public GridBagConstraints getValidadeCCLabelConstraints() {
		if(validadeCCLabelConstraints == null) {
			validadeCCLabelConstraints = createConstraintsPrototype();
			validadeCCLabelConstraints.gridx = 4;
			validadeCCLabelConstraints.gridy = 2;
		}
		return validadeCCLabelConstraints;
	}

	/**
	 * @return the emailLabelConstraints
	 */
	public GridBagConstraints getEmailLabelConstraints() {
		if(emailLabelConstraints == null) {
			emailLabelConstraints = createConstraintsPrototype();
			emailLabelConstraints.gridx = 0;
			emailLabelConstraints.gridy = 3;
		}
		return emailLabelConstraints;
	}

	/**
	 * @return the enderecoLabelConstraints
	 */
	public GridBagConstraints getEnderecoLabelConstraints() {
		if(enderecoLabelConstraints == null) {
			enderecoLabelConstraints = createConstraintsPrototype();
			enderecoLabelConstraints.gridx = 0;
			enderecoLabelConstraints.gridy = 4;
		}
		return enderecoLabelConstraints;
	}

	/**
	 * @return the cepLabelConstraints
	 */
	public GridBagConstraints getCepLabelConstraints() {
		if(cepLabelConstraints == null) {
			cepLabelConstraints = createConstraintsPrototype();
			cepLabelConstraints.gridx = 0;
			cepLabelConstraints.gridy = 5;
		}
		return cepLabelConstraints;
	}

	/**
	 * @return the cidadeLabelConstraints
	 */
	public GridBagConstraints getCidadeLabelConstraints() {
		if(cidadeLabelConstraints == null) {
			cidadeLabelConstraints = createConstraintsPrototype();
			cidadeLabelConstraints.gridx = 3;
			cidadeLabelConstraints.gridy = 5;
		}
		return cidadeLabelConstraints;
	}

	/**
	 * @return the estadoLabelConstraints
	 */
	public GridBagConstraints getEstadoLabelConstraints() {
		if(estadoLabelConstraints == null) {
			estadoLabelConstraints = createConstraintsPrototype();
			estadoLabelConstraints.gridx = 7;
			estadoLabelConstraints.gridy = 5;
		}
		return estadoLabelConstraints;
	}

	/**
	 * @return the telefoneLabelConstraints
	 */
	public GridBagConstraints getTelefoneLabelConstraints() {
		if(telefoneLabelConstraints == null) {
			telefoneLabelConstraints = createConstraintsPrototype();
			telefoneLabelConstraints.gridx = 4;
			telefoneLabelConstraints.gridy = 3;
		}
		return telefoneLabelConstraints;
	}

	/**
	 * @return the nomeFieldConstraints
	 */
	public GridBagConstraints getNomeFieldConstraints() {
		if(nomeFieldConstraints == null) {
			nomeFieldConstraints = createConstraintsPrototype();
			nomeFieldConstraints.gridx = 1;
			nomeFieldConstraints.gridy = 0;
			nomeFieldConstraints.gridwidth = 8;
		}
		return nomeFieldConstraints;
	}

	/**
	 * @return the cpfFieldConstraints
	 */
	public GridBagConstraints getCpfFieldConstraints() {
		if(cpfFieldConstraints == null) {
			cpfFieldConstraints = createConstraintsPrototype();
			cpfFieldConstraints.gridx = 1;
			cpfFieldConstraints.gridy = 1;
			cpfFieldConstraints.gridwidth = 3;
		}
		return cpfFieldConstraints;
	}

	/**
	 * @return the cartaoCredFieldConstraints
	 */
	public GridBagConstraints getCartaoCredFieldConstraints() {
		if(cartaoCredFieldConstraints == null) {
			cartaoCredFieldConstraints = createConstraintsPrototype();
			cartaoCredFieldConstraints.gridx = 5;
			cartaoCredFieldConstraints.gridy = 1;
			cartaoCredFieldConstraints.gridwidth = 4;
		}
		return cartaoCredFieldConstraints;
	}

	/**
	 * @return the bandeiraCCFieldConstraints
	 */
	public GridBagConstraints getBandeiraCCFieldConstraints() {
		if(bandeiraCCFieldConstraints == null) {
			bandeiraCCFieldConstraints = createConstraintsPrototype();
			bandeiraCCFieldConstraints.gridx = 1;
			bandeiraCCFieldConstraints.gridy = 2;
			bandeiraCCFieldConstraints.gridwidth = 3;
		}
		return bandeiraCCFieldConstraints;
	}

	/**
	 * @return the validadeCCFieldConstraints
	 */
	public GridBagConstraints getValidadeCCFieldConstraints() {
		if(validadeCCFieldConstraints == null) {
			validadeCCFieldConstraints = createConstraintsPrototype();
			validadeCCFieldConstraints.gridx = 5;
			validadeCCFieldConstraints.gridy = 2;
			validadeCCFieldConstraints.gridwidth = 2;
		}
		return validadeCCFieldConstraints;
	}

	/**
	 * @return the emailFieldConstraints
	 */
	public GridBagConstraints getEmailFieldConstraints() {
		if(emailFieldConstraints == null) {
			emailFieldConstraints = createConstraintsPrototype();
			emailFieldConstraints.gridx = 1;
			emailFieldConstraints.gridy = 3;
			emailFieldConstraints.gridwidth = 3;
		}
		return emailFieldConstraints;
	}

	/**
	 * @return the enderecoFieldConstraints
	 */
	public GridBagConstraints getEnderecoFieldConstraints() {
		if(enderecoFieldConstraints == null) {
			enderecoFieldConstraints = createConstraintsPrototype();
			enderecoFieldConstraints.gridx = 1;
			enderecoFieldConstraints.gridy = 4;
			enderecoFieldConstraints.gridwidth = 8;
		}
		return enderecoFieldConstraints;
	}

	/**
	 * @return the cepFieldConstraints
	 */
	public GridBagConstraints getCepFieldConstraints() {
		if(cepFieldConstraints == null) {
			cepFieldConstraints = createConstraintsPrototype();
			cepFieldConstraints.gridx = 1;
			cepFieldConstraints.gridy = 5;
			cepFieldConstraints.gridwidth = 2;
			cepFieldConstraints.ipadx = 80;
		}
		return cepFieldConstraints;
	}

	/**
	 * @return the cidadeFieldConstraints
	 */
	public GridBagConstraints getCidadeFieldConstraints() {
		if(cidadeFieldConstraints == null) {
			cidadeFieldConstraints = createConstraintsPrototype();
			cidadeFieldConstraints.gridx = 4;
			cidadeFieldConstraints.gridy = 5;
			cidadeFieldConstraints.gridwidth = 3;
			cidadeFieldConstraints.ipadx = 100;
		}
		return cidadeFieldConstraints;
	}

	/**
	 * @return the estadoFieldConstraints
	 */
	public GridBagConstraints getEstadoFieldConstraints() {
		if(estadoFieldConstraints == null) {
			estadoFieldConstraints = createConstraintsPrototype();
			estadoFieldConstraints.gridx = 8;
			estadoFieldConstraints.gridy = 5;
		}
		return estadoFieldConstraints;
	}

	/**
	 * @return the telefoneFieldConstraints
	 */
	public GridBagConstraints getTelefoneFieldConstraints() {
		if(telefoneFieldConstraints == null) {
			telefoneFieldConstraints = createConstraintsPrototype();
			telefoneFieldConstraints.gridx = 5;
			telefoneFieldConstraints.gridy = 3;
			telefoneFieldConstraints.gridwidth = 3;
		}
		return telefoneFieldConstraints;
	}
}
