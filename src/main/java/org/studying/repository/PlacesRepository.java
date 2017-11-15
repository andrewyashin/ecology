package org.studying.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.studying.entity.Places;

@Repository
public interface PlacesRepository extends CrudRepository<Places, Long> {
}
