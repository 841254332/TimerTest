package timertest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer timer = new Timer();
		long time = 3600000;
		Show show = new Show();
		timer.schedule(show, 0,time);
	}
}

class Show extends TimerTask {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("HH:mm");	
		System.out.println(df.format(date));
	}
}
