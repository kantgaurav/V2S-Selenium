package collectionProgram;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConvertLis_tStrToList_Int {
	
	
	
	public static <T, U> List<U>convertStrListToListInt(List<T> listOfString, Function<T,U> function){
		
		
		{
		return listOfString.stream().map(function).collect(Collectors.toList());
		}
		
		
	}

}
