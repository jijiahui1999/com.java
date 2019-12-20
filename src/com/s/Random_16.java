package com.s;

import java.util.Random;

public class Random_16 {

	public static void main(String[] args) {
		System.out.println("����һ������0.0С��1.0����������:"+Math.random());
		Random r=new Random();
		System.out.println("���� boolean���͵����������"+r.nextBoolean());
		System.out.println("���� double���͵����������"+r.nextDouble());
		System.out.println("���� float���͵����������"+r.nextFloat());
		System.out.println("���� nt���͵����������"+r.nextInt());
		System.out.println("���� 0-10֮��int���͵����������"+r.nextInt());
		System.out.println("���� long���͵����������"+r.nextLong());

	}

}
