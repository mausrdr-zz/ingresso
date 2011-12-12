/**
 * 
 */
package br.edu.univas.si.lab4.ingresso.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import br.edu.univas.si.lab4.ingresso.listenner.PedidoEventoButtonsListenner;

/**
 * @author mauro
 *
 */
public class PanelButtonsPedidoEvento extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private JButton aprovarButton;
	private JButton sairButton;
	
	private ArrayList<PedidoEventoButtonsListenner> listenners = new ArrayList<PedidoEventoButtonsListenner>();
	
	public PanelButtonsPedidoEvento() {
		initialize();
	}

	private void initialize() {
		add(getAprovarButton());
		add(getSairButton());
	}

	/**
	 * @return the aprovarButton
	 */
	public JButton getAprovarButton() {
		if(aprovarButton == null) {
			aprovarButton = new JButton();
			aprovarButton.setText("Aprovar");
			aprovarButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					for(PedidoEventoButtonsListenner listenner : listenners) {
						listenner.aprovarAction();
					}
				}
			});
		}
		return aprovarButton;
	}

	/**
	 * @return the sairButton
	 */
	public JButton getSairButton() {
		if(sairButton == null) {
			sairButton = new JButton();
			sairButton.setText("Sair");
			sairButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					for(PedidoEventoButtonsListenner listenner : listenners) {
						listenner.sairAction();
					}
				}
			});
		}
		return sairButton;
	}
	
	public void addListenner(PedidoEventoButtonsListenner listenner) {
		listenners.add(listenner);
	}
}
