package com.zhangzhihao.SpringMVCSeedProject.Utils;


import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Utils {
	private static byte[] md5(String s) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		MessageDigest algorithm;
		algorithm = MessageDigest.getInstance("MD5");
		algorithm.reset();
		algorithm.update(s.getBytes("UTF-8"));
		return algorithm.digest();
	}

	private static String toHex(byte hash[]) {
		if (hash == null) {
			return null;
		}
		StringBuffer buf = new StringBuffer(hash.length * 2);
		int i;

		for (i = 0; i < hash.length; i++) {
			if ((hash[i] & 0xff) < 0x10) {
				buf.append("0");
			}
			buf.append(Long.toString(hash[i] & 0xff, 16));
		}
		return buf.toString();
	}

	public static String getMD5(String s) {
		try {
			return new String(toHex(md5(s)).getBytes("UTF-8"), "UTF-8");
		} catch (Exception e) {
			return s;
		}
	}
}
