import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
class ShuffleArray{
	public static void main(String[] args){
		Integer[] a={1,2,3,4,5,6,7};
		List<Integer> l=new ArrayList<>(Arrays.asList(a));
		Collections.shuffle(l);
		Integer[] shuffledArray=l.toArray(new Integer[0]);
		System.out.println(Arrays.toString(shuffledArray));
	}
} 