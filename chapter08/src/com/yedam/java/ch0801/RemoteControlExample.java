package com.yedam.java.ch0801;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoteControlExample {
	public static void main(String[] args) throws NumberFormatException, IOException {

		while (true) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			RemoteControl rc = null;

			int selected = Integer.parseInt(br.readLine());

			if (selected == 1) { // 페어링 1번 : TV
				rc = new Television();
				rc.turnOn();
				rc.setVolume(-1);
			} else if (selected == 2) {
				rc = new Audio();
				rc.turnOn();
				rc.setVolume(12);
			}
		}
	}
	Television tv = new Television();
}
