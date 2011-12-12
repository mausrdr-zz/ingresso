/**
 * 
 */
package br.edu.univas.si.lab4.ingresso.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import br.edu.univas.si.lab4.ingresso.listenner.AdminButtonsListenner;

/**
 * @author mauro
 *
 */
public class AdminFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private PanelButtonsAdmin panelButtons;
	
	public AdminFrame() {
		super("Ingresso - Admin");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		initialize();
		pack();
	}

	private void initialize() {
		add(getPanelButtons(), BorderLayout.CENTER);
	}
	
	/**
	 * @return the panelButtons
	 */
	public PanelButtonsAdmin getPanelButtons() {
		if(panelButtons == null) {
			panelButtons = new PanelButtonsAdmin();
			panelButtons.addListenner(new AdminButtonsListenner() {
				
				@Override
				public void sairAction() {
					dispose();
					new PrincipalFrame().setVisible(true);
				}
				
				@Override
				public void consultarAction() {
					dispose();
					new ConsultarFrame().setVisible(true);
				}

				@Override
				public void pedidoAction() {
					dispose();
					new OpcaoPedidoFrame().setVisible(true);
				}
			});
		}
		return panelButtons;
	}
	
}
