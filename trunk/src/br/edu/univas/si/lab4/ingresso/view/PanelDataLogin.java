/**
 * 
 */
package br.edu.univas.si.lab4.ingresso.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import br.edu.univas.si.lab4.ingresso.model.Login;

/**
 * @author mauro
 *
 */
public class PanelDataLogin extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private JLabel loginLabel;
	private JLabel senhaLabel;
	
	private JTextField loginField;
	private JPasswordField senhaField;
	
	private GridBagConstraints loginLabelConstraints;
	private GridBagConstraints senhaLabelConstraints;
	
	private GridBagConstraints loginFieldConstraints;
	private GridBagConstraints senhaFieldConstraints;
	
	public PanelDataLogin() {
		setLayout(new GridBagLayout());
		int space = 8;
		setBorder(new CompoundBorder(new EmptyBorder(space, space, space, space), new CompoundBorder(new TitledBorder("Efetuar Login"), new EmptyBorder(space, space, space, space))));
		initialize();
	}
	
	private void initialize() {
		add(getLoginLabel(), getLoginLabelConstraints());
		add(getSenhaLabel(), getSenhaLabelConstraints());
		
		add(getLoginField(), getLoginFieldConstraints());
		add(getSenhaField(), getSenhaFieldConstraints());
	}

	/**
	 * @return the loginLabel
	 */
	public JLabel getLoginLabel() {
		if(loginLabel == null) {
			loginLabel = new JLabel();
			loginLabel.setText("Login:");
		}
		return loginLabel;
	}
	/**
	 * @return the senhaLabel
	 */
	public JLabel getSenhaLabel() {
		if(senhaLabel == null) {
			senhaLabel = new JLabel();
			senhaLabel.setText("Senha:");
		}
		return senhaLabel;
	}
	/**
	 * @return the loginField
	 */
	public JTextField getLoginField() {
		if(loginField == null) {
			loginField = new JTextField();
			loginField.setToolTipText("Informe seu login");
		}
		return loginField;
	}
	/**
	 * @return the senhaField
	 */
	public JPasswordField getSenhaField() {
		if(senhaField == null) {
			senhaField = new JPasswordField();
			senhaField.setToolTipText("Informe sua senha");
		}
		return senhaField;
	}
	
	public GridBagConstraints createConstraintsPrototype() {
		GridBagConstraints gbc = new GridBagConstraints();
		int space = 2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(space, space, space, space);
		return gbc;
	}
	
	/**
	 * @return the loginLabelConstraints
	 */
	public GridBagConstraints getLoginLabelConstraints() {
		if(loginLabelConstraints == null) {
			loginLabelConstraints = createConstraintsPrototype();
			loginLabelConstraints.gridx = 0;
			loginLabelConstraints.gridy = 0;
		}
		return loginLabelConstraints;
	}
	/**
	 * @return the senhaLabelConstraints
	 */
	public GridBagConstraints getSenhaLabelConstraints() {
		if(senhaLabelConstraints == null) {
			senhaLabelConstraints = createConstraintsPrototype();
			senhaLabelConstraints.gridx = 0;
			senhaLabelConstraints.gridy = 1;
		}
		return senhaLabelConstraints;
	}
	/**
	 * @return the loginFieldConstraints
	 */
	public GridBagConstraints getLoginFieldConstraints() {
		if(loginFieldConstraints == null) {
			loginFieldConstraints = createConstraintsPrototype();
			loginFieldConstraints.gridx = 1;
			loginFieldConstraints.gridy = 0;
			loginFieldConstraints.ipadx = 100;
		}
		return loginFieldConstraints;
	}
	/**
	 * @return the senhaFieldConstraints
	 */
	public GridBagConstraints getSenhaFieldConstraints() {
		if(senhaFieldConstraints == null) {
			senhaFieldConstraints = createConstraintsPrototype();
			senhaFieldConstraints.gridx = 1;
			senhaFieldConstraints.gridy = 1;
		}
		return senhaFieldConstraints;
	}
	
	public String getLoginFrame() {
		String loginFrame = getLoginField().getText();
		return loginFrame;
	}
	
	public char [] getInputSenha() {
		char [] input = getSenhaField().getPassword();
		return input;
	}
	
	public String getLogin() {
		Login l = new Login();
		String login = l.getLogin();
		return login;
	}
	public char [] getSenha() {
		Login l = new Login();
		char [] senha = l.getSenha();
		return senha;
	}
}
