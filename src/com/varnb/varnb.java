package com.varnb;

import java.util.Scanner;
import java.util.Arrays;

public class varnb {

	public static void main(String[] args) {
		int[] sco1 = { 89, -23, 64, 91, 119, 52, 73 };
		varnb sVarnb = new varnb();
		System.out.println("前三名成绩依次为：");
		sVarnb.getScores(sco1);

	}

	public void getScores(int[] sco1) {
		Arrays.sort(sco1);
		int num = 0;
		for (int i = sco1.length - 1; i >= 0; i--) {

			if (sco1[i] < 0 || sco1[i] > 100) {
				continue;
			}
			num++;
			if (num > 3) {
				break;
			}
			System.out.println(sco1[i]);
		}

	}
}