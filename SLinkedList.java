public class SLinkedList implements List{

    // private attributes
    private Node _head, _tail; // _head refers to first node, _tail the last
    private int _size;  // # of elements in the list


    // Constructors
    public SLinkedList(){
	_head = _tail = null;
	_size = 0;
    }
    


    // ************  Accessors Methods *************************
    /* satisfies  List interface requirements */
    public String get(int index){
	if (index < 0 || index >= size())
	    throw new IndexOutOfBoundsException("index < 0 || index > size");
	Node curr = _head;
	while (index-- > 0) curr = curr.getNext();
	return curr.getValue();
    }

    public int size(){
	return _size;
    }
    
    // ************* Modifier Methods **************************
    /* required by the List interface. */
    // O(1) runtime
    public boolean add(String value){
	Node newLast = new Node(value, null);
	if (size() == 0) _head = _tail = newLast;
	else{
	    _tail.setNext(newLast);
	    _tail = newLast;
	}
	_size++;
	return true;
    }


    //postcondition: inserts value at index
    public void add(int index, String value){
	if (index < 0 || index > size())
	    throw new IndexOutOfBoundsException("index < 0 || index > size");
	// head and tail involved or just the tail
	if (index == size()){
	    add(value);
	    return;
	}
	// head only involved 
	else if (index == 0)    _head = new Node(value,_head);
	// neither head nor tail involved
	else{
	    Node curr = _head;
	    while (--index > 0) curr = curr.getNext();
	    curr.setNext(new Node(value, curr.getNext()));
	}
	_size++;
    }
    
    public String set(int index, String value){

	Node curr = _head;
	while(index-- > 0) curr = curr.getNext();
	return curr.setValue(value);
    }


    public String remove(int index){
	if (index < 0 || index >= size())
	    throw new IndexOutOfBoundsException("index < 0 || index > size");
	String ans;
	// both head and tail involved
	if (size() == 1){
	    ans = _head.getValue();
	    _head = _tail = null;
	}
	// just head  involved
	else if (index == 0){
	    ans = _head.getValue();
	    _head = _head.getNext();
	}
	//  tail may be involved
	else {
	    boolean tailInvolved = index == size() - 1;
	    Node curr = _head;
	    while(--index > 0) curr = curr.getNext();
	    ans = curr.getNext().getValue();
	    curr.setNext(curr.getNext().getNext());
	    // tail involved
	    if (tailInvolved) _tail = curr;
	    
	}
	_size--;
	return ans;
    }

    public SLinkedList append(SLinkedList L){
	SLinkedList ans = new SLinkedList();
	Node t=this._head;
	for(int i=0; i<2; i++){
	    while(t!=null){
		ans.add(t.getValue());
		t=t.getNext();
	    }
	    t=L._head;
	}
	return ans;
    }

    public Node getNode(int index){
	if (index < 0 || index >= size())
	    throw new IndexOutOfBoundsException("index < 0 || index > size");
	Node curr = _head;
	while (index-- > 0) curr = curr.getNext();
	return curr;
    }

    public void swap(Node x, Node y){
	Node prevX = new Node(null,_head);
	Node curr=prevX;
	Node temp=x;
	int nextNode;
	while(curr.getNext()!=x&&curr.getNext()!=y){curr=curr.getNext();}
	if(curr.getNext()==x){
	    nextNode=y.setNext(curr.getNext().getNext());
	    curr.setNext(y);
	    
	}
    }
    
    // override
    public String toString(){
	String ans = "";
	Node t = _head;
	while (t != null){
	    ans += t.getValue() + ", ";
	    t = t.getNext();
	}
	// remove trailing comma
	if (ans.length() > 0) ans = ans.substring(0, ans.length() - 2);
	ans = "[" + ans + "]";
	return ans;
    }
    


    
}
