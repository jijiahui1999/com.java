package com.s;

import java.util.HashSet;
import java.util.Random;

public class Ssq {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("双色球");
		System.out.println("六个红球号码是");
		Random r=new Random();
		
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<1000;i++) {
			int hq=r.nextInt(33)+1;
			if (hs.size()==6) {
				break;
			}
			hs.add(hq);
		}
			for(Integer hp:hs) {
				System.out.print(hp+" ");
			}
			//Thread.sleep(1000);
		
		System.out.println("\n1个蓝球号码是");
		int lq;
			lq=r.nextInt(16)+1;
			System.out.print(lq+" ");
			Thread.sleep(1000);
		

	}

}
