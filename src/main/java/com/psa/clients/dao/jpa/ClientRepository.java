package com.psa.clients.dao.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.psa.clients.domain.Client;

@Repository
public interface ClientRepository extends CrudRepository <Client, Integer>  {


}
