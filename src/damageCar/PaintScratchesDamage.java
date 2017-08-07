package damageCar;

/**
 * Created by ARMID060817M on 8/6/2017.
 */
public class PaintScratchesDamage implements Damage {
    int damagePercentage;

    public PaintScratchesDamage(int damagePercentage){
        this.damagePercentage = damagePercentage;
    }

    @Override
    public String howToFix() {
        return "paint your car again\n";
    }

    @Override
    public int damagePercent() {
        return this.damagePercentage;
    }
}
