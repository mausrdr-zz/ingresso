/**
 * 
 */
package br.edu.univas.si.lab4.ingresso.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import br.edu.univas.si.lab4.ingresso.listenner.ConsultarButtonsListenner;
import br.edu.univas.si.lab4.ingresso.model.PessoasTO;

/**
 * @author mauro
 *
 */
public class ResultPessoaFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private PanelDataResultPessoa panelData;
	private PanelButtonsConsultar panelButtons;
	
	public ResultPessoaFrame(PessoasTO pessoa) {
		super("Ingresso - Resultado");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		initialize(pessoa);
		pack();
	}

	private void initialize(PessoasTO pessoa) {
		add(getPanelData(pessoa), BorderLayout.CENTER);
		add(getPanelButtons(), BorderLayout.SOUTH);
	}

	/**
	 * @param pessoa 
	 * @return the panelData
	 */
	public PanelDataResultPessoa getPanelData(PessoasTO pessoa) {
		if(panelData == null) {
			panelData = new PanelDataResultPessoa(pessoa);
		}
		return panelData;
	}

	/**
	 * @return the panelButtons
	 */
	public PanelButtonsConsultar getPanelButtons() {
		if(panelButtons == null) {
			panelButtons = new PanelButtonsConsultar();
			panelButtons.addListenner(new ConsultarButtonsListenner() {
				
				@Override
				public void sairAction() {
					dispose();
					new AdminFrame().setVisible(true);
				}
				
				@Override
				public void buscarAction() {
					dispose();
					new ConsultarFrame().setVisible(true);
				}
			});
		}
		return panelButtons;
	}

}
