package com.psa.clients.dao.jpa;

import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository <Client, Integer>  {


}
