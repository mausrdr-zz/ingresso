/**
 * 
 */
package br.edu.univas.si.lab4.ingresso.view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import br.edu.univas.si.lab4.ingresso.listenner.OpPedEventoRadioListenner;
import br.edu.univas.si.lab4.ingresso.model.OpcaoPedido;
import br.edu.univas.si.lab4.ingresso.model.PedidoEvento;
import br.edu.univas.si.lab4.ingresso.model.PedidoEventoDAO;

/**
 * @author mauro
 *
 */
public class OpcaoPedidoFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private PanelButtonsOpPedEvento panelButtonsOpPedEvento;
	
	private PedidoEventoDAO pedidoEventoDao;
	
	public OpcaoPedidoFrame() {
		super("Ingresso - Menu do Pedido de Eventos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initialize();
		pack();
	}

	private void initialize() {
		add(getPanelDataOpPedEvento(), BorderLayout.LINE_START);
	}

	/**
	 * @return the panelDataOpPedEvento
	 */
	public PanelButtonsOpPedEvento getPanelDataOpPedEvento() {
		if(panelButtonsOpPedEvento == null) {
			panelButtonsOpPedEvento = new PanelButtonsOpPedEvento();
			panelButtonsOpPedEvento.addListenner(new OpPedEventoRadioListenner() {
				
				@Override
				public void reprovAction() {
					dispose();
					OpcaoPedido op = new OpcaoPedido();
					op.setOpcao("= 2");
					PedidoEvento pedido = new PedidoEvento();
					getPedidoEventoDao().consultPedEvent(pedido, op);
					new AprovaPedidoEventoFrame(pedido).setVisible(true);
				}
				
				@Override
				public void aprovAction() {
					dispose();
					OpcaoPedido op = new OpcaoPedido();
					op.setOpcao("= 1");
					PedidoEvento pedido = new PedidoEvento();
					getPedidoEventoDao().consultPedEvent(pedido, op);
					new AprovaPedidoEventoFrame(pedido).setVisible(true);
				}
				
				@Override
				public void aguardAction() {
					dispose();
					OpcaoPedido op = new OpcaoPedido();
					op.setOpcao("= 0");
					PedidoEvento pedido = new PedidoEvento();
					getPedidoEventoDao().consultPedEvent(pedido, op);
					new AprovaPedidoEventoFrame(pedido).setVisible(true);
				}

				@Override
				public void todosAction() {
					dispose();
					OpcaoPedido op = new OpcaoPedido();
					op.setOpcao(">= 0");
					PedidoEvento pedido = new PedidoEvento();
					getPedidoEventoDao().consultPedEvent(pedido, op);
					new AprovaPedidoEventoFrame(pedido).setVisible(true);
				}
			});
		}
		return panelButtonsOpPedEvento;
	}

	/**
	 * @return the pedidoEventoDao
	 */
	public PedidoEventoDAO getPedidoEventoDao() {
		if(pedidoEventoDao == null) {
			pedidoEventoDao = new PedidoEventoDAO();
		}
		return pedidoEventoDao;
	}
	
}
