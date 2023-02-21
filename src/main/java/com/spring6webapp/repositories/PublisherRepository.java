package com.spring6webapp.repositories;

import com.spring6webapp.domain.Publisher;
import jakarta.persistence.Id;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
