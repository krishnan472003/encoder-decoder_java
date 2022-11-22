class treeNode {
    char data;
    treeNode left;
    treeNode right;
    int index;
    treeNode(char data, int index) {
        this.data = data;
        this.index=index;
    }
    treeNode (){

    }
}
class treeDecode{
	public String start(String decode) {
		treeDecode obj = new treeDecode();
		String[] arr = decode.split("\\*");
		treeNode root = new treeNode();
		String result = "";
		int counter = 0;
		for(int i = 1; i < arr.length;i+=2) {
			if(counter == Integer.parseInt(arr[i])) {
				result+=arr[i-1];
				i = 1;
				counter++;
			}
		}
		return(result);
	}

//	 public void search(treeNode root, int key) {
//	        treeNode p = root;
//	        boolean flag= false;
//	        if (p != null) {
//	            if (key == p.index) {
//	                flag=true;
//	                result += p.data;
//	            } else if (flag == false && p.left!=null) {
//	                p = p.left;
//	                search(p, key);
//	            } else if (flag == false && p.right!=null) {
//	                p = p.right;
//	                search(p, key);
//	            }
//	        }
//	    }
	
	    
		public treeNode insert(treeNode root, char data, int index){
	        if (root == null){
	            root= new treeNode(data, index);
	            return root;
	        }
	        if (index < root.index){
	            root.left = insert(root.left, data, index);
	        }
	        else if (index>= root.index){
	            root.right =insert(root.right, data, index);
	        }
	        return root;
	
	}
	public char search(treeNode root,int index){
		if(root == null) {
			return 0;
		}
		char result='\0';
		if(root.index == index ) {
		return root.data;
		}
		else if(root.left!=null){
			result =search(root.left, index);
			return result;
		}
		else if(root.right != null) {
			result = search(root.right,index);
			return result;
		}
		return result;
		
	}
}
class Treefunctions{
    String result="";
    public void tocheck(String s){
        treeNode root = null;
        for (int i = 0; i < s.length(); i++){
            root = insert(root,s.charAt(i),i);
        }
        
        String k = preorder(root);
    }
    public treeNode insert(treeNode root, char data, int index){
        if (root == null){
            root= new treeNode(data, index);
            return root;
        }
        if (data < root.data){
            root.left = insert(root.left, data, index);
        }
        else if (data>= root.data){
            root.right =insert(root.right, data, index);
        }
        return root;
    }

    public String preorder(treeNode root) {
        if (root == null) {
            return result;
        }
        result+=root.data+"*"+root.index+"*";
        preorder(root.left);
        preorder(root.right);

        return result;
    }
}



class bst{
    
}


