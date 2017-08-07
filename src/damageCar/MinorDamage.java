package damageCar;

/**
 * Created by ARMID060817M on 8/6/2017.
 */
public class MinorDamage implements Damage{

    int damagePercentage;

    public MinorDamage(int damagePercentage){
        this.damagePercentage = damagePercentage;
    }

    @Override
    public String howToFix() {
        return "fix your minor damage\n";
    }

    @Override
    public int damagePercent() {
        return this.damagePercentage;
    }
}
