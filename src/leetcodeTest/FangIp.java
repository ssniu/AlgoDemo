package leetcodeTest;

public class FangIp {

	public static void main(String[] args) {

		String str = "12.143.23.151"; 
        String[] arr = str.split("\\."); 
        String result="";
	    for(int i = 0; i <arr.length; i++){
	        if(arr[i]!="."){
	            result += arr[i];  
	            
	        }else {
	            result += "[.]";
//	            System.out.print("else "+result);
	        }
	    }
        System.out.print(result+"");
	    // throws IllegalArgumentException("illegal argument");
	}
}


