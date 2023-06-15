package com.spotisurf.api.Repository;

import com.spotisurf.api.Models.Spot;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpotRepository extends MongoRepository<Spot, String> {
}
