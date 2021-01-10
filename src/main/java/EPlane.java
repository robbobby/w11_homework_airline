package main.java;

public enum EPlane {
    BOEING747 (200, 40),
    A310 (150, 30),
    CHAICOVSKY (250, 90);

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
