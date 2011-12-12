/**
 * 
 */
package br.edu.univas.si.lab4.ingresso.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import br.edu.univas.si.lab4.ingresso.listenner.AdminButtonsListenner;

/**
 * @author mauro
 *
 */
public class PanelButtonsAdmin extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private JButton consultarButton;
	private JButton pedidoButton;
	private JButton sairButton;
	
	private ArrayList<AdminButtonsListenner> listenners = new ArrayList<AdminButtonsListenner>();
	
	public PanelButtonsAdmin() {
		initialize();
	}

	private void initialize() {
		add(getConsultarButton());
		add(getPedidoButton());
		add(getSairButton());
	}

	/**
	 * @return the buscarButton
	 */
	public JButton getConsultarButton() {
		if(consultarButton == null) {
			consultarButton = new JButton();
			consultarButton.setText("Buscar");
			consultarButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					for(AdminButtonsListenner listenner : listenners) {
						listenner.consultarAction();
					}
				}
			});
		}
		return consultarButton;
	}
		
	/**
	 * @return the pedidoButton
	 */
	public JButton getPedidoButton() {
		if(pedidoButton == null) {
			pedidoButton = new JButton();
			pedidoButton.setText("Pedidos de Eventos");
			pedidoButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					for(AdminButtonsListenner listenner : listenners) {
						listenner.pedidoAction();
					}
				}
			});
		}
		return pedidoButton;
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
					for(AdminButtonsListenner listenner : listenners) {
						listenner.sairAction();
					}
				}
			});
		}
		return sairButton;
	}

	public void addListenner(AdminButtonsListenner Listenner) {
		listenners.add(Listenner);
	}
}
