import static org.junit.Assert.*;

import org.junit.Test;

public class SensoresTest {

	@Test
	public void testSetAlertaTrue(){
		SensoresH sensor = new SensoresH();
		sensor.setH(1, true);
		assertEquals(true, sensor.isH(1));
	}
	
	@Test//(expected= IndexOutOfBoundsException.class)
	public void testSetAlertaErro(){
		SensoresH sensor = new SensoresH();
		sensor.setH(5, true);
		assertEquals(0, sensor.isAlerta(4));	
	}
	
	@Test
	public void testIsAlertaTrue() {
		SensoresH sensor = new SensoresH();
		sensor.setH(1, true);
		sensor.setRad(1, 6);
		sensor.setTemp(1, 41);;
		assertEquals(2, sensor.isAlerta(1));	
	}
	
	@Test (expected= IndexOutOfBoundsException.class)
	public void testSetHException() {
		SensoresH sensor = new SensoresH();
		sensor.setH(10, true);
		sensor.setRad(10, 6);
		sensor.setTemp(10, 41);;
		assertEquals(2, sensor.isAlerta(10));	
	}
	
	@Test (expected= IndexOutOfBoundsException.class)
	public void testSetRadException() {
		SensoresH sensor = new SensoresH();
		sensor.setH(1, true);
		sensor.setRad(10, 6);
		sensor.setTemp(1, 41);;
		assertEquals(2, sensor.isAlerta(1));	
	}
	
	@Test (expected= IndexOutOfBoundsException.class)
	public void testSetTempException() {
		SensoresH sensor = new SensoresH();
		sensor.setH(1, true);
		sensor.setRad(1, 6);
		sensor.setTemp(10, 41);
		assertEquals(2, sensor.isAlerta(1));	
	}
	
	@Test (expected= IndexOutOfBoundsException.class)
	public void testIsAlertaException() {
		SensoresH sensor = new SensoresH();
		sensor.setH(1, true);
		sensor.setRad(1, 6);
		assertEquals(2, sensor.isAlerta(11));	
	}
	
	@Test (expected= IndexOutOfBoundsException.class)
	public void testIsHException() {
		SensoresH sensor = new SensoresH();
		sensor.setH(1, true);
		sensor.setRad(1, 6);
		assertEquals(false, sensor.isH(11));	
	}
	
	@Test 
	public void testCorVerde() {
		SensoresH sensor = new SensoresH();
		sensor.setH(1, true);
		sensor.setRad(1, 0);
		sensor.setTemp(1, 0);
		assertEquals(0, sensor.isAlerta(1));	
	}
	
}
	
