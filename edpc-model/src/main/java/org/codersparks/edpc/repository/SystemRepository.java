package org.codersparks.edpc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SystemRepository extends JpaRepository<org.codersparks.edpc.model.System, Long>{

}
