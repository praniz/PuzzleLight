package gamemodplay;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import subgame.subwin;
import data.settime;
import deskplaygame.Home_game;

public class no3 {
	
	private String numsc="0";
	private int sumsc;
	settime t;// นำเข้าเวลา
	private JLabel timesc, labelscoresc;// คะแนน เวลา สกอ
	private JButton reset;
	private JLabel label_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					no3 window = new no3();
					window.frmPuzzlelight.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		});
	}

	public no3() {
		initialize();
		frmPuzzlelight.setVisible(true);
		t = new settime(timesc, 0, 0);
		t.start();
	}

	private boolean grid[][];

	private JFrame frmPuzzlelight;
	private int grid_lock;

	private Object[][] buttons;

	private ImageIcon colorTile;

	private ImageIcon uncolorTile;

	private void initialize() {
		colorTile = new ImageIcon(
				"Img\\colorTile.jpg");
		uncolorTile = new ImageIcon(
				"Img\\uncolorTile.jpg");

		frmPuzzlelight = new JFrame();
		frmPuzzlelight.setTitle("PuzzleLight");
		frmPuzzlelight.setIconImage(Toolkit.getDefaultToolkit().getImage(
				"Img\\icon.jpg"));
		frmPuzzlelight.setBounds(100, 100, 649, 522);
		frmPuzzlelight.setResizable(false);
		frmPuzzlelight.setLocationRelativeTo(null);
		frmPuzzlelight.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPuzzlelight.getContentPane()
				.setLayout(
						new BoxLayout(frmPuzzlelight.getContentPane(),
								BoxLayout.X_AXIS));

		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		frmPuzzlelight.getContentPane().add(panel);
		panel.setLayout(null);

		reset = new JButton("");
		reset.setBackground(Color.BLACK);
		reset.setIcon(new ImageIcon(
				"Img\\reset.jpg"));
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				frmPuzzlelight.setVisible(false);
				new no1();
			}
		});
		reset.setBounds(323, 438, 111, 45);
		panel.add(reset);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(347, 128, 276, 272);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 3, 0, 0));
		// buttons[4][4] = b25;

		JButton b1 = new JButton("");
		b1.setBackground(Color.DARK_GRAY);
		panel_1.add(b1);

		JButton b2 = new JButton("");
		b2.setBackground(Color.DARK_GRAY);
		panel_1.add(b2);

		JButton b3 = new JButton("");
		b3.setBackground(Color.DARK_GRAY);
		panel_1.add(b3);

		JButton b4 = new JButton("");
		b4.setBackground(Color.DARK_GRAY);
		b4.setForeground(Color.BLACK);
		panel_1.add(b4);

		JButton b5 = new JButton("");
		b5.setBackground(Color.DARK_GRAY);
		b5.setForeground(Color.BLACK);
		panel_1.add(b5);

		JButton b6 = new JButton("");
		b6.setBackground(Color.DARK_GRAY);
		b6.setForeground(Color.BLACK);
		panel_1.add(b6);

		JButton b7 = new JButton("");
		b7.setBackground(Color.DARK_GRAY);
		b7.setForeground(Color.BLACK);
		panel_1.add(b7);

		JButton b8 = new JButton("");
		b8.setBackground(Color.DARK_GRAY);
		b8.setForeground(Color.BLACK);
		panel_1.add(b8);

		JButton b9 = new JButton("");
		b9.setBackground(Color.DARK_GRAY);
		b9.setForeground(Color.BLACK);
		panel_1.add(b9);

		grid = new boolean[3][3];
		buttons = new JButton[3][3];
		buttons[0][0] = b1;
		buttons[0][1] = b2;
		buttons[0][2] = b3;
		buttons[1][0] = b4;
		buttons[1][1] = b5;
		buttons[1][2] = b6;
		buttons[2][0] = b7;
		buttons[2][1] = b8;
		buttons[2][2] = b9;
		start(null);

		b1.setFocusable(false);
		b1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				sumsc = Integer.parseInt(numsc) + 1;
				numsc = String.valueOf(sumsc);
				label_1.setText(numsc + "");
				b1Action(evt);

			}

			private void b1Action(ActionEvent evt) {
				mainExecution(0, 0);

			}
		});
		b2.setFocusable(false);
		b2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				sumsc = Integer.parseInt(numsc) + 1;
				numsc = String.valueOf(sumsc);
				label_1.setText(numsc + "");
				b2Action(evt);

			}

			private void b2Action(ActionEvent evt) {
				mainExecution(0, 1);

			}
		});
		b3.setFocusable(false);
		b3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				sumsc = Integer.parseInt(numsc) + 1;
				numsc = String.valueOf(sumsc);
				label_1.setText(numsc + "");
				b3Action(evt);

			}

			private void b3Action(ActionEvent evt) {
				mainExecution(0, 2);

			}
		});
		b4.setFocusable(false);
		b4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				sumsc = Integer.parseInt(numsc) + 1;
				numsc = String.valueOf(sumsc);
				label_1.setText(numsc + "");
				b4Action(evt);

			}

			private void b4Action(ActionEvent evt) {
				mainExecution(1, 0);

			}
		});
		b5.setFocusable(false);
		b5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		b5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				sumsc = Integer.parseInt(numsc) + 1;
				numsc = String.valueOf(sumsc);
				label_1.setText(numsc + "");
				b5Action(evt);

			}

			private void b5Action(ActionEvent evt) {
				mainExecution(1, 1);

			}
		});
		b6.setFocusable(false);
		b6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		b6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				sumsc = Integer.parseInt(numsc) + 1;
				numsc = String.valueOf(sumsc);
				label_1.setText(numsc + "");
				b6Action(evt);

			}

			private void b6Action(ActionEvent evt) {
				mainExecution(1, 2);

			}
		});
		b7.setFocusable(false);
		b7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		b7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				sumsc = Integer.parseInt(numsc) + 1;
				numsc = String.valueOf(sumsc);
				label_1.setText(numsc + "");
				b7Action(evt);

			}

			private void b7Action(ActionEvent evt) {
				mainExecution(2, 0);

			}
		});
		b8.setFocusable(false);
		b8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		b8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				sumsc = Integer.parseInt(numsc) + 1;
				numsc = String.valueOf(sumsc);
				label_1.setText(numsc + "");
				b8Action(evt);

			}

			private void b8Action(ActionEvent evt) {
				mainExecution(2, 1);

			}
		});
		b9.setFocusable(false);
		b9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		b9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				sumsc = Integer.parseInt(numsc) + 1;
				numsc = String.valueOf(sumsc);
				label_1.setText(numsc + "");
				b9Action(evt);

			}

			private void b9Action(ActionEvent evt) {
				mainExecution(2, 2);

			}
		});

		JButton btnEnd = new JButton("");
		btnEnd.setBackground(Color.BLACK);
		btnEnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {// กล่องตอบโต้หลังกดend
				t.suspend();
				int a4 = JOptionPane.showConfirmDialog(null,
						"Are you want to exit ?", "YOU EXIT MANU",
						JOptionPane.INFORMATION_MESSAGE);
				switch (a4) {
				case JOptionPane.YES_OPTION:
					new Home_game();
					t.stop();
					frmPuzzlelight.setVisible(false);
					break;
				case JOptionPane.NO_OPTION:
					t.resume();
					break;
				case JOptionPane.CANCEL_OPTION:
				}
			}
		});
		btnEnd.setIcon(new ImageIcon(
				"Img\\exit.jpg"));
		btnEnd.setBounds(518, 438, 105, 45);
		panel.add(btnEnd);

		labelscoresc = new JLabel("3");
		labelscoresc.setHorizontalAlignment(SwingConstants.CENTER);
		labelscoresc.setForeground(Color.WHITE);
		labelscoresc.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 20));
		labelscoresc.setBounds(575, 0, 58, 45);
		panel.add(labelscoresc);

		JLabel lblTime = new JLabel("Time:");
		lblTime.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 30));
		lblTime.setForeground(Color.WHITE);
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime.setBounds(75, 0, 81, 45);
		panel.add(lblTime);

		timesc = new JLabel("00:00");
		timesc.setHorizontalAlignment(SwingConstants.CENTER);
		timesc.setForeground(Color.WHITE);
		timesc.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 20));
		timesc.setBounds(166, 2, 134, 45);
		panel.add(timesc);

		JLabel lbltm = new JLabel("Level:");
		lbltm.setHorizontalAlignment(SwingConstants.CENTER);
		lbltm.setForeground(Color.WHITE);
		lbltm.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 30));
		lbltm.setBounds(458, -2, 107, 45);
		panel.add(lbltm);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(
				"Img\\bgplay1.jpg"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 108, 303, 292);
		panel.add(lblNewLabel);

		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPuzzlelight.setVisible(false);
				new no1();
			}
		});
		button.setIcon(new ImageIcon(
				"Img\\dd.jpg"));
		button.setBounds(10, 399, 246, 95);
		panel.add(button);

		JLabel lblClick = new JLabel("Click:");
		lblClick.setHorizontalAlignment(SwingConstants.CENTER);
		lblClick.setForeground(Color.WHITE);
		lblClick.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 30));
		lblClick.setBounds(280, 3, 124, 30);
		panel.add(lblClick);

		label_1 = new JLabel("0");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 20));
		label_1.setBounds(405, 2, 58, 32);
		panel.add(label_1);

	}

	private void mainExecution(int row, int cl) {
		if (grid_lock == 0) {
			// re.setEnabled(true);
			grid[row][cl] = !grid[row][cl];
			if (row - 1 >= 0) {
				grid[row - 1][cl] = !grid[row - 1][cl];
			}
			if (row + 1 <= 2) {
				grid[row + 1][cl] = !grid[row + 1][cl];
			}
			if (cl - 1 >= 0) {
				grid[row][cl - 1] = !grid[row][cl - 1];
			}
			if (cl + 1 <= 2) {
				grid[row][cl + 1] = !grid[row][cl + 1];
			}
			updateGrid();
			checkWin();
		}
	}

	private void checkWin() {
		int a, b, counter;
		counter = 0;
		for (a = 0; a < grid.length; a++) {
			for (b = 0; b < grid.length; b++) {
				if (grid[a][b]) {
					counter = 1;
					break;
				}
			}
		}
		if (counter == 0) {
			JOptionPane.showMessageDialog(null, "YouWin and NextLevel", "YouWIN!!!!!!!!!",
					JOptionPane.INFORMATION_MESSAGE);
			frmPuzzlelight.setVisible(false);
			new no4();
		}
	}

	private void updateGrid() {
		int a, b;
		for (a = 0; a < grid.length; a++) {
			for (b = 0; b < grid.length; b++) {
				if (grid[a][b]) {
					((AbstractButton) buttons[a][b]).setIcon(colorTile);
				} else {
					((AbstractButton) buttons[a][b]).setIcon(uncolorTile);
				}
			}
		}
	}

	private void start(ActionEvent evt) {
		// System.out.println("TEST");
		Grid();
		updateGrid();
		// copyGridArray();
		grid_lock = 0;

	}

	private void Grid() {
		mainExecution(1, 2);
		mainExecution(0, 2);
		mainExecution(0, 1);
	}
}
