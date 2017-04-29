package Stack;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Node.Node;

public class StackTest {
	private Stack stack;
	@Before
	public void setUp() throws Exception {
		stack = new Stack();
	}

	@Test
	public void testAdd() {
		int expect = 1;
		Node N = new Node(expect);
		stack.add(N);
		assertEquals(expect, stack.peek());
	}

}
