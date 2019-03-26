package com.rms.database.repo;




import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rms.database.entity.BookingEntity;

@Repository
public interface DatabaseRepo  extends CrudRepository<BookingEntity, Long>{

}
