package javaprogramspractise;

public class SwapTwoValuesInArray {

	/*
	 * // Write a program to swap 2 elements in a list. // For eg : Consider
	 * following list of elements: // {7,8,10,1,2,3} // And we have to swap 8 and 10
	 * then after swapping the list // will look like : {7,10,8,1,2,3}
	 */

	public void swapTwoNumber(int value1, int value2) {
		int arr[] = { 7, 8, 10, 1, 2, 3 };
		int i, j=0, temp;
		boolean flag = false;
		for (i = 0; i < arr.length; i++) {
			if (value1 == arr[i] && i < arr.length) {
				for (j = 0; j < arr.length; j++) {
					if (value2 == arr[j]) {
						flag = true;
						break;
					}
				}
				break;
			}
		}
		if (flag) {
			temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			for(int e: arr) {
				System.out.println(e);
			}
		}else {
			System.out.println("The values you entered are not availabe in the array.");
		}
	}

	public static void main(String[] args) {
		SwapTwoValuesInArray obj = new SwapTwoValuesInArray();
		obj.swapTwoNumber(7, 8);

	}

}
