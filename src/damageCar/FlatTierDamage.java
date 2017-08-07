package damageCar;

/**
 * Created by ARMID060817M on 8/6/2017.
 */
public class FlatTierDamage implements Damage{

    int damagePercentage;

    public FlatTierDamage(int damagePercentage){
        this.damagePercentage = damagePercentage;
    }

    @Override
    public String howToFix() {
        return "change you galgal\n";
    }

    @Override
    public int damagePercent() {
        return this.damagePercentage;
    }
}
