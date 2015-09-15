package org.ojug.intelliclipse;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MainTest {
	private Main testable;

	@Before
	public void setUp() throws Exception {
		this.testable = new Main();
	}

	@Test
	public void shouldReturnHello() throws Exception {
		assertEquals("Hello", this.testable.run());
	}
}
