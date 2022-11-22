import java.util.Scanner;
class decodeOperations{
	public String stackQueueDecode(String s) {
		Stack stack = new Stack();
		Queue queue = new Queue();
		for(int i = 0;i < s.length()/2;i++) {
			queue.enqueue(s.charAt(i));
		}
		for(int i = s.length()/2;i<s.length();i++) {
			stack.stackPush(s.charAt(i));
		}
		String res = "";
		for(int i = 0;i < s.length();i++) {
			if(i%2==0) {
				res+=stack.stackPop();
			}
			else {
				res+=queue.dequeue();
			}
		}
		return(res);
	}
	
	public String decode(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String you want to decode:");
		String s = sc.nextLine();
		String[] arr = s.split("\\*\\*");
		treeDecode treeDecode = new treeDecode();
		String res = treeDecode.start(arr[0]);
		decodeOperations decodeOperation = new decodeOperations();
		res = decodeOperation.stackQueueDecode(res);
		String[] spaceInfo = arr[1].split("\\*");
		int[] sInfo = new int[spaceInfo.length];
		for(int i = 0; i < spaceInfo.length;i++) {
			sInfo[i] = Integer.parseInt(spaceInfo[i]);
		}
		for(int i = 0; i < sInfo.length;i++) {
			res = res.substring(0,sInfo[i])+" "+res.substring(sInfo[i],res.length());
		}
		return(res);
	}
}
public class decode {
	public static void main(String[] args) {
		decodeOperations decode = new decodeOperations();
		System.out.println(decode.decode());
	}
	
}
