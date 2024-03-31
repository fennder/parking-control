package br.com.abrindoportas.api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.abrindoportas.api.model.ParkingSpotModel;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID>{
  boolean existsByLicensePlateCar(String licensePlateCar);
  boolean existsByParkingSpotNumber(String parkingSpotNumber);
  boolean existsByApartmentAndBlock(String apartment, String block);
}
