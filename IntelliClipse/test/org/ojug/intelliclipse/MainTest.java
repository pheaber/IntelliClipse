package org.ojug.intelliclipse;

import static org.junit.Assert.assertEquals;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MainConfig.class)
public class MainTest {

	@Inject
	private Main testable;

	@Test
	public void shouldReturnHello() throws Exception {
		assertEquals("Hello", this.testable.run());
	}
}
