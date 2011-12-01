/**
 * 
 */
package br.edu.univas.si.lab4.ingresso.view;

import java.awt.BorderLayout;
import javax.swing.JFrame;

import br.edu.univas.si.lab4.ingresso.listenner.PessoasButtonsListenner;
import br.edu.univas.si.lab4.ingresso.model.PessoasTO;

/**
 * @author mauro
 *
 */
public class PessoasFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private PanelDataPessoas panelDataPessoas;
	private PanelButtonsPessoas panelButtonsPessoas;
	
	public PessoasFrame() {
		super("Ingresso - Cadastro");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		initialize();
		pack();
	}

	private void initialize() {
		add(getPanelDataPessoas(), BorderLayout.CENTER);
		add(getPanelButtonsPessoas(), BorderLayout.SOUTH);
	}

	/**
	 * @return the panelDataPessoas
	 */
	public PanelDataPessoas getPanelDataPessoas() {
		if(panelDataPessoas == null) {
			panelDataPessoas = new PanelDataPessoas();
		}
		return panelDataPessoas;
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
					PessoasTO pessoas = getPanelDataPessoas().getPessoas();
					getPanelDataPessoas().addPessoas(pessoas);
				}
				
				@Override
				public void limparAction() {
					getPanelDataPessoas().getNomeField().setText("");
					getPanelDataPessoas().getCpfField().setText("");
					getPanelDataPessoas().getCartaoCredField().setText("");
					getPanelDataPessoas().getBandeiraCCField().setText("");
					getPanelDataPessoas().getEmailField().setText("");
					getPanelDataPessoas().getTelefoneField().setText("");
					getPanelDataPessoas().getEnderecoField().setText("");
					getPanelDataPessoas().getCepField().setText("");
					getPanelDataPessoas().getCidadeField().setText("");
				}
				
				@Override
				public void cancelAction() {
					PessoasFrame p = PessoasFrame.this;
					p.setVisible(false);
					new PrincipalFrame().setVisible(true);
				}
			});
		}
		return panelButtonsPessoas;
	}

}
