package one.digitalinovationparking.service;

import one.digitalinovationparking.model.Parking;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ParkingService {

    private static Map<String, Parking> parkingMap = new HashMap();

    static {
        var id:String = getUUID();
        Parking parking = new Parking(id, "DMS-1111", "SC", "CELTA", "PRETO");
        parkingMap.put(id.parking);
    }
        private static String getUUID() {
            return UUID.randomUUID().toString().replace("-", " ");

        }

        }
