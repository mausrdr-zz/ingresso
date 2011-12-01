/**
 * 
 */
package br.edu.univas.si.lab4.ingresso.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import br.edu.univas.si.lab4.ingresso.listenner.PessoasButtonsListenner;
import br.edu.univas.si.lab4.ingresso.model.Eventos;

/**
 * @author mauro
 *
 */
public class EventoFrame extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private PanelDataEvento panelDataEvento;
	private PanelButtonsPessoas panelButtonsPessoas;
	
	public EventoFrame() {
		super("Ingresso - Evento");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		initialize();
		pack();
	}

	private void initialize() {
		add(getPanelDataEvento(), BorderLayout.CENTER);
		add(getPanelButtonsPessoas(), BorderLayout.SOUTH);
	}

	/**
	 * @return the panelDataEvento
	 */
	public PanelDataEvento getPanelDataEvento() {
		if(panelDataEvento == null) {
			panelDataEvento = new PanelDataEvento();
		}
		return panelDataEvento;
	}

	/**
	 * @return the panelButtonsPessoas
	 */
	public PanelButtonsPessoas getPanelButtonsPessoas() {
		if(panelButtonsPessoas == null) {
			panelButtonsPessoas = new PanelButtonsPessoas();
			panelButtonsPessoas.addListenner(new PessoasButtonsListenner() {
				
				@Override
				public void okAction() {
					Eventos eventos = getPanelDataEvento().getEventos();
					getPanelDataEvento().addEventos(eventos);
				}
				
				@Override
				public void limparAction() {
					getPanelDataEvento().getNomeField().setText("");
					getPanelDataEvento().getLocalField().setText("");
					getPanelDataEvento().getHorarioField().setText("");
					getPanelDataEvento().getPrecoField().setText("");
					getPanelDataEvento().getDataField().setText("");
				}
				
				@Override
				public void cancelAction() {
					dispose();
					new PrincipalFrame().setVisible(true);
				}
			});
		}
		return panelButtonsPessoas;
	}
	
	
}
