package euto.com.github.stationdata;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface GasStationRepository extends MongoRepository<GasStation, String> {
    List<GasStation> findByPostCode(final int postCode);
}
