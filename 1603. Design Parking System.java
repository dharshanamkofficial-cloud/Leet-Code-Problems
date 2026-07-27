class ParkingSystem {

    int[] slots = new int[4];

    public ParkingSystem(int big, int medium, int small) {
        slots[1] = big;
        slots[2] = medium;
        slots[3] = small;
    }

    public boolean addCar(int carType) {
        return slots[carType]-- > 0;
    }
}
