import java.util.Scanner;
class Operations{
	String spaceInfo;
	public String spaceInfo(String s){
		Queue q = new Queue();
		for(int i = 0;i < s.length();i++) {
			if(s.charAt(i) == ' ') {
				q.enqueue(i);
			}
		}
		String res = "";
		while(!q.QueueIsEmpty()) {
			res += "*";
			res += q.dequeue(0);
		}
		return(res);
	}
	
	public String stackQueue(String s){
		Stack stack = new Stack();
		Queue queue = new Queue();
		for(int i = 0;i < s.length();i++) {
			if(i%2==0) {
				stack.stackPush(s.charAt(i));
			}
			else {
				queue.enqueue(s.charAt(i));
			}
		}
			String res = "";
			for(int i = 0; i < s.length()/2;i++) {
				res += queue.dequeue();
			}
			for(int i = s.length()/2; i < s.length();i++) {
				res+= stack.stackPop();
			}
			return(res);
	}
	public String encode() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to encode");
		String s = sc.nextLine();
		Operations a = new Operations();
		spaceInfo =a.spaceInfo(s);
		s =s.replaceAll(" ", "");
		s = a.stackQueue(s);
		
		return(s);
	}
	
}
public class encode{
	public static void main(String[] args) {
		Operations encode = new Operations();
		String s = encode.encode();
		Treefunctions t = new Treefunctions();
		t.tocheck(s);
		s = t.result + encode.spaceInfo;
		System.out.println(s);
	}
}