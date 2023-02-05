package practice_selenium;

import java.util.Random;

public class RandomPassWordCreation {

	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		int len=7;
		String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk";
				Random rnd = new Random();
				StringBuilder sb = new StringBuilder(len);
				for (int i = 0; i < len; i++)
					sb.append(chars.charAt(rnd.nextInt(chars.length())));
				System.out.println(sb.toString());
				//return sb.toString();

	}

}
