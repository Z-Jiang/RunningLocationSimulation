package demo.domain;

import demo.domain.SupplyLocation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.geo.Point;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "locations")
public interface SupplyLocationRepository extends PagingAndSortingRepository<SupplyLocation, Long> {

    Page<SupplyLocation> findByCity(@Param("city") String city, Pageable pageable);

    SupplyLocation findFirstByLocationNear(@Param("location")Point location);
}
