public class Main {
    public static void main(String[] args) {

        ZeroLeftTierService serviceZLT = new ZeroLeftTierService();
        double zeroLeftTier = serviceZLT.calculateZeroLeftTier(0, 0, 0, 0, 37, 22);



        ZeroRightTierService serviceZRT = new ZeroRightTierService();
        double zeroRightTier = serviceZRT.calculateZeroRightTier(0, 0, 0, 0, 49, 14);



        FirstLeftTierService serviceFLT = new FirstLeftTierService();
        double firstLeftTier = serviceFLT.calculate1FirstLeftTier(0, 4, 40, 0, 42, 0,
                54.319,51.938);



        FirstRightTierService serviceFRT = new FirstRightTierService();
        double firstRightTier = serviceFRT.calculate1FirstRightTier(0, -32, -20, 0, 17, 22,
                41.868,38.8839);




        System.out.println();
        double sqrt = Math.sqrt((firstRightTier * firstRightTier) + (firstLeftTier * firstLeftTier));
        double vectorFT = (sqrt * 1000);
        System.out.println(Math.round(vectorFT));

    }
}