package com.act.airlinereservation.services;

        import com.act.airlinereservation.domains.Passenger;
        import com.act.airlinereservation.repositories.PassengerRepository;
        import com.act.airlinereservation.utils.DateCalc;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import java.time.LocalDate;

@Service
public class PassengerService {

    // creates 2 instances/object
    //    Person a = new Person("Biniam");
    //    Person b = new Person("Abebe");

    /**
     * https://en.wikipedia.org/wiki/Singleton_pattern
     * In software engineering, the singleton pattern is a software design pattern that restricts the instantiation
     * of a class to one "single" instance.
     * This is useful when exactly one object is needed to coordinate actions across the system.
     */
    // only 1 object/instance is created and it is shared => Singleton pattern

    @Autowired
    private PassengerRepository passengerRepository;

    public Passenger createPassenger(Passenger passenger) {

        // validation
        int age = DateCalc.calculateAge(passenger.getDateOfBirth(), LocalDate.now());

        if (age > 15) {
            return passengerRepository.save(passenger);
        } else {
            System.out.println("Sorry. User under the age of 15 years cannot register.");
            return null;
        }
    }

    public Iterable<Passenger> allPassenger() {
        return passengerRepository.findAll();
    }
}