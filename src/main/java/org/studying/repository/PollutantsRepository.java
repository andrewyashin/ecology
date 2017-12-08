package org.studying.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.studying.entity.Pollutants;

@Repository
public interface PollutantsRepository extends CrudRepository<Pollutants, Long> {
}
