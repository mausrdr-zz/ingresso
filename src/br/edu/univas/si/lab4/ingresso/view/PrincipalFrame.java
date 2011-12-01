/**
 * 
 */
package br.edu.univas.si.lab4.ingresso.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import br.edu.univas.si.lab4.ingresso.listenner.PrincipalButtonsListenner;

/**
 * @author mauro
 *
 */
public class PrincipalFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private PanelButtonsPrincipal panelButtons;
	
	public PrincipalFrame(){
		super("Ingresso - Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initialize();
		pack();
	}

	private void initialize() {
		add(getPanelButtons(), BorderLayout.CENTER);
	}

	/**
	 * @return the panelButtons
	 */
	public PanelButtonsPrincipal getPanelButtons() {
		if(panelButtons == null) {
			panelButtons = new PanelButtonsPrincipal();
			panelButtons.addListenner(new PrincipalButtonsListenner() {
				@Override
				public void loginAction() {
					PrincipalFrame p = PrincipalFrame.this;
					p.setVisible(false);
					new LoginFrame().setVisible(true);
				}
				
				@Override
				public void eventosAction() {
					PrincipalFrame p = PrincipalFrame.this;
					p.setVisible(false);
					new EventoFrame().setVisible(true);
				}
				
				@Override
				public void cadastrarAction() {
					dispose();
					new PessoasFrame().setVisible(true);
				}
			});
		}
		return panelButtons;
	}
	
	
}
