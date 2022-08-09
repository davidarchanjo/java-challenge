import java.util.ArrayList;
import java.util.List;

class Program {

	public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
		var i = 0;
		var x = i + 1;
		var y = x + 1;
		var z = y + 1;
		var result = new ArrayList<Integer[]>();
		do {
			do {
				if (z >= array.length) {
					++y;
					z = y + 1;
				}
				if (z >= array.length)
					break;
				var list = List.of(array[i], array[x], array[y], array[z]);
				var sum = list.stream().reduce(0, Integer::sum);
				if (sum == targetSum) {
					result.add(list.toArray(new Integer[list.size()]));
				}
				++z;
			} while (array.length >= (x + 2));
			++x;
			if ((x + 2) == array.length) {
				++i;
				x = i + 1;
			}
			y = x + 1;
			z = y + 1;
		} while (z < array.length);

		if (result.isEmpty())
			result.add(new Integer[] {});
		return result;
	}
}
