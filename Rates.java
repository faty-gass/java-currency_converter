public class Rates {
    static double eurToUsd = 1.18359 ;
    static double eurToGbp = 0.893578 ;
    static double usdToEur = 0.844489 ;
    static double usdToGbp = 0.754893;
    static double gbpToEur = 1.1191 ;
    static double gbpToUsd = 1.32469;

    static public double getEurToUsd(){
        return eurToUsd;
    }
    static public double getEurToGbp(){
        return eurToGbp ;
    }
    static public double getUsdToEur(){
        return usdToEur ;
    }
    static public double getUsdToGbp(){
        return usdToGbp ;
    }
    static public double getGbpToEur(){
        return gbpToEur ;
    }
    static public double getGbpToUsd(){
        return gbpToUsd ;
    }

    public void setEurToUsd(double rate){
        eurToUsd = rate ;
    }
    public void setEurToGbp(double rate){
        eurToGbp = rate ;
    }
    public void setUsdToEur(double rate){
        usdToEur = rate ;
    }
    public void setUsdToGbp(double rate){
        usdToGbp = rate ;
    }
    public void setGbpToEur(double rate){
        gbpToEur = rate ;
    }
    public void setGbpToUsd(double rate){
        gbpToUsd = rate ;
    }
    
    static public double changeEurToUsd (double num){
        return num * eurToUsd ;
    }
    static public double changeEurToGbp (double num){
        return num * eurToGbp ;
    }
    static public double changeUsdToEur (double num){
        return num * usdToEur ;
    }
    static public double changeUsdToGbp (double num){
        return num * usdToGbp ;
    }
    static public double changeGbpToEur (double num){
        return num * gbpToEur ;
    }
    static public double changeGbpToUsd (double num){
        return num * gbpToUsd ;
    }

}
