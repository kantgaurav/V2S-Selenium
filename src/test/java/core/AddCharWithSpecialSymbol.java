package core;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddCharWithSpecialSymbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  /// https://www.youtube.com/watch?v=mQjpFa-x9OY&t=251s
		
		String arr [] = {"T", "R", "Y"};
		
		
		String join = String.join(":", arr);
		
		System.out.println(join);
		
		join = String.join("", arr);
		
		System.out.println(join);
		
		
	  String join1=	Arrays.asList("R", "A", "M").stream().collect(Collectors.joining(""));
		System.out.println(join1);
	}

}
