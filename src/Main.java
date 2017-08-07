import carTypes.Car;
import damageCar.*;

/**
 * Created by ARMID060817M on 8/6/2017.
 */
public class Main {
    public static void main
            (String[] args) {

        Damage[] damages = new Damage[3];
        damages[0] = new PaintScratchesDamage(23);
        damages[1] = new FlatTierDamage(32);
        damages[2] = new CollisionDamage(60);
        Car skoda = new Car("shaked", "skoda",
                "almog",12121,damages);
        System.out.print(skoda.calcDamagePercentage()+"%\n");
        skoda.getFixToString();

    }
}
