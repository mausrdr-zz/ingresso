/**
 * 
 */
package br.edu.univas.si.lab4.ingresso.view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import br.edu.univas.si.lab4.ingresso.listenner.LoginButtonsListenner;
import br.edu.univas.si.lab4.ingresso.model.Login;
import br.edu.univas.si.lab4.ingresso.model.LoginDAO;

/**
 * @author mauro
 *
 */
public class LoginFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private PanelDataLogin panelDataLogin;
	private PanelButtonsLogin panelButtonsLogin;
	private LoginDAO loginDao;
	
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
	 * @return the loginDao
	 */
	private LoginDAO getLoginDao() {
		if(loginDao == null) {
			loginDao = new LoginDAO();
		}
		return loginDao;
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
					Login l = new Login();
					l.setLogin(getPanelDataLogin().getLoginFrame());
					l.setSenha(getPanelDataLogin().getInputSenha());
					boolean verif = false;
					
					l.setSenha(getPanelDataLogin().stringHexa(getPanelDataLogin().gerarHash(l.getSenha(), "SHA-256")));
					verif = getLoginDao().getLogin(l.getLogin(), l.getSenha());
					
					if(verif) {
						dispose();
						new AdminFrame().setVisible(true);
					}
					else{
						JOptionPane.showMessageDialog(null, "Login ou senha incorretos!" + l.getLogin() + " - " + l.getSenha(), "Atenção", JOptionPane.ERROR_MESSAGE);
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
