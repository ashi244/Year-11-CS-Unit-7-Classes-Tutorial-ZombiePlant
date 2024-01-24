public class ZombiePlant {
    private int maxPotency;
    private int treatments;
    public ZombiePlant(int maxPotency, int treatments){
        this.maxPotency = maxPotency;
        this.treatments = treatments;
    }
    public int getPotency(){
        return maxPotency;
    }
    public int treatmentsNeeded(){
        return treatments;
    }
    public boolean isDangerous(){
        if (treatments >= 1){
            return true;
        }
        return false;
    }
    public void treat(int treatmentNum){
        if ((treatmentNum <= maxPotency) && (treatmentNum > 0)){
            if (treatments > 0){
                treatments -= 1;
            }
        }
        else if (treatmentNum > maxPotency){
            treatments += 1;
        }
    }
}
