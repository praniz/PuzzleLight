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

import data.settime;
import deskplaygame.Home_game;

public class no5 {
	
	String numsc = "0";
	int sumsc;
	settime t;//นำเข้าเวลา
	private JLabel timesc, labellv;// คะแนน เวลา สกอ
	private JButton reset;
	private JLabel lblNewLabel_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					no5 window = new no5();
					window.frmPuzzlelight.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		});
	}

	public no5() {
		initialize();
		frmPuzzlelight.setVisible(true);
		t = new settime(timesc, 0,0);
		t.start();
	}

	private boolean grid[][];

	private JFrame frmPuzzlelight;
	private int grid_lock;


	private Object[][] buttons;

	private ImageIcon colorTile;

	private ImageIcon uncolorTile;

	private void initialize() {
		colorTile = new ImageIcon("Img\\colorTile.jpg");
		uncolorTile = new ImageIcon("Img\\uncolorTile.jpg");

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
				new no5();
	
			}
		});
		reset.setBounds(323, 438, 111, 45);
		panel.add(reset);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(323, 155, 300, 245);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 5, 0, 0));

		JButton b1 = new JButton("");
		b1.setBackground(Color.DARK_GRAY);
		panel_1.add(b1);
		// b1 = buttons[0][0];

		JButton b2 = new JButton("");
		b2.setBackground(Color.DARK_GRAY);
		panel_1.add(b2);
		// buttons[0][1] = b2;

		JButton b3 = new JButton("");
		b3.setBackground(Color.DARK_GRAY);
		panel_1.add(b3);
		// buttons[0][2] = b3;

		JButton b4 = new JButton("");
		b4.setBackground(Color.DARK_GRAY);
		panel_1.add(b4);
		// buttons[0][3] = b4;

		JButton b5 = new JButton("");
		b5.setBackground(Color.DARK_GRAY);
		panel_1.add(b5);
		// buttons[0][4] = b5;

		JButton b6 = new JButton("");
		b6.setBackground(Color.DARK_GRAY);
		panel_1.add(b6);
		// buttons[1][0] = b6;

		JButton b7 = new JButton("");
		b7.setBackground(Color.DARK_GRAY);
		panel_1.add(b7);
		// buttons[1][1] = b7;

		JButton b8 = new JButton("");
		b8.setBackground(Color.DARK_GRAY);
		panel_1.add(b8);
		// buttons[1][2] = b8;

		JButton b9 = new JButton("");
		b9.setBackground(Color.DARK_GRAY);
		panel_1.add(b9);
		// buttons[1][3] = b9;

		JButton b10 = new JButton("");
		b10.setBackground(Color.DARK_GRAY);
		panel_1.add(b10);
		// buttons[1][4] = b10;

		JButton b11 = new JButton("");
		b11.setBackground(Color.DARK_GRAY);
		panel_1.add(b11);
		// buttons[2][0] = b11;

		JButton b12 = new JButton("");
		b12.setBackground(Color.DARK_GRAY);
		panel_1.add(b12);
		// buttons[2][1] = b12;

		JButton b13 = new JButton("");
		b13.setBackground(Color.DARK_GRAY);
		panel_1.add(b13);
		// buttons[2][2] = b13;

		JButton b14 = new JButton("");
		b14.setBackground(Color.DARK_GRAY);
		panel_1.add(b14);
		// buttons[2][3] = b14;

		JButton b15 = new JButton("");
		b15.setBackground(Color.DARK_GRAY);
		panel_1.add(b15);
		// buttons[2][4] = b15;

		JButton b16 = new JButton("");
		b16.setBackground(Color.DARK_GRAY);
		panel_1.add(b16);
		// buttons[3][0] = b16;

		JButton b17 = new JButton("");
		b17.setBackground(Color.DARK_GRAY);
		panel_1.add(b17);
		// buttons[3][1] = b17;

		JButton b18 = new JButton("");
		b18.setBackground(Color.DARK_GRAY);
		panel_1.add(b18);
		// buttons[3][2] = b18;

		JButton b19 = new JButton("");
		b19.setBackground(Color.DARK_GRAY);
		panel_1.add(b19);
		// buttons[3][3] = b19;

		JButton b20 = new JButton("");
		b20.setBackground(Color.DARK_GRAY);
		panel_1.add(b20);
		// buttons[3][4] = b20;

		JButton b21 = new JButton("");
		b21.setBackground(Color.DARK_GRAY);
		panel_1.add(b21);
		// buttons[4][0] = b21;

		JButton b22 = new JButton("");
		b22.setBackground(Color.DARK_GRAY);
		panel_1.add(b22);
		// buttons[4][1] = b22;

		JButton b23 = new JButton("");
		b23.setBackground(Color.DARK_GRAY);
		panel_1.add(b23);
		// buttons[4][2] = b23;

		JButton b24 = new JButton("");
		b24.setBackground(Color.DARK_GRAY);
		panel_1.add(b24);
		// buttons[4][3] = b24;

		JButton b25 = new JButton("");
		b25.setBackground(Color.DARK_GRAY);
		panel_1.add(b25);
		// buttons[4][4] = b25;

		grid = new boolean[5][5];

		// initializeButtonsArray();

		buttons = new JButton[5][5];
		buttons[0][0] = b1;
		buttons[0][1] = b2;
		buttons[0][2] = b3;
		buttons[0][3] = b4;
		buttons[0][4] = b5;
		buttons[1][0] = b6;
		buttons[1][1] = b7;
		buttons[1][2] = b8;
		buttons[1][3] = b9;
		buttons[1][4] = b10;
		buttons[2][0] = b11;
		buttons[2][1] = b12;
		buttons[2][2] = b13;
		buttons[2][3] = b14;
		buttons[2][4] = b15;
		buttons[3][0] = b16;
		buttons[3][1] = b17;
		buttons[3][2] = b18;
		buttons[3][3] = b19;
		buttons[3][4] = b20;
		buttons[4][0] = b21;
		buttons[4][1] = b22;
		buttons[4][2] = b23;
		buttons[4][3] = b24;
		buttons[4][4] = b25;
		start(null);

		b1.setFocusable(false);
		b1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				sumsc = Integer.parseInt(numsc) + 1;
				numsc = String.valueOf(sumsc);
				lblNewLabel_1.setText(numsc + "");
				b1Action(evt);

			}
		});
		b2.setFocusable(false);
		b2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		b2.setFocusable(false);
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				sumsc = Integer.parseInt(numsc) + 1;
				numsc = String.valueOf(sumsc);
				lblNewLabel_1.setText(numsc + "");
				b2Action(evt);

			}
		});
		b3.setFocusable(false);
		b3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		b3.setFocusable(false);
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				sumsc = Integer.parseInt(numsc) + 1;
				numsc = String.valueOf(sumsc);
				lblNewLabel_1.setText(numsc + "");
				b3Action(evt);

			}
		});
		b4.setFocusable(false);
		b4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		b4.setFocusable(false);
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				sumsc = Integer.parseInt(numsc) + 1;
				numsc = String.valueOf(sumsc);
				lblNewLabel_1.setText(numsc + "");
				b4Action(evt);

			}
		});
		b5.setFocusable(false);
		b5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		b5.setFocusable(false);
		b5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				sumsc = Integer.parseInt(numsc) + 1;
				numsc = String.valueOf(sumsc);
				lblNewLabel_1.setText(numsc + "");
				b5Action(evt);

			}
		});
		b6.setFocusable(false);
		b6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		b6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				sumsc = Integer.parseInt(numsc) + 1;
				numsc = String.valueOf(sumsc);
				lblNewLabel_1.setText(numsc + "");
				b6Action(evt);

			}
		});
		b7.setFocusable(false);
		b7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		b7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				sumsc = Integer.parseInt(numsc) + 1;
				numsc = String.valueOf(sumsc);
				lblNewLabel_1.setText(numsc + "");
				b7Action(evt);

			}
		});
		b8.setFocusable(false);
		b8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		b8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				sumsc = Integer.parseInt(numsc) + 1;
				numsc = String.valueOf(sumsc);
				lblNewLabel_1.setText(numsc + "");
				b8Action(evt);

			}
		});
		b9.setFocusable(false);
		b9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		b9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				sumsc = Integer.parseInt(numsc) + 1;
				numsc = String.valueOf(sumsc);
				lblNewLabel_1.setText(numsc + "");
				b9Action(evt);

			}
		});
		b10.setFocusable(false);
		b10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		b10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				sumsc = Integer.parseInt(numsc) + 1;
				numsc = String.valueOf(sumsc);
				lblNewLabel_1.setText(numsc + "");
				b10Action(evt);

			}
		});
		b11.setFocusable(false);
		b11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		b11.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				sumsc = Integer.parseInt(numsc) + 1;
				numsc = String.valueOf(sumsc);
				lblNewLabel_1.setText(numsc + "");
				b11Action(evt);

			}
		});
		b12.setFocusable(false);
		b12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		b12.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				sumsc = Integer.parseInt(numsc) + 1;
				numsc = String.valueOf(sumsc);
				lblNewLabel_1.setText(numsc + "");
				b12Action(evt);

			}
		});
		b13.setFocusable(false);
		b13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		b13.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				sumsc = Integer.parseInt(numsc) + 1;
				numsc = String.valueOf(sumsc);
				lblNewLabel_1.setText(numsc + "");
				b13Action(evt);

			}
		});
		b14.setFocusable(false);
		b14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		b14.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				sumsc = Integer.parseInt(numsc) + 1;
				numsc = String.valueOf(sumsc);
				lblNewLabel_1.setText(numsc + "");
				b14Action(evt);

			}
		});
		b15.setFocusable(false);
		b15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		b15.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				sumsc = Integer.parseInt(numsc) + 1;
				numsc = String.valueOf(sumsc);
				lblNewLabel_1.setText(numsc + "");
				b15Action(evt);

			}
		});
		b16.setFocusable(false);
		b16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		b16.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				sumsc = Integer.parseInt(numsc) + 1;
				numsc = String.valueOf(sumsc);
				lblNewLabel_1.setText(numsc + "");
				b16Action(evt);

			}
		});
		b17.setFocusable(false);
		b17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		b17.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				sumsc = Integer.parseInt(numsc) + 1;
				numsc = String.valueOf(sumsc);
				lblNewLabel_1.setText(numsc + "");
				b17Action(evt);

			}
		});
		b18.setFocusable(false);
		b18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		b18.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				sumsc = Integer.parseInt(numsc) + 1;
				numsc = String.valueOf(sumsc);
				lblNewLabel_1.setText(numsc + "");
				b18Action(evt);

			}
		});
		b19.setFocusable(false);
		b19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		b19.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				sumsc = Integer.parseInt(numsc) + 1;
				numsc = String.valueOf(sumsc);
				lblNewLabel_1.setText(numsc + "");
				b19Action(evt);

			}
		});
		b20.setFocusable(false);
		b20.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		b20.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				sumsc = Integer.parseInt(numsc) + 1;
				numsc = String.valueOf(sumsc);
				lblNewLabel_1.setText(numsc + "");
				b20Action(evt);

			}
		});
		b21.setFocusable(false);
		b21.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		b21.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				sumsc = Integer.parseInt(numsc) + 1;
				numsc = String.valueOf(sumsc);
				lblNewLabel_1.setText(numsc + "");
				b21Action(evt);

			}
		});
		b22.setFocusable(false);
		b22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		b22.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				sumsc = Integer.parseInt(numsc) + 1;
				numsc = String.valueOf(sumsc);
				lblNewLabel_1.setText(numsc + "");
				b22Action(evt);

			}
		});
		b23.setFocusable(false);
		b23.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		b23.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				sumsc = Integer.parseInt(numsc) + 1;
				numsc = String.valueOf(sumsc);
				lblNewLabel_1.setText(numsc + "");
				b23Action(evt);

			}
		});
		b24.setFocusable(false);
		b24.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		b24.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				sumsc = Integer.parseInt(numsc) + 1;
				numsc = String.valueOf(sumsc);
				lblNewLabel_1.setText(numsc + "");
				b24Action(evt);

			}
		});
		b25.setFocusable(false);
		b25.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		JButton btnEnd = new JButton("");
		btnEnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {// กล่องตอบโต้หลังกดend
				t.suspend();
				int a4 = JOptionPane.showConfirmDialog(null,
						"How do your save", "YOU EXIT MANU",
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
		
				labellv = new JLabel("5");
				labellv.setHorizontalAlignment(SwingConstants.CENTER);
				labellv.setForeground(Color.WHITE);
				labellv.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 20));
				labellv.setBounds(590, 0, 43, 45);
				panel.add(labellv);

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

		JLabel lbllv = new JLabel("Level:");
		lbllv.setHorizontalAlignment(SwingConstants.CENTER);
		lbllv.setForeground(Color.WHITE);
		lbllv.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 30));
		lbllv.setBounds(473, -2, 107, 45);
		panel.add(lbllv);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(
				"Img\\bgplay1.jpg"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 108, 303, 292);
		panel.add(lblNewLabel);
		
		JButton btnNewgame = new JButton("");
		btnNewgame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPuzzlelight.setVisible(false);
				new no6();
			}
		});
		btnNewgame.setIcon(new ImageIcon("Img\\dd.jpg"));
		btnNewgame.setBounds(20, 399, 246, 95);
		panel.add(btnNewgame);
		
		JLabel lblScore = new JLabel("Click:");
		lblScore.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 30));
		lblScore.setForeground(Color.WHITE);
		lblScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore.setBounds(280, 7, 124, 30);
		panel.add(lblScore);
		
		lblNewLabel_1 = new JLabel(numsc);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(405, 6, 58, 32);
		panel.add(lblNewLabel_1);
		b25.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				sumsc = Integer.parseInt(numsc) + 1;
				numsc = String.valueOf(sumsc);
				lblNewLabel_1.setText(numsc + "");
				b25Action(evt);

			}
		});

	}

	/*
	 * private void initializeButtonsArray() { buttons = new JButton[5][5];
	 * buttons[0][0] = b1; buttons[0][1] = b2; buttons[0][2] = b3; buttons[0][3]
	 * = b4; buttons[0][4] = b5; buttons[1][0] = b6; buttons[1][1] = b7;
	 * buttons[1][2] = b8; buttons[1][3] = b9; buttons[1][4] = b10;
	 * buttons[2][0] = b11; buttons[2][1] = b12; buttons[2][2] = b13;
	 * buttons[2][3] = b14; buttons[2][4] = b15; buttons[3][0] = b16;
	 * buttons[3][1] = b17; buttons[3][2] = b18; buttons[3][3] = b19;
	 * buttons[3][4] = b20; buttons[4][0] = b21; buttons[4][1] = b22;
	 * buttons[4][2] = b23; buttons[4][3] = b24; buttons[4][4] = b25;
	 * 
	 * }
	 */

	private void b1Action(ActionEvent evt) {
		mainExecution(0, 0);
	}

	private void b2Action(ActionEvent evt) {
		mainExecution(0, 1);
	}

	private void b3Action(ActionEvent evt) {
		mainExecution(0, 2);
	}

	private void b4Action(ActionEvent evt) {
		mainExecution(0, 3);
	}

	private void b5Action(ActionEvent evt) {
		mainExecution(0, 4);
	}

	private void b6Action(ActionEvent evt) {
		mainExecution(1, 0);
	}

	private void b7Action(ActionEvent evt) {
		mainExecution(1, 1);
	}

	private void b8Action(ActionEvent evt) {
		mainExecution(1, 2);
	}

	private void b9Action(ActionEvent evt) {
		mainExecution(1, 3);
	}

	private void b10Action(ActionEvent evt) {
		mainExecution(1, 4);
	}

	private void b11Action(ActionEvent evt) {
		mainExecution(2, 0);
	}

	private void b12Action(ActionEvent evt) {
		mainExecution(2, 1);
	}

	private void b13Action(ActionEvent evt) {
		mainExecution(2, 2);
	}

	private void b14Action(ActionEvent evt) {
		mainExecution(2, 3);
	}

	private void b15Action(ActionEvent evt) {
		mainExecution(2, 4);
	}

	private void b16Action(ActionEvent evt) {
		mainExecution(3, 0);
	}

	private void b17Action(ActionEvent evt) {
		mainExecution(3, 1);
	}

	private void b18Action(ActionEvent evt) {
		mainExecution(3, 2);
	}

	private void b19Action(ActionEvent evt) {
		mainExecution(3, 3);
	}

	private void b20Action(ActionEvent evt) {
		mainExecution(3, 4);
	}

	private void b21Action(ActionEvent evt) {
		mainExecution(4, 0);
	}

	private void b22Action(ActionEvent evt) {
		mainExecution(4, 1);
	}

	private void b23Action(ActionEvent evt) {
		mainExecution(4, 2);
	}

	private void b24Action(ActionEvent evt) {
		mainExecution(4, 3);
	}

	private void b25Action(ActionEvent evt) {
		mainExecution(4, 4);
	}

	private void mainExecution(int row, int cl) {
		if (grid_lock == 0) {
			// re.setEnabled(true);
			grid[row][cl] = !grid[row][cl];
			if (row - 1 >= 0) {
				grid[row - 1][cl] = !grid[row - 1][cl];
			}
			if (row + 1 <= 4) {
				grid[row + 1][cl] = !grid[row + 1][cl];
			}
			if (cl - 1 >= 0) {
				grid[row][cl - 1] = !grid[row][cl - 1];
			}
			if (cl + 1 <= 4) {
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
				new no6();
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
	
		mainExecution(1, 4);
		mainExecution(0, 4);
		mainExecution(2, 2);
		mainExecution(2, 3);
		mainExecution(4 ,4);
		mainExecution(1, 0);
		mainExecution(1, 3);
		mainExecution(2, 4);
		mainExecution(1, 2);
		mainExecution(2, 3);
		mainExecution(0 ,1);
		mainExecution(4, 0);
		
	}
}
