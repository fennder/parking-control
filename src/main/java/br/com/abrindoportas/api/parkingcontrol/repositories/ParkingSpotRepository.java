package br.com.abrindoportas.api.parkingcontrol.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.abrindoportas.api.parkingcontrol.model.ParkingSpotModel;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID>{
  boolean existsByLicensePaterCar(String licensePaterCar);
  boolean existsByParkingSpotNumber(String parkingSpotNumber);
  boolean existsByApartmetAndBlock(String apartmet, String block);
}
