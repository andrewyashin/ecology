package org.studying.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.studying.entity.Emissions;

@Repository
public interface EmissionsRepository extends CrudRepository<Emissions, Long> {
}
