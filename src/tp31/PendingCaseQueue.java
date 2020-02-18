package tp31;

import java.util.Arrays;

import tp03.PendingCase;


public class PendingCaseQueue {

	private PendingCase[] myQueue;
	private int capaciteMax;
	private int head;
	private int tail;
	private int size;
	
	
	public PendingCaseQueue(int capaciteMax) {
		super();
		this.myQueue = new PendingCase[capaciteMax];
		this.capaciteMax = capaciteMax;
	}
	

	public void clear() {
		this.head = 0;
		this.tail = 0;
	}

	public PendingCase getPendingCase(int pos) {
		return this.myQueue[this.head+pos%this.capaciteMax];
	}
	
	public Boolean isFull() {
		return this.size == this.capaciteMax;
	}
	
	public Boolean isEmpty() {
		return this.head == this.tail;
	}
	
	public Boolean addOne(PendingCase p) {
		
		if(this.isFull())
			return false;
		
		this.myQueue[this.tail] = p;
		this.tail = nextIndex();
		this.size += 1;
		
		return true;
	}
	
	public PendingCase removeOne() {
		if(this.isEmpty())
			return null;
		
		return this.getPendingCase(0);
	}
	
	public Double getTotalAmount() {
		double ta = 0.0;
		for(PendingCase p : this.myQueue) {
			ta += p.getAmount();
		}
		return ta;		
	}
	
	public Boolean cheating(int pos,PendingCase p) {
		
		if(this.isFull() || pos < 0 || pos >= this.capaciteMax)
			return false;
		
		PendingCase tmp = p;
	 	
		for(int i = 0 ; i < this.size ; i++) {
			int currentPosition = this.head+pos+i%this.capaciteMax;		
			PendingCase currentTmp = this.getPendingCase(currentPosition);
							
			this.myQueue[currentPosition] = tmp;	
			tmp = currentTmp;
			
		}
		
		this.myQueue[this.tail] = tmp;
		this.tail = nextIndex();
		
		
		return true;
	}

	private int nextIndex() {
		return (this.tail+1)%this.capaciteMax;
	}

	
	public int getCapaciteMax() {
		return capaciteMax;
	}
	


	public int getHead() {
		return head;
	}


	public int getTail() {
		return tail;
	}


	public int getSize() {
		return size;
	}


	@Override
	public String toString() {
		return "PendingCaseQueue [myQueue=" + Arrays.toString(myQueue) + "]";
	}

	
	
	
	
	
	
}
