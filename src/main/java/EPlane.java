package main.java;

public enum EPlane {
    BOEING747 (20000, 40),
    A310 (15000, 30),
    CHAICOVSKY (25000, 90),
    LOW_WEIGHT_CAPACITY_PLANE(50, 20);

    private final int TOTAL_WEIGHT_CAPACITY;
    private final int CAPACITY;

    EPlane(int TOTAL_WEIGHT_CAPACITY, int CAPACITY) {
        this.TOTAL_WEIGHT_CAPACITY = TOTAL_WEIGHT_CAPACITY;
        this.CAPACITY = CAPACITY;
    }

    public int getCAPACITY() {
        return CAPACITY;
    }

    public int getTOTAL_WEIGHT_CAPACITY() {
        return TOTAL_WEIGHT_CAPACITY;
    }
}
