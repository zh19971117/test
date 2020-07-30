package javaSE;

public class demo01 {
	public static void main(String[] args) {
		public static void main (String[] args){
	        int [] arrayA = new int[]{10,20,30,40,50};
	        printArray(arrayA);
	    }
	    public static void printArray (int [] arrayA){
	       for (int min = 0, max = arrayA.length;min <= max; min++,max--){
	           int s = arrayA[min];
	           arrayA[min] = arrayA[max];
	           arrayA[max] = s;
	           System.out.println(arrayA[min]);

	        }
	    }
		
	}

}
