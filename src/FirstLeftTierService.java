public class FirstLeftTierService {

    public double calculate1FirstLeftTier(double gradL, double minuteL, double secondL, double gradR, double minuteR,
                             double secondR, double S, double D) {

        ZeroLeftTierService serviceZLT = new ZeroLeftTierService();
        double zeroLeftTier = serviceZLT.calculateZeroLeftTier(double gradZL, double minuteZL, double secondZL, double gradZR, double minuteZR, double secondZR);

        double results;

        double minL = minuteL / 60;
        double secL = secondL / 3600;
        double alfaL = gradL + minL + secL;

        double minR = minuteR / 60;
        double secR = secondR / 3600;
        double alfaR = gradR + minR + secR;

        double alfa = (alfaR + alfaL) / 2;
        double beta = alfaR - alfa;

        double betaRad = Math.toRadians(beta);
        double radius = Math.tan(betaRad) * S;

        double distance = D + radius;

        double alfaRad = Math.toRadians(alfa - zeroLeftTier);
        double deviation = Math.sin(alfaRad) * distance;

        results = deviation;

        return results;
    }
}
