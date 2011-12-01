/**
 * 
 */
package br.edu.univas.si.lab4.ingresso.view;

import java.awt.BorderLayout;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import br.edu.univas.si.lab4.ingresso.listenner.LoginButtonsListenner;

/**
 * @author mauro
 *
 */
public class LoginFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private PanelDataLogin panelDataLogin;
	private PanelButtonsLogin panelButtonsLogin;
	
	public LoginFrame() {
		super("Ingreso - Login");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		initialize();
		pack();
	}

	private void initialize() {
		add(getPanelDataLogin(), BorderLayout.CENTER);
		add(getPanelButtonsLogin(), BorderLayout.SOUTH);
	}

	/**
	 * @return the panelDataLogin
	 */
	private PanelDataLogin getPanelDataLogin() {
		if(panelDataLogin == null) {
			panelDataLogin = new PanelDataLogin();
		}
		return panelDataLogin;
	}

	/**
	 * @return the panelButtonsLogin
	 */
	private PanelButtonsLogin getPanelButtonsLogin() {
		if(panelButtonsLogin == null) {
			panelButtonsLogin = new PanelButtonsLogin();
			panelButtonsLogin.addListenner(new LoginButtonsListenner() {
				@Override
				public void okAction() {
					String s1 = getPanelDataLogin().getLoginFrame();
					char [] input = getPanelDataLogin().getInputSenha();
					String s2 = getPanelDataLogin().getLogin();
					char [] senha = getPanelDataLogin().getSenha();
					boolean verif = false;
					for(int i=0; i < 2; i++) {
						if(s1.equals(s2) && Arrays.equals(input, senha)) {
							verif = true;
						}
						else {
							verif = false;
							break;
						}
					}
					if(verif) {
						dispose();
						new PessoasFrame().setVisible(true);
					}
					else{
						JOptionPane.showMessageDialog(null, "Login ou senha incorretos!" + s1 + " - " + s2, "Atenção", JOptionPane.ERROR_MESSAGE);
					}
				}
				
				@Override
				public void cancelAction() {
					LoginFrame l = LoginFrame.this;
					l.setVisible(false);
					new PrincipalFrame().setVisible(true);
				}
			});
		}
		return panelButtonsLogin;
	}
	
	
}
