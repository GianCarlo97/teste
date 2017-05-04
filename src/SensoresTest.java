import static org.junit.Assert.*;

import org.junit.Test;

public class SensoresTest {

	@Test
	public void testSetAlertaTrue(){
		SensoresH sensor = new SensoresH();
		sensor.setAlerta(1, true);
		assertEquals(true, sensor.isAlerta(1));
	}
	
	@Test//(expected= IndexOutOfBoundsException.class)
	public void testSetAlertaErro(){
		SensoresH sensor = new SensoresH();
		sensor.setAlerta(5, true);
	}
	
	@Test
	public void testResetMethod() {
		SensoresH sensor = new SensoresH();
		sensor.setAlerta(1, true);
		sensor.reset();
		assertEquals(true, sensor.isStatusOk());
	}
	
	@Test
	public void testIsAlertaTrue() {
		SensoresH sensor = new SensoresH();
		sensor.setAlerta(1, true);
		assertEquals(true, sensor.isAlerta(1));	
	}
}
