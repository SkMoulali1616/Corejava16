package com.opps;
//Real-time situation: Mobile phone volume should be between 0 and 100.

class Mobile{
	private int volume;
	//setter method
	public void setvolume(int volume) {
		if(volume>=0 && volume<=100) {
			this.volume=volume;
		}else {
			System.out.println("invaild number");
		}
	}
	public int getvolume() {
		return volume;
	}
}

public class Teat3enp {

	public static void main(String[] args) {
		
		Mobile m = new Mobile();
		m.setvolume(123);
		System.out.println(m.getvolume());

	}

}
