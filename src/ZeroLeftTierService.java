class ZeroLeftTierService {

    public double calculateZeroLeftTier(double gradZL, double minuteZL, double secondZL, double gradZR, double minuteZR, double secondZR) {

        double zeroLeftTier;

        double minL = minuteZL / 60;
        double secL = secondZL / 3600;
        double alfaL = gradZL + minL + secL;

        double minR = minuteZR / 60;
        double secR = secondZR / 3600;
        double alfaR = gradZR + minR + secR;

        double alfa;
        alfa = (alfaR + alfaL) / 2;
        double beta = alfaR - alfa;

        zeroLeftTier = alfa;

        return zeroLeftTier;
    }
}
