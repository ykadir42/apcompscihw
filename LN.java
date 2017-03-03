import java.util.ArrayList;

public class LN{


   
    //**************** Recursive Versions ********************
    public static int length(Node n){
	if (n == null) return 0;
	return 1 + length(n.getNext());
    }

    public static void print(Node n){
	if (n != null) {
	    System.out.print(n.getValue() + " ");
	    print(n.getNext());
	}
    }

    public static void printReverse(Node n){
	if (n == null) return;
	prHelper(n.getNext());
	System.out.print(n.getValue() +  " ");
    }

    // ******************* Iterative Versions ******************
    public static int lengthIter(Node n){
	int ans = 0;
	while (n != null){
	    ans++;
	    n = n.getNext();
	}
	return ans;
    }
   
    public static void printIter(Node n){
	while (n != null){
	    System.out.print(n.getValue() + " ");
	    n = n.getNext();
	}
    }

    public static void printRevIter(Node n){
	ArrayList<String> s = new ArrayList<String>();
	while (n != null){
	    s.add(n.getValue());
	    n = n.getNext();
	}
	for (int i = s.size() - 1;  i >= 0 ; i--){
	    System.out.print(s.get(i) + " ");
	}
	System.out.println();
    }


    // *****  Adding elements to a list *****************
    // These functions return the first node of the new list.

    // postcondition: adds a new Node to the front of the list
    //                represented by h. The first node of the
    //                list is returned.
     public static Node addFirst(Node h, String s){
	return new Node(s,h);
    }


    // ************ Question 1 ***********************************
    //           RECURSIVE VERSION
    // postcondition: adds a new Node with value s as the last node
    //                of the list starting at h.
    //                Returns the first node of the new list.
    public static Node addLast(Node h,String s){
	if(h==null) return addFirst(h, s);
	if(h.getNext()==null){
		h.setNext(new Node (s, null)); 
		return h.getNext();
	}
	else return addLast(h.getNext(), s);
	
    }

    // *********** Question 2 ***********************************
    //              ITERATIVE VERSION
    public static Node addLastIter(Node h, String s){
	if(h==null) return addFirst(h,s);
	while(h.getNext()!=null){
		h=h.getNext();
	}
	h.setNext(new Node(s,null));
	return h.getNext();
    }


    // ************ Question 3 and 4 **********************************
    //   Write both a recursive and iterative version of the found function.
    // postcondition: returns the first node that contains the string s.
    //                returns null if the list doesn't contain s.
    public static Node search(Node h, String s){
    	if(h==null) return null;
    	if(h.getValue().equals(s)) return h;
    	return search(h.getNext(), s);
    }
    
    public static Node searchIter(Node h, String s){
    	while(h!=null){
    		if(h.getValue().equals(s)) return h;
    		h=h.getNext();
    	}
    	return null;
    }
    
    public static void main(String [] args){
	Node head = null;       // head -> null
	head = addFirst(head,"b");  // head -> b -> null
	
	print(head);
	//printReverse(head);
	System.out.println("len: : " + length(head));	
	
	head = addFirst(head,"a"); // head -> a -> b -> null

	print(head);
	//printReverse(head);
	System.out.println("len: : " + length(head));

	head  = addLast(head,"c");
	head = addLast(head,"d");
	head = addLastIter(head,"e");
	print (head);
	//printReverse(head);
	System.out.println("len: : " + length(head));


	System.out.println(search(head,"a"));
	System.out.println(search(head,"b"));
	System.out.println(search(head,"c"));
	System.out.println(search(head,"z"));

    }
    
}
