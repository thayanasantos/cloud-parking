package one.digitalinovationparking.controller;

import one.digitalinovationparking.model.Parking;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/parking")
public class ParkingController {

    @GetMapping
    public List<Parking> findAll(){


        var parking = new Parking(id, "DMS-1111", "SC", "CELTA", "PRETO");
        parking.setColor("Preto");
        parking.setLicense("MMS-111");
        parking.setModel("VW GOL");
        parking.setState("SP");
        return Arrays.asList(parking, parking);

    }


}
