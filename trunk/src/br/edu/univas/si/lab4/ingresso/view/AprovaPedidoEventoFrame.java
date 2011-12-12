/**
 * 
 */
package br.edu.univas.si.lab4.ingresso.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import br.edu.univas.si.lab4.ingresso.listenner.PedidoEventoButtonsListenner;
import br.edu.univas.si.lab4.ingresso.model.PedidoEvento;

/**
 * @author mauro
 *
 */
public class AprovaPedidoEventoFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private PanelDataPedidoEvento panelDataPedidoEvento;
	private PanelButtonsPedidoEvento panelButtonsPedidoEvento;
	
	public AprovaPedidoEventoFrame(PedidoEvento pedido) {
		super("Ingresso - Aprova Pedido de Evento");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		initialize(pedido);
		pack();
	}

	private void initialize(PedidoEvento pedido) {
		add(getPanelDataPedidoEvento(pedido), BorderLayout.CENTER);
		add(getPanelButtonsPedidoEvento(), BorderLayout.SOUTH);
		
	}

	/**
	 * @param pedido 
	 * @return the panelDataPedidoEvento
	 */
	public PanelDataPedidoEvento getPanelDataPedidoEvento(PedidoEvento pedido) {
		if(panelDataPedidoEvento == null) {
			panelDataPedidoEvento = new PanelDataPedidoEvento(pedido);
		}
		return panelDataPedidoEvento;
	}

	/**
	 * @return the panelButtonsPedidoEvento
	 */
	public PanelButtonsPedidoEvento getPanelButtonsPedidoEvento() {
		if(panelButtonsPedidoEvento == null) {
			panelButtonsPedidoEvento = new PanelButtonsPedidoEvento();
			panelButtonsPedidoEvento.addListenner(new PedidoEventoButtonsListenner() {
				
				@Override
				public void sairAction() {
					dispose();
					new AdminFrame().setVisible(true);
				}
				
				@Override
				public void aprovarAction() {
					
				}
			});
		}
		return panelButtonsPedidoEvento;
	}
	
}
