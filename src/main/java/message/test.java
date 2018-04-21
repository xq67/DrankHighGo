package message;

public class test {

	/**
	 * 短信验证
	 */
	public static void main(String[] args) {
		//生成验证码
		 String code = (int) (Math.random() * 9000 + 1000) + "";
		new ShortMessage().Send("18595751967", " 尊敬用户你好，欢迎注册平台。 验证码："+code);
	}

}
