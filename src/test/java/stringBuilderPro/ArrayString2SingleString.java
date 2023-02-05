package stringBuilderPro;

public class ArrayString2SingleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strs[] = { "Arshad", "Althamas", "Johar", "Javed", "Raju", "Krishna" };

		StringBuilder sb = new StringBuilder();

		for (String s : strs) {
			sb.append(s);

		}
		String str = sb.toString();
		System.out.println(str);
	}

}
