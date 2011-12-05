/**
 * 
 */
package br.edu.univas.si.lab4.ingresso.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

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
	
	public String getInputSenha() {
		char[] input = getSenhaField().getPassword();
		String senha = "";
		for(int i=0; i < input.length; i++) {
			senha += input[i];
		}
		return senha;
	}
	
	public String stringHexa(byte[] bytes) {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < bytes.length; i++) {
			int parteAlta = ((bytes[i] >> 4) & 0xf) << 4;
			int parteBaixa = bytes[i] & 0xf;
			if (parteAlta == 0) s.append('0');
			s.append(Integer.toHexString(parteAlta | parteBaixa));
		}
		return s.toString();
	}
	
	public byte[] gerarHash(String frase, String algoritmo) {
		try {
			MessageDigest md = MessageDigest.getInstance(algoritmo);
			md.update(frase.getBytes());
			return md.digest();
		} catch (NoSuchAlgorithmException e) {
			return null;
		}
	}
}
