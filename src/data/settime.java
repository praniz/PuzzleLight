package data;

import javax.swing.JLabel;

public class settime extends Thread {
	JLabel lbl;
	int second = 0;
	int minute = 0;

	public settime(JLabel lbl, int minute, int second) {
		this.lbl = lbl;
		this.second = second;
		this.minute = minute;	
	}

	public void run() {

		while (true) {
			try {

				second++;
				second %= 60;
				if (second == 0) {
					minute++;
					minute %= 60;
				}
				lbl.setText((minute < 10 ? "0" + minute : minute) + ":"
						+ (second < 10 ? "0" + second : second));
				sleep(1000);
			} catch (Exception e) {

			} catch (ThreadDeath e) {//¶éÒËÂØ´ãËéà«¿
				System.out.println(minute+second);
			}
		}
	}
}
