/**
 * 
 */
package br.edu.univas.si.lab4.ingresso.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import br.edu.univas.si.lab4.ingresso.listenner.PrincipalButtonsListenner;

/**
 * @author mauro
 *
 */
public class PanelButtonsPrincipal extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private JButton cadastrarButtons;
	private JButton eventosButtons;
	private JButton loginButtons;
	
	private ArrayList<PrincipalButtonsListenner> listenners = new ArrayList<PrincipalButtonsListenner>();
	
	public PanelButtonsPrincipal() {
		initialize();
	}

	private void initialize() {
		add(getCadastrarButtons());
		add(getEventosButtons());
		add(getLoginButtons());
	}

	/**
	 * @return the cadastrarButtons
	 */
	public JButton getCadastrarButtons() {
		if(cadastrarButtons == null) {
			cadastrarButtons = new JButton();
			cadastrarButtons.setText("Cadastrar");
			cadastrarButtons.setToolTipText("Para se cadastrar, clique aqui");
			cadastrarButtons.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for(PrincipalButtonsListenner listenner : listenners) {
						listenner.cadastrarAction();
					}
				}
			});
		}
		return cadastrarButtons;
	}

	/**
	 * @return the eventosButtons
	 */
	public JButton getEventosButtons() {
		if(eventosButtons == null) {
			eventosButtons = new JButton();
			eventosButtons.setText("Eventos");
			eventosButtons.setToolTipText("Para visualizar eventos em aberto, clique aqui");
			eventosButtons.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for(PrincipalButtonsListenner listenner : listenners) {
						listenner.eventosAction();
					}
				}
			});
		}
		return eventosButtons;
	}

	/**
	 * @return the loginButtons
	 */
	public JButton getLoginButtons() {
		if(loginButtons == null) {
			loginButtons = new JButton();
			loginButtons.setText("Login");
			loginButtons.setToolTipText("Para logar-se, clique aqui");
			loginButtons.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for(PrincipalButtonsListenner listenner : listenners) {
						listenner.loginAction();
					}
				}
			});
		}
		return loginButtons;
	}
	
	public void addListenner(PrincipalButtonsListenner listenner) {
		listenners.add(listenner);
	}
}
