package damageCar;

/**
 * Created by ARMID060817M on 8/6/2017.
 */
public class DingsAndDentsDamage implements Damage{
    int damagePercentage;

    public DingsAndDentsDamage(int damagePercentage){
        this.damagePercentage = damagePercentage;
    }
    @Override
    public String howToFix() {
        return null;
    }

    @Override
    public int damagePercent() {
        return damagePercentage;
    }
}