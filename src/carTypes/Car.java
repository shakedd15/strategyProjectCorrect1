package carTypes;

import damageCar.Damage;

import java.util.Scanner;

/**
 * Created by ARMID060817M on 8/6/2017.
 */
public class Car {
    private String carOwner, mechanicName, carMaker;
    private int carNumber;
    private Damage[] damages = new Damage[3];
    Scanner reader = new Scanner(System.in);

    public Car(String carOwner, String mechanicName, String carMaker, int carNumber, Damage[] damages) {
        this.carOwner = carOwner;
        this.mechanicName = mechanicName;
        this.carMaker = carMaker;
        this.carNumber = carNumber;
        this.damages = damages;
    }

    public String getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner;
    }

    public String getMechanicName() {
        return mechanicName;
    }

    public void setMechanicName(String mechanicName) {
        this.mechanicName = mechanicName;
    }

    public String getCarMaker() {
        return carMaker;
    }

    public void setCarMaker(String carMaker) {
        this.carMaker = carMaker;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }
    public void setNewFault(Damage damage){
        damages[0] = damage;
    }
    public int calcDamagePercentage(){
        int sumPercentage = 0;
        for(int i=0; i<damages.length; i++) {
            sumPercentage += damages[i].damagePercent();
        }
        return sumPercentage;
    }

    public void getFixToString(){
        for(int i=0; i<damages.length; i++) {
            System.out.print(damages[i].howToFix());
        }
    }

    public void askForProblem(){
        System.out.print("does your car have a problem?");
        String command = reader.next();
        if(command.equals("yes")){
            System.out.print("what is your problem?");
            String command2 = reader.next();
        }
    }

}
