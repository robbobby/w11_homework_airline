package test.java;

import main.java.EPlane;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EPlaneTest {
    @Test public void hasACapacity() {
        assertEquals(40, EPlane.BOEING747.getCAPACITY());
    }
    @Test public void hasWeightCapacity() {
        assertEquals(250, EPlane.CHAICOVSKY.getTOTAL_WEIGHT_CAPACITY());
    }
}
