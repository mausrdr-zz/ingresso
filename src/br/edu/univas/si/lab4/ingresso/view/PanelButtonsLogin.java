/**
 * 
 */
package br.edu.univas.si.lab4.ingresso.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import br.edu.univas.si.lab4.ingresso.listenner.LoginButtonsListenner;

/**
 * @author mauro
 *
 */
public class PanelButtonsLogin extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private JButton okButton;
	private JButton cancelButton;
	
	private ArrayList<LoginButtonsListenner> listenners = new ArrayList<LoginButtonsListenner>();
	
	public PanelButtonsLogin() {
		initialize();
	}

	private void initialize() {
		add(getOkButton());
		add(getCancelButton());
	}

	/**
	 * @return the okButton
	 */
	private JButton getOkButton() {
		if(okButton == null) {
			okButton = new JButton();
			okButton.setText("OK");
			okButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for(LoginButtonsListenner listenner : listenners) {
						listenner.okAction();
					}
				}
			});
		}
		return okButton;
	}

	/**
	 * @return the cancelButton
	 */
	private JButton getCancelButton() {
		if(cancelButton == null) {
			cancelButton = new JButton();
			cancelButton.setText("Cancel");
			cancelButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for(LoginButtonsListenner listenner : listenners) {
						listenner.cancelAction();
					}
				}
			});
		}
		return cancelButton;
	}
	
	public void addListenner(LoginButtonsListenner Listenner) {
		listenners.add(Listenner);
	}
}
