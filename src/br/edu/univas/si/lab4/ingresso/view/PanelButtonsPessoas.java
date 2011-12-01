/**
 * 
 */
package br.edu.univas.si.lab4.ingresso.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import br.edu.univas.si.lab4.ingresso.listenner.PessoasButtonsListenner;

/**
 * @author mauro
 *
 */
public class PanelButtonsPessoas extends JPanel{
	private static final long serialVersionUID = 1L;

	private JButton okButton;
	private JButton limparButton;
	private JButton cancelButton;
	
	private ArrayList<PessoasButtonsListenner> listenners = new ArrayList<PessoasButtonsListenner>();
	
	public PanelButtonsPessoas() {
		initialize();
	}

	private void initialize() {
		add(getOkButton());
		add(getLimparButton());
		add(getCancelButton());
	}

	/**
	 * @return the okButton
	 */
	public JButton getOkButton() {
		if(okButton == null) {
			okButton = new JButton();
			okButton.setText("OK");
			okButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					for(PessoasButtonsListenner listenner : listenners) {
						listenner.okAction();
					}
				}
			});
		}
		return okButton;
	}

	/**
	 * @return the limparButton
	 */
	public JButton getLimparButton() {
		if(limparButton == null) {
			limparButton = new JButton();
			limparButton.setText("Limpar");
			limparButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					for(PessoasButtonsListenner listenner : listenners) {
						listenner.limparAction();
					}
				}
			});
		}
		return limparButton;
	}

	/**
	 * @return the cancelButton
	 */
	public JButton getCancelButton() {
		if(cancelButton == null) {
			cancelButton = new JButton();
			cancelButton.setText("Cancelar");
			cancelButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					for(PessoasButtonsListenner listenner : listenners) {
						listenner.cancelAction();
					}
				}
			});
		}
		return cancelButton;
	}
	
	public void addListenner(PessoasButtonsListenner listenner) {
		listenners.add(listenner);
	}
}
