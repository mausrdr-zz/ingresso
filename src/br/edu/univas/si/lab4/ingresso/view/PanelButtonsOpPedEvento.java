/**
 * 
 */
package br.edu.univas.si.lab4.ingresso.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import br.edu.univas.si.lab4.ingresso.listenner.OpPedEventoRadioListenner;

/**
 * @author mauro
 *
 */
public class PanelButtonsOpPedEvento extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private JRadioButton aguardButton;
	private JRadioButton aprovButton;
	private JRadioButton reprovButton;
	private JRadioButton todosButton;
	
	private GridBagConstraints aguardButtonConstraints;
	private GridBagConstraints aprovButtonConstraints;
	private GridBagConstraints reprovButtonConstraints;
	private GridBagConstraints todosButtonConstraints;
	
	private ArrayList<OpPedEventoRadioListenner> listenners = new ArrayList<OpPedEventoRadioListenner>();
	
	public PanelButtonsOpPedEvento() {
		setLayout(new GridBagLayout());
		int space = 6;
		setBorder(new CompoundBorder(new EmptyBorder(space, space, space, space), new CompoundBorder(new TitledBorder("Opções"), new EmptyBorder(space, space, space, space))));
		initialize();
	}

	private void initialize() {
		add(getAguardButton(), getAguardButtonConstraints());
		add(getAprovButton(), getAprovButtonConstraints());
		add(getReprovButton(), getReprovButtonConstraints());
		add(getTodosButton(), getTodosButtonConstraints());
	}

	/**
	 * @return the aguardButton
	 */
	public JRadioButton getAguardButton() {
		if(aguardButton == null) {
			aguardButton = new JRadioButton();
			aguardButton.setText("Pedidos aguardando aprovação");
			aguardButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					for(OpPedEventoRadioListenner listenner : listenners) {
						listenner.aguardAction();
					}
				}
			});
		}
		return aguardButton;
	}

	/**
	 * @return the aprovButton
	 */
	public JRadioButton getAprovButton() {
		if(aprovButton == null) {
			aprovButton = new JRadioButton();
			aprovButton.setText("Pedidos aprovados");
			aprovButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					for(OpPedEventoRadioListenner listenner : listenners) {
						listenner.aprovAction();
					}
				}
			});
		}
		return aprovButton;
	}

	/**
	 * @return the reprovButton
	 */
	public JRadioButton getReprovButton() {
		if(reprovButton == null) {
			reprovButton = new JRadioButton();
			reprovButton.setText("Pedidos reprovados");
			reprovButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					for(OpPedEventoRadioListenner listenner : listenners) {
						listenner.reprovAction();
					}
				}
			});
		}
		return reprovButton;
	}
	
	/**
	 * @return the todosButton
	 */
	public JRadioButton getTodosButton() {
		if(todosButton == null) {
			todosButton = new JRadioButton();
			todosButton.setText("Todos os pedidos de eventos realizados");
			todosButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					for(OpPedEventoRadioListenner listenner : listenners) {
						listenner.todosAction();
					}
				}
			});
		}
		return todosButton;
	}

	public void addListenner(OpPedEventoRadioListenner listenner) {
		listenners.add(listenner);
	}
	
	private GridBagConstraints createConstraintsPrototype() {
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		int space = 2;
		gbc.insets = new Insets(space, space, space, space);
		return gbc;
	}

	/**
	 * @return the aguardButtonConstraints
	 */
	public GridBagConstraints getAguardButtonConstraints() {
		if(aguardButtonConstraints == null) {
			aguardButtonConstraints = createConstraintsPrototype();
			aguardButtonConstraints.gridx = 0;
			aguardButtonConstraints.gridy = 0;
		}
		return aguardButtonConstraints;
	}

	/**
	 * @return the aprovButtonConstraints
	 */
	public GridBagConstraints getAprovButtonConstraints() {
		if(aprovButtonConstraints == null) {
			aprovButtonConstraints = createConstraintsPrototype();
			aprovButtonConstraints.gridx = 0;
			aprovButtonConstraints.gridy = 1;
		}
		return aprovButtonConstraints;
	}

	/**
	 * @return the reprovButtonConstraints
	 */
	public GridBagConstraints getReprovButtonConstraints() {
		if(reprovButtonConstraints == null) {
			reprovButtonConstraints = createConstraintsPrototype();
			reprovButtonConstraints.gridx = 0;
			reprovButtonConstraints.gridy = 2;
		}
		return reprovButtonConstraints;
	}

	/**
	 * @return the todosButtonConstraints
	 */
	public GridBagConstraints getTodosButtonConstraints() {
		if(todosButtonConstraints == null) {
			todosButtonConstraints = createConstraintsPrototype();
			todosButtonConstraints.gridx = 0;
			todosButtonConstraints.gridy = 3;
		}
		return todosButtonConstraints;
	}
	
}
