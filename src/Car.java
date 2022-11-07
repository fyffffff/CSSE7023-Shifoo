
import java.util.Objects;

enum TransmissionType {
    MANUAL,
    AUTOMATIC
}

public class Car {
    private String registration;
    private String model;
    private int odometer;
    private TransmissionType transmission;

    /**
     * Initialises a car.
     * @param registration the car's registration. i.e. number plate
     * @param model the car's model
     * @param odometer the car's current odometer reading
     * @param transmission the car's transmission type
     * */
    public Car(String registration, String model, int odometer,
               TransmissionType transmission) {
        this.registration = registration;
        this.model = model;
        this.odometer = odometer;
        this.transmission = transmission;
    }

    /**
     * Returns true IF AND ONLY IF this car is equal to the other given car.
     * For two cars to be equal, they must:
     * have the same registration string
     * have the same model string
     * have the same odometer reading
     * have the same transmission type
     * @param obj other object to compare equality
     * @return true if equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        // add code here
        if (obj instanceof Car) {
            if (this.registration.equals(((Car) obj).registration)
            && this.model.equals(((Car) obj).model)
            && this.odometer == ((Car) obj).odometer
            && this.transmission.equals(((Car) obj).transmission)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns the hash code of this car.
     * Two cars that are equal according to
     * Car.equals(Object) should have the same hash code.
     * @return hash code of this car
     */
    @Override
    public int hashCode() {
        // add code here
        return this.registration.hashCode() + this.model.hashCode()
                + this.odometer + this.transmission.hashCode();
    }


}
