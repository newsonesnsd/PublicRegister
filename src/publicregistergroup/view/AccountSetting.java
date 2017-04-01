/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicregistergroup.view;

/**
 *
 * @author newso
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AccountSetting extends JFrame {
	public static void main(String[] args) {
		AccountSetting frameTabel = new AccountSetting();
		frameTabel.setVisible(true);
	}
	public AccountSetting() {
		// JFrame
		super("AccountSetting"); // Title
		setSize(1024, 768);
		setLocation(500, 280);
		// JLabel
		JLabel welcome = new JLabel("Account Setting"); // text output
                //JLabel desc = new JLabel("");
		welcome.setBounds(70, 50, 150, 60);
		// Panel
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.add(welcome);

		getContentPane().add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}