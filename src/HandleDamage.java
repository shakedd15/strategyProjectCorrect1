import damageCar.Damage;

/**
 * Created by ARMID060817M on 8/6/2017.
 */
public class HandleDamage {

    public int executeStrategy(int carId, String ownerName, String handleName, String carType, Damage...damages){
        int damagePercent = 0;
        for (Damage currentDamage : damages) {
            damagePercent += currentDamage.damagePercent();
        }
        return damagePercent;
    }
}
