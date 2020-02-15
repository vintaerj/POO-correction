package tp03;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;


public class PendingCaseQueueTest {

	public PendingCaseQueue folderQueue;
	public PendingCase folder1;
	public PendingCase folder2;
	public PendingCase folder3;
	public PendingCase folder4;
	public PendingCase folder5;
	
	
	@Before
	public void setUp() {
		this.folderQueue = new PendingCaseQueue(5);
		this.folder1 = new PendingCase("Matrix1","Reload",10);
		this.folder2 = new PendingCase("Matrix2","Reload",10);
		this.folder3 = new PendingCase("Matrix3","Reload",10);
		this.folder4 = new PendingCase("Matrix4","Reload",10);
		this.folder5 = new PendingCase("Matrix5","Reload",10);
	}
	
	
	@Test
	public void clearWithEmptyQueue() {
		this.folderQueue.clear();
		assertEquals(this.folderQueue.getHead(),this.folderQueue.getTail());
	}
	
	@Test
	public void clearWithNoEmptyQueue() {
		this.folderQueue.addOne(folder1);
		this.folderQueue.clear();
		assertEquals(this.folderQueue.getHead(),this.folderQueue.getTail());
	}
	
	@Test
	public void addOneWithEmptyQueue() {
		Boolean res = this.folderQueue.addOne(folder1);
		assertTrue(res);
		assertEquals(this.folderQueue.getSize(),1);	
	}
	
	@Test
	public void addOneWithFullQueue() {
		
		this.folderQueue.addOne(this.folder1);
		this.folderQueue.addOne(this.folder2);
		this.folderQueue.addOne(this.folder3);
		this.folderQueue.addOne(this.folder4);
		this.folderQueue.addOne(this.folder5);
		
		Boolean res = this.folderQueue.addOne(this.folder1);
		assertFalse(res);
		assertEquals(this.folderQueue.getSize(),5);	
	}
	
	@Test
	public void isEmptyWithEmptyQueueTest() {
		assertTrue(this.folderQueue.isEmpty());
	}
	
	@Test
	public void isEmptyWithNoEmptyQueueTest() {
		this.folderQueue.addOne(folder1);
		assertFalse(this.folderQueue.isEmpty());
	}
	
	@Test
	public void isFullWithFullQueueTest() {
		
		this.folderQueue.addOne(folder1);
		this.folderQueue.addOne(folder2);
		this.folderQueue.addOne(folder3);
		this.folderQueue.addOne(folder4);
		this.folderQueue.addOne(folder5);
		
		assertTrue(this.folderQueue.isFull());
		
	}
	
	@Test
	public void isFullWithNoFullQueueTest() {			
		assertFalse(this.folderQueue.isFull());	
	}
	
	@Test
	public void cheatingTest() {			
		this.folderQueue.addOne(this.folder1);
		this.folderQueue.addOne(this.folder2);	
		this.folderQueue.addOne(this.folder3);	

		Boolean res = this.folderQueue.cheating(0, this.folder5);	
		assertTrue(res);
		assertSame(this.folderQueue.getPendingCase(0),this.folder5);
		assertSame(this.folderQueue.getPendingCase(3),this.folder3);
	}
	
	@Test
	public void cheatingWithFullQueueTest() {	
		
		this.folderQueue.addOne(this.folder1);
		this.folderQueue.addOne(this.folder2);	
		this.folderQueue.addOne(this.folder3);	
		this.folderQueue.addOne(this.folder4);	
		this.folderQueue.addOne(this.folder5);	

		Boolean res = this.folderQueue.cheating(0, this.folder5);	
		assertFalse(res);
	}
	
	
	
	
	
	

}
