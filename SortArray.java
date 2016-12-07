
 public class SortArray {
 	public static String [] sort(String[] scores) {
		String min ="";
		int minIdx=0;

		for (int i=0; i<scores.length-1; i++) {
		int oldMinIdx = i;
		//find min
		for (int j=i+1; j<scores.length-1; j++) {
		if (Double.parseDouble(min)>Double.parseDouble(scores[j])) {
			min = scores[j];
			minIdx = j;
		}
		}
		swap(scores, minIdx, oldMinIdx, min);
		}
		return scores;
		}
		private static void swap (String []scores, int minIdx, int oldMinIdx, String min) {
			String temp = scores[oldMinIdx];
			scores [oldMinIdx] = min;
			scores [minIdx] = temp;
		}
		}







