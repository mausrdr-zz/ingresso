/**
 * 
 */
package br.edu.univas.si.lab4.ingresso.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import br.edu.univas.si.lab4.ingresso.listenner.ConsultarButtonsListenner;

/**
 * @author mauro
 *
 */
public class PanelButtonsConsultar extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private JButton buscarButton;
	private JButton sairButton;
	
	ArrayList<ConsultarButtonsListenner> listenners = new ArrayList<ConsultarButtonsListenner>();
	
	public PanelButtonsConsultar() {
		initialize();
	}

	private void initialize() {
		add(getBuscarButton());
		add(getSairButton());
	}

	/**
	 * @return the buscarButton
	 */
	public JButton getBuscarButton() {
		if(buscarButton == null) {
			buscarButton = new JButton();
			buscarButton.setText("Buscar");
			buscarButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					for(ConsultarButtonsListenner listenner : listenners) {
						listenner.buscarAction();
					}
				}
			});
		}
		return buscarButton;
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
					for(ConsultarButtonsListenner listenner : listenners) {
						listenner.sairAction();
					}
				}
			});
		}
		return sairButton;
	}
	
	public void addListenner(ConsultarButtonsListenner Listenner) {
		listenners.add(Listenner);
	}
}
