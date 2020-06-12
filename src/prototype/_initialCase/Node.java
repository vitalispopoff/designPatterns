package prototype._initialCase;

public class Node {

	Node
			prev = null,
			next = null;
	double value;
	String operationType;

	void join(Node host){
		setPrev(host);
		setNext(host.getNext());
		getPrev().setNext(this);
		getNext().setPrev(this);
	}

	void leave(){
		getPrev().setNext(getNext());
		getNext().setPrev(getPrev());
	}

//	@formatter:off

	boolean isEmpty(){ return prev==null & next == null; }

	void operate(){ System.out.println(operationType.concat(Double.toString(value))); }

	void setPrev(Node prev) { this.prev = prev; }
	void setNext(Node next) { this.next = next; }
	void setValue(double value) { this.value = value; }
	void setOperationType(String operationType) { this.operationType = operationType; }

	Node getPrev() { return prev; }
	Node getNext() { return next; }
	double getValue() { return value; }
	String getOperationType() { return operationType; }

//	@formatter:on
}