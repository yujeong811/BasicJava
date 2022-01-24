package g_oop2;

public class Time {

	private int hour;
	private int minute;
	private int second;
	
	// 이 두개의 메서드를 통해서 변수에 간접접근 
	public int getHour() { // 값을 읽어오기 위한 메서드
		return hour;
	}

	public void setHour(int hour) { // 값을 저장하기 위한 메서드
//        if (hour <= 23 && hour > 0) {
//        	this.hour = hour;
//		} else {
//		    this.hour = 0;
//		}
        
        if(hour < 0) {
        	this.hour = 0;
        } else if(23 < hour) {
        	this.hour = 23;
        } else {
        	this.hour = hour;
        }
	}


	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
//		if (minute <= 59 && minute > 0) {
//			this.minute = minute;
//		} else {
//			this.minute = 0;
//		}
		
		if (minute < 0) {
			this.minute = 0;
		} else if (59 < minute) {
			this.minute = 59;
		} else {
			this.minute = minute;
		}

	}


	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
//		if (second <= 59 && second > 0) {
//			this.second = second;
//		} else {
//			this.second = 0;
//		}
		if (second < 0) {
			this.second = 0;
		} else if (59 < second) {
			this.second = 59;
		} else {
			this.second = second;
		}
	}
	
	private void stop() { // 노출시키지 않기 위해 private 붙여줌
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
	} 

	void clock() {
		while(true) {
			System.out.print(toString());
			stop();
			setSecond(second + 1); // 1초씩 증가하면서 계속 출력
		}
	}

	@Override
	public String toString() {
//		return "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
		return hour + ":" + minute + ":" + second;
	}
	
	

}
