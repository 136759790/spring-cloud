package org.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import org.apache.commons.lang.math.RandomUtils;
import org.bouncycastle.util.encoders.Base64Encoder;

public class Test {
	public static void main(String[] args) {
//		for (int i = 0; i < 100; i++) {
//			System.out.println(UUID.randomUUID().toString().replaceAll("-", ""));
//			
//		}
		System.out.println("abc".indexOf("/"));
		System.out.println("abc".substring(0, "abc".length()));
		String yzm="";
		for (int i = 0; i < 4; i++) {
			yzm+=RandomUtils.nextInt(10);
		}
		System.out.println(yzm);
	}
	
}
