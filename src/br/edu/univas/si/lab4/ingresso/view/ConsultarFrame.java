/**
 * 
 */
package br.edu.univas.si.lab4.ingresso.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import br.edu.univas.si.lab4.ingresso.listenner.ConsultarButtonsListenner;
import br.edu.univas.si.lab4.ingresso.model.PessoasDAO;
import br.edu.univas.si.lab4.ingresso.model.PessoasTO;

/**
 * @author mauro
 *
 */
public class ConsultarFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private PanelDataConsultar panelData;
	private PanelButtonsConsultar panelButtons;
	private PessoasDAO pessoasDao;
	
	public ConsultarFrame() {
		super("Ingresso - Consultar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initialize();
		pack();
	}

	private void initialize() {
		add(getPanelData(), BorderLayout.CENTER);
		add(getPanelButtons(), BorderLayout.SOUTH);
	}

	/**
	 * @return the panelData
	 */
	public PanelDataConsultar getPanelData() {
		if(panelData == null) {
			panelData = new PanelDataConsultar();
		}
		return panelData;
	}

	/**
	 * @return the pessoasDao
	 */
	public PessoasDAO getPessoasDao() {
		if(pessoasDao == null) {
			pessoasDao = new PessoasDAO();
		}
		return pessoasDao;
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
					String cpf = getPanelData().getCpfBusca();
					PessoasTO pessoa = new PessoasTO();
					getPessoasDao().consultaPessoa(cpf, pessoa);
					dispose();
					new ResultPessoaFrame(pessoa).setVisible(true);
				}
			});
		}
		return panelButtons;
	}
	
}
