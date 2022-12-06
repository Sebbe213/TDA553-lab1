public class RepairShop {
    private int repairShopMaxCapacity;

    private double repairShopXCoordination;

    private double repairShopYCoordination;

    private String repairShopName;

    private SuperTool superTool;

    public RepairShop(int repairShopMaxCapacity, double repairShopXCoordination, double repairShopYCoordination, String repairShopName) {
        this.repairShopMaxCapacity = repairShopMaxCapacity;
        this.repairShopXCoordination = repairShopXCoordination;
        this.repairShopYCoordination = repairShopYCoordination;
        this.superTool = new SuperTool(repairShopXCoordination, repairShopYCoordination, repairShopMaxCapacity);
    }

    public int getNumberOfLoadedCars() {
        return superTool.getNumberOfLoadedCars();
    }

    protected void parkIn(Car car) {
        try {
            superTool.loadOn(car);
        } catch (Exception e) {
            System.out.println("Either the car is too far away from the repair shop or the repair shop is at capacity.");
        }
    }

    protected void parkOut(Car car) {
        try {
            superTool.loadOff();
        } catch (Exception e) {
            System.out.println("There are no cars in the repair shop.");
        }
    }
    public double getRepairShopXCoordination() {
        return repairShopXCoordination;
    }

    public void setRepairShopXCoordination(double x) {
        this.repairShopXCoordination = x;
    }

    public double getRepairShopYCoordination() {
        return repairShopYCoordination;
    }

    public void setRepairShopYCoordination(double y) {
        this.repairShopYCoordination = y;
    }

}
