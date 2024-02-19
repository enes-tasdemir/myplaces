package com.redev.myplaces.service;

import com.redev.myplaces.repository.PlaceRepository;
import org.springframework.stereotype.Service;

@Service
public class PlaceService {
    private final PlaceRepository placeRepository;
    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }
}
