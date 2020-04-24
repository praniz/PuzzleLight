package subgame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.xml.ws.Holder;

import deskplaygame.Home_game;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.SwingConstants;

public class subHelp {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					subHelp window = new subHelp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public subHelp() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("PuzzleLight");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("Img\\icon.jpg"));
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 510, 300);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("");
		button.setBounds(10, 218, 92, 43);
		button.setIcon(new ImageIcon("Img\\brack.jpg"));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Home_game();
				frame.setVisible(false);
			}
		});
		
		JLabel lblHalp = new JLabel("");
		lblHalp.setIcon(new ImageIcon("Img\\exp.jpg"));
		lblHalp.setBounds(0, 0, 504, 272);
		lblHalp.setHorizontalAlignment(SwingConstants.CENTER);
		lblHalp.setForeground(Color.WHITE);
		lblHalp.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 30));
		
		JLabel label = new JLabel("New label");
		label.setBounds(0, 0, 46, 14);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(button);
		frame.getContentPane().add(label);
		frame.getContentPane().add(lblHalp);
	}
}
