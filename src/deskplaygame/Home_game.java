package deskplaygame;

import gamemodplay.no1;
import gamemodplay.no6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;

import subgame.subHelp;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Window;

import javax.swing.ImageIcon;

public class Home_game {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home_game window = new Home_game();
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
	public Home_game() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("PuzzleLight");
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBackground(Color.BLACK);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("Img\\icon.jpg"));// „ Ëicon
		frame.setBounds(100, 100, 500, 500);
		frame.setResizable(false);// ÀÈ“¡¢¬“¬®Õ
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblNamegame = new JLabel("PuzzleLight");// namegame
		lblNamegame.setForeground(Color.WHITE);
		lblNamegame.setBackground(Color.WHITE);
		lblNamegame.setBounds(129, 23, 234, 31);
		lblNamegame.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 30));
		lblNamegame.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(lblNamegame);
		
				JButton btnStart = new JButton("");// botton start
				btnStart.setBounds(213, 286, 97, 47);
				frame.getContentPane().add(btnStart);
				btnStart.setIcon(new ImageIcon("Img\\start.jpg"));
				btnStart.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						new no1();
						frame.setVisible(false);
					}
				});
				btnStart.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 20));
						
								JButton btnNewButton = new JButton("");// «‘∏’‡≈Ëπ
								btnNewButton.setIcon(new ImageIcon("Img\\help.jpg"));
								btnNewButton.setBounds(213, 344, 94, 41);
								frame.getContentPane().add(btnNewButton);
								btnNewButton.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										new subHelp();
										frame.setVisible(false);
									}
								});
								btnNewButton.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 20));
								
								JButton btnNewButton_1 = new JButton("");
								btnNewButton_1.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent arg0) {
										int a4 = JOptionPane.showConfirmDialog(null,
												"Are you want to exit ?", "YOU EXIT GAME",
												JOptionPane.INFORMATION_MESSAGE);
										switch (a4) {
										case JOptionPane.YES_OPTION:
											frame.setVisible(false);
											break;
										case JOptionPane.NO_OPTION:
											break;
										case JOptionPane.CANCEL_OPTION:
										}
									}
								});
								btnNewButton_1.setIcon(new ImageIcon("Img\\exit.jpg"));
								btnNewButton_1.setBounds(213, 396, 97, 31);
								frame.getContentPane().add(btnNewButton_1);
								
								JLabel lblbghomebt = new JLabel("");
								lblbghomebt.setIcon(new ImageIcon("Img\\btbg.jpg"));
								lblbghomebt.setHorizontalAlignment(SwingConstants.CENTER);
								lblbghomebt.setBounds(157, 260, 206, 185);
								frame.getContentPane().add(lblbghomebt);
								
								JLabel lblbgicon = new JLabel("");
								lblbgicon.setIcon(new ImageIcon("D:\\\u0E07\u0E32\u0E19\\PJ_DATA&OOP\\pj\\Img\\icBG.gif"));
								lblbgicon.setHorizontalAlignment(SwingConstants.CENTER);
								lblbgicon.setBounds(85, 75, 346, 186);
								frame.getContentPane().add(lblbgicon);
	}
	
	public JFrame getframe() {//‡ª‘¥ÀπÈ“µË“ß®“°subsave
		return frame;
	}
}
