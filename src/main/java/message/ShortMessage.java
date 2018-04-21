package message;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;

public class ShortMessage {
	/**
	 * 
	 * 发送短消息
	 * @param phone 手机号码
	 */
	public void Send(String phone, String txt) {
		HttpClient client = new HttpClient();
		PostMethod post = new PostMethod("http://utf8.sms.webchinese.cn");
		post.addRequestHeader("Content-Type",
				"application/x-www-form-urlencoded;charset=utf8");
		NameValuePair[] data = { new NameValuePair("Uid", "libingjie"),
				new NameValuePair("Key", "1d76f1c31386cfce4f57"),
				new NameValuePair("smsMob", phone),
				new NameValuePair("smsText", txt) };
		post.setRequestBody(data);

		try {
			client.executeMethod(post);
			Header[] headers = post.getResponseHeaders();
			int statusCode = post.getStatusCode();
			System.out.println("statusCode:" + statusCode);
			for (Header h : headers) {
				System.out.println(h.toString());
			}
			String result = new String(post.getResponseBodyAsString().getBytes(
					"gbk"));
			System.out.println(result); // 打印返回消息状态

			post.releaseConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
