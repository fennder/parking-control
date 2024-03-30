package br.com.abrindoportas.api.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.abrindoportas.api.model.ParkingSpotModel;
import br.com.abrindoportas.api.repositories.ParkingSpotRepository;

@Service
public class ParkingSpotService {
	
	
	@Autowired
	ParkingSpotRepository parkingSpotRepository;
	
	public ParkingSpotService() {
		
		this.parkingSpotRepository = parkingSpotRepository;
	}
	
	@Transactional
	public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
		return parkingSpotRepository.save(parkingSpotModel);
	}

}
