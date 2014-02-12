/**
 * @author Kshitij Grover  
 */
class FizzBuzz {
	public static void main(String[] args) {
		//use a static method as it's not attached to an Object
		executeFizzBuzz(100);
	}
	
	public static void executeFizzBuzz(int n){
		/*
		 * Loop from one to the parameter, which 
		 * is the desired max.
		 */
		for(int i = 1; i < n; i++){
			String result = "";
			// print "FizzBuzz" if divisible by 5 and 3
			if(i % 15 == 0) {
				 result = "FizzBuzz";
			}
			//else if only by 3, "Fizz" is printed
			else if(i % 3 == 0) {
				result = "Fizz";
			}
			//else if only by 5, "Buzz" is printed
			else if(i % 5 == 0) {
				result = "Buzz";
			}
			//otherwise, print the number itself
			else{
				result = "" + i;
			}
			System.out.println(result);
		}
	}
}