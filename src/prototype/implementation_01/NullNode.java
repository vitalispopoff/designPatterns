package prototype.implementation_01;

public class NullNode extends Node {

//	@formatter:off

	@Override void join(Node host){ }
	@Override void leave(){ }
	@Override void operate(){}
	@Override void setValue(double value){ }
	@Override void setOperationType(String operationType){ }

	@Override boolean isEmpty(){return false;}
	@Override void setPrev(Node prev){ }
	@Override void setNext(Node next){ }

	@Override NullNode getPrev(){ return this; }
	@Override NullNode getNext(){ return this; }
	@Override double getValue(){ return Double.NaN; }
	@Override String getOperationType(){ return ""; }

//	@formatter:on
}