package euto.com.github.stationdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
@RestController
@EnableMongoRepositories
@RequestMapping(value = "/stations")
public class GasStationController {

    @Autowired
    private GasStationRepository repository;


    @RequestMapping
    public
    @ResponseBody
    List<GasStation> getAllStations() {
        return repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = {"application/json; charset=utf-8"})
    public
    @ResponseBody
    GasStation getStationById(@PathVariable("id") final String id) {
        return repository.findOne(id);
    }

    @RequestMapping(value = "/postcode/{postcode}", method = RequestMethod.GET, produces = {"application/json; charset=utf-8"})
    public
    @ResponseBody
    List<GasStation> getStationById(@PathVariable("postcode") final int postCode) {
        return repository.findByPostCode(postCode);
    }
}
