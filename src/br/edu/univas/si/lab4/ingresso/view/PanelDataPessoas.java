/**
 * 
 */
package br.edu.univas.si.lab4.ingresso.view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import br.edu.univas.si.lab4.ingresso.model.CPF;
import br.edu.univas.si.lab4.ingresso.model.CartaoCredito;
import br.edu.univas.si.lab4.ingresso.model.PessoasTO;

/**
 * @author mauro
 *
 */
public class PanelDataPessoas extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private JLabel nomeLabel;
	private JLabel cpfLabel;
	private JLabel cartaoCredLabel;
	private JLabel validadeCCLabel;
	private JLabel bandeiraCCLabel;
	private JLabel emailLabel;
	private JLabel enderecoLabel;
	private JLabel cepLabel;
	private JLabel cidadeLabel;
	private JLabel estadoLabel;
	private JLabel telefoneLabel;
	private JLabel tipoLabel;
	
	private JTextField nomeField;
	private JTextField cpfField;
	private JTextField cartaoCredField;
	private JComboBox validadeCCField;
	private JTextField bandeiraCCField;
	private JTextField emailField;
	private JTextField enderecoField;
	private JTextField cepField;
	private JTextField cidadeField;
	private JComboBox estadoField;
	private JTextField telefoneField;
	private JComboBox tipoField;
	
	private GridBagConstraints nomeLabelConstraints;
	private GridBagConstraints cpfLabelConstraints;
	private GridBagConstraints cartaoCredLabelConstraints;
	private GridBagConstraints validadeCCLabelConstraints;
	private GridBagConstraints bandeiraCCLabelConstraints;
	private GridBagConstraints emailLabelConstraints;
	private GridBagConstraints enderecoLabelConstraints;
	private GridBagConstraints cepLabelConstraints;
	private GridBagConstraints cidadeLabelConstraints;
	private GridBagConstraints estadoLabelConstraints;
	private GridBagConstraints telefoneLabelConstraints;
	private GridBagConstraints tipoLabelConstraints;
	
	private GridBagConstraints nomeFieldConstraints;
	private GridBagConstraints cpfFieldConstraints;
	private GridBagConstraints cartaoCredFieldConstraints;
	private GridBagConstraints validadeCCFieldConstraints;
	private GridBagConstraints bandeiraCCFieldConstraints;
	private GridBagConstraints emailFieldConstraints;
	private GridBagConstraints enderecoFieldConstraints;
	private GridBagConstraints cepFieldConstraints;
	private GridBagConstraints cidadeFieldConstraints;
	private GridBagConstraints estadoFieldConstraints;
	private GridBagConstraints telefoneFieldConstraints;
	private GridBagConstraints tipoFieldConstraints;
	
	//Components for display one JTable
	private JTable pessoasTable;
	private DefaultTableModel tableModel;
	private JScrollPane tableScroll;
	private GridBagConstraints tableConstraints;
	
	public PanelDataPessoas() {
		setLayout(new GridBagLayout());
		int space = 6;
		setBorder(new CompoundBorder(new EmptyBorder(space, space, space, space), new CompoundBorder(new TitledBorder("Cadastro de Pessoas"), new EmptyBorder(space, space, space, space))));
		initialize();
	}

	private void initialize() {
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
		add(getTipoLabel(), getTipoLabelConstraints());
		
		add(getNomeField(), getNomeFieldConstraints());
		add(getCpfField(), getCpfFieldConstraints());
		add(getCartaoCredField(), getCartaoCredFieldConstraints());
		add(getValidadeCCField(), getValidadeCCFieldConstraints());
		add(getBandeiraCCField(), getBandeiraCCFieldConstraints());
		add(getEmailField(), getEmailFieldConstraints());
		add(getTelefoneField(), getTelefoneFieldConstraints());
		add(getEnderecoField(), getEnderecoFieldConstraints());
		add(getCepField(), getCepFieldConstraints());
		add(getCidadeField(), getCidadeFieldConstraints());
		add(getEstadoField(), getEstadoFieldConstraints());
		add(getTipoField(), getTipoFieldConstraints());
		add(getTableScroll(), getTableConstraints());
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
		if(cpfLabel == null){
			cpfLabel = new JLabel();
			cpfLabel.setText("CPF:");
		}
		return cpfLabel;
	}

	/**
	 * @return the cartaoCredLabel
	 */
	public JLabel getCartaoCredLabel() {
		if(cartaoCredLabel == null){
			cartaoCredLabel = new JLabel();
			cartaoCredLabel.setText("Cartão de Crédito Nº:");
		}
		return cartaoCredLabel;
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
	 * @return the tipoLabel
	 */
	public JLabel getTipoLabel() {
		if(tipoLabel == null) {
			tipoLabel = new JLabel();
			tipoLabel.setText("Tipo:");
		}
		return tipoLabel;
	}

	/**
	 * @return the nomeField
	 */
	public JTextField getNomeField() {
		if(nomeField == null) {
			nomeField = new JTextField();
			nomeField.setToolTipText("Informe seu nome completo");
		}
		return nomeField;
	}

	/**
	 * @return the cpfField
	 */
	public JTextField getCpfField() {
		if(cpfField == null) {
			cpfField = new JTextField();
			try {
				cpfField = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			cpfField.setToolTipText("Informe apenas números");
			cpfField.addFocusListener(new FocusAdapter() {
				public void focusLost (FocusEvent e) {
						try {
							cpfFieldLosFocus(e);
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
				}
			});
		}
		return cpfField;
	}

	protected void cpfFieldLosFocus(FocusEvent e) throws Exception {
		if(!cpfField.getText().equals("   .   .   -  ")) {
			if(!CPF.validaCPF(getCpfSemMask())) {
				JOptionPane.showMessageDialog(null, "CPF inválido! \n Informe um CPF válido!", "Atenção", JOptionPane.ERROR_MESSAGE);
				cpfField.setText("");
				cpfField.grabFocus();
			}
		}
	}

	private String getCpfSemMask() {
		String n = cpfField.getText().toString();
		int j = n.length();
		String [] s1 = new String [j];
		String numero = "";
		
		for(int i=0; i < n.length(); i++) {
			s1[i] = "" + n.charAt(i);
			if(!s1[i].equals(".") && !s1[i].equals("-")) {
				numero += s1[i];
			}
		}
		return numero;
	}

	/**
	 * @return the cartaoCredField
	 */
	public JTextField getCartaoCredField() {
		if(cartaoCredField == null) {
			cartaoCredField = new JTextField();
			try {
				cartaoCredField = new JFormattedTextField(new MaskFormatter("################"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			cartaoCredField.setToolTipText("Informe apenas números");
			cartaoCredField.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					try {
						cartaoCredFieldLostFocus(e);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
		}
		return cartaoCredField;
	}

	protected void cartaoCredFieldLostFocus(FocusEvent e) throws Exception {
		if(!cartaoCredField.getText().equals("                ")) {
			if(!CartaoCredito.validaCC(cartaoCredField.getText().toString())) {
				JOptionPane.showMessageDialog(null, "Cartão de Crédito inválido! \n Informe um cartão de crédito válido!", "Atenção", JOptionPane.ERROR_MESSAGE);
				cartaoCredField.setText("");
				cartaoCredField.grabFocus();
			}
			else {
				bandeiraCCField.setText(CartaoCredito.getNomeCartao(CartaoCredito.getCartaoID(cartaoCredField.getText().toString())));
			}
		}
	}

	/**
	 * @return the validadeCCField
	 */
	public JComboBox getValidadeCCField() {
		if(validadeCCField == null) {
			validadeCCField = new JComboBox(getDatas());
			validadeCCField.setToolTipText("Informe a validade do cartão");
		}
		return validadeCCField;
	}

	private String[] getDatas() {
		Date hoje = new Date();
		SimpleDateFormat sdMes = new SimpleDateFormat("MM");
		SimpleDateFormat sdAno = new SimpleDateFormat("yy");
		int mes = Integer.valueOf(sdMes.format(hoje)).intValue();
		int ano = Integer.valueOf(sdAno.format(hoje)).intValue();
		int i = 0;
		int j = mes;
		int k = 0;
		String [] datas = new String [49] ;
		
		for( i=ano; i < ano + 5; i++) {
			for( ; j < 13; j++) {
				if(i == ano + 4 && j > mes) {
					break;
				}
				else {
					datas[k] = "" + j + "/" + i;
					k++;
				}
			}
			j = 1;
		}
		return datas;
	}

	/**
	 * @return the bandeiraCCField
	 */
	public JTextField getBandeiraCCField() {
		if(bandeiraCCField == null) {
			bandeiraCCField = new JTextField();
			bandeiraCCField.setEditable(false);
			bandeiraCCField.setToolTipText("Ao informar o número do Cartão de Crédito este campo será preenchido");
		}
		return bandeiraCCField;
	}

	/**
	 * @return the emailField
	 */
	public JTextField getEmailField() {
		if(emailField == null) {
			emailField = new JTextField();
			emailField.setToolTipText("Informe seu e-mail");
		}
		return emailField;
	}

	/**
	 * @return the enderecoField
	 */
	public JTextField getEnderecoField() {
		if(enderecoField == null) {
			enderecoField = new JTextField();
			enderecoField.setToolTipText("Informe seu endereço");
		}
		return enderecoField;
	}

	/**
	 * @return the cepField
	 */
	public JTextField getCepField() {
		if(cepField == null) {
			cepField = new JTextField();
			try {
				cepField = new JFormattedTextField(new MaskFormatter("#####-###"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			cepField.setToolTipText("Informe seu CEP");
		}
		return cepField;
	}

	/**
	 * @return the cidadeField
	 */
	public JTextField getCidadeField() {
		if(cidadeField == null) {
			cidadeField = new JTextField();
			cidadeField.setToolTipText("Informe sua cidade");
		}
		return cidadeField;
	}

	/**
	 * @return the estadoField
	 */
	public JComboBox getEstadoField() {
		if(estadoField == null) {
			String[] estados = new String []{
					"AC","AL","AP","AM","BA",
					"CE","DF","ES","GO","MA",
					"MT","MS","MG","PA","PB",
					"PR","PE","PI","RJ","RN",
					"RS","RO","RR","SC","SP",
					"SE","TO"
			};
			estadoField = new JComboBox(estados);
		}
		return estadoField;
	}

	/**
	 * @return the telefoneField
	 */
	public JTextField getTelefoneField() {
		if(telefoneField == null) {
			telefoneField = new JTextField();
			try {
				telefoneField = new JFormattedTextField(new MaskFormatter("(##)####-####"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			telefoneField.setToolTipText("Informe seu telefone");
		}
		return telefoneField;
	}
	
	/**
	 * @return the tipoField
	 */
	public JComboBox getTipoField() {
		if(tipoField == null) {
			String [] itens = new String [] {
				"Cliente", "Promotor de Eventos"	
			};
			tipoField = new JComboBox(itens);
		}
		return tipoField;
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
	 * @return the tipoLabelConstraints
	 */
	public GridBagConstraints getTipoLabelConstraints() {
		if(tipoLabelConstraints == null) {
			tipoLabelConstraints = createConstraintsPrototype();
			tipoLabelConstraints.gridx = 0;
			tipoLabelConstraints.gridy = 6;
		}
		return tipoLabelConstraints;
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

	/**
	 * @return the tipoFieldConstraints
	 */
	public GridBagConstraints getTipoFieldConstraints() {
		if(tipoFieldConstraints == null) {
			tipoFieldConstraints = createConstraintsPrototype();
			tipoFieldConstraints.gridx = 1;
			tipoFieldConstraints.gridy = 6;
		}
		return tipoFieldConstraints;
	}

	/**
	 * @return the pessoasTable
	 */
	public JTable getPessoasTable() {
		if(pessoasTable == null) {
			pessoasTable = new JTable();
			pessoasTable.setModel(getTableModel());
		}
		return pessoasTable;
	}

	/**
	 * @return the tableModel
	 */
	public DefaultTableModel getTableModel() {
		if(tableModel == null) {
			tableModel = new DefaultTableModel();
			tableModel.setColumnIdentifiers(new String [] {
					"Nome", "CPF", "Cartão de Crédito", "Validade", "Bandeira", "E-mail", "Telefone",
					"Endereço", "CEP", "Cidade", "Estado", "Tipo"
			});
		}
		return tableModel;
	}

	/**
	 * @return the tableScroll
	 */
	public JScrollPane getTableScroll() {
		if(tableScroll == null) {
			tableScroll = new JScrollPane(getPessoasTable());
			tableScroll.setPreferredSize(new Dimension(0, 0));
		}
		return tableScroll;
	}

	/**
	 * @return the tableConstraints
	 */
	public GridBagConstraints getTableConstraints() {
		tableConstraints = createConstraintsPrototype();
		tableConstraints.gridx = 0;
		tableConstraints.gridy = 7;
		tableConstraints.gridwidth = 9;
		tableConstraints.ipady = 200;
		return tableConstraints;
	}
	
	public PessoasTO getPessoas() {
		PessoasTO p = new PessoasTO();
		p.setNome(getNomeField().getText());
		p.setCpf(getCpfField().getText());
		p.setCartaoCred(getCartaoCredField().getText());
		p.setValidadeCC((String)getValidadeCCField().getSelectedItem());
		p.setBandeiraCC(getBandeiraCCField().getText());
		p.setEmail(getEmailField().getText());
		p.setTelefone(getTelefoneField().getText());
		p.setEndereco(getEnderecoField().getText());
		p.setCep(getCepField().getText());
		p.setCidade(getCidadeField().getText());
		p.setEstado((String)getEstadoField().getSelectedItem());
		p.setTipo((String)getTipoField().getSelectedItem());
		return p;
	}
	
	public void addPessoas(PessoasTO pessoas) {
		String [] novaLinha = new String [] {
				pessoas.getNome(),
				pessoas.getCpf(),
				pessoas.getCartaoCred(),
				pessoas.getValidadeCC(),
				pessoas.getBandeiraCC(),
				pessoas.getEmail(),
				pessoas.getTelefone(),
				pessoas.getEndereco(),
				pessoas.getCep(),
				pessoas.getCidade(),
				pessoas.getEstado(),
				pessoas.getTipo()
		};
		getTableModel().addRow(novaLinha);
	}

}
