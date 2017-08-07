package damageCar;

/**
 * Created by ARMID060817M on 8/6/2017.
 */
public class CollisionDamage implements Damage{
    int damagePercentage;

    public CollisionDamage(int damagePercentage){
        this.damagePercentage = damagePercentage;
    }

    @Override
    public String howToFix() {
        return "change your air pillow!!\n";
    }

    @Override
    public int damagePercent() {
        return this.damagePercentage;
    }
}
