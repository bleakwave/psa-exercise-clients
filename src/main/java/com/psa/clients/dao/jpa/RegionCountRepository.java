package com.psa.clients.dao.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.psa.clients.domain.Client;
import com.psa.clients.domain.RegionCount;

@Repository
public interface RegionCountRepository extends CrudRepository <RegionCount, Integer> {

}
