package com.jinglun.util;

import java.security.MessageDigest;

import com.jinglun.entity.MD5;

public class InitMD5 {
	public MD5 toMD5(String plainText) {
		MD5 m=new MD5();
		   try {
		    //生成实现指定摘要算法的 MessageDigest 对象。
		    MessageDigest md = MessageDigest.getInstance("MD5"); 
		    //使用指定的字节数组更新摘要。
		    md.update(plainText.getBytes());
		    //通过执行诸如填充之类的最终操作完成哈希计算。
		    byte b[] = md.digest();
		    //生成具体的md5密码到buf数组
		    int i;
		    StringBuffer buf = new StringBuffer("");
		    for (int offset = 0; offset < b.length; offset++) {
		     i = b[offset];
		     if (i < 0)
		      i += 256;
		     if (i < 16)
		      buf.append("0");
		     buf.append(Integer.toHexString(i));
		    }
		   String pw= buf.toString();
		   m.setPassword(pw);
		   } 
		   catch (Exception e) {
		    e.printStackTrace();
		   }
		return m;

		  }

}
