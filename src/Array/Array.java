package Array;

public class Array {
	int[] arr = null;

	public static void main(String[] args) {
		Array array = new Array(3);
		array.insert(0, 1);
		array.insert(1, 2);
		array.insert(1,2);
		array.insert(12, 120);
		
//		int ar = array.arr[0];
//		int ar1 = array.arr[9];
//		System.out.println(ar+" "+ar1);
		
		array.traverseArray();
		
		array.search(2);
	}

	public Array(int size) {
		arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}


// insert method
	public void insert(int index, int values) {
		try {
			if (arr[index] == Integer.MIN_VALUE) {
				arr[index] = values;
				System.out.println("Successfully Inserted");
			} else {
				System.out.println("Index already occupied");
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The index is not found and exceeded the size of array");
		}
	}

// array travesal method
	public void traverseArray() {
		try {
			
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+ " ");
			}
		}catch(Exception e) {
			System.out.println("Array no longer present");
		}
		System.out.println();
	}
	
// search method
	
	void search(int target) {
			for(int i =0;i<arr.length;i++) {
				if(arr[i]==target) {
					System.out.println("Element is found at index "+i);
					return;
				}
		}
			System.out.println("Elemnet not found ");
	}
}
