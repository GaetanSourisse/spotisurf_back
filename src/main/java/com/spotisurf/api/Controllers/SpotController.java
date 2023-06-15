package com.spotisurf.api.Controllers;

import com.spotisurf.api.Models.Spot;
import com.spotisurf.api.Repository.SpotRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("api/v1")
public class SpotController {

    private final SpotRepository spotRepository;

    public SpotController(SpotRepository spotRepository){
        this.spotRepository = spotRepository;
    }

    @GetMapping("/spots")
    public Spot.Fields getAllSpots(){
        return spotRepository.findById("648adc3057112e8f3f9b7e15").get().getFields();
    }

    @GetMapping("/spots/{_id}")
    public Optional<Spot> getSpotById(@PathVariable(value = "_id") String SpotId){
        return spotRepository.findById(SpotId);
    }



}
