package org.codersparks.edpc.repository;

import org.codersparks.edpc.model.Commodity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CommodityRepository extends JpaRepository<Commodity, Long>{

}
