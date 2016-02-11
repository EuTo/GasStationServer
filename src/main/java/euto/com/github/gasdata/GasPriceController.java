package euto.com.github.gasdata;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@RestController
@RequestMapping("/price")
public class GasPriceController {

    @RequestMapping(method = RequestMethod.GET)
    public
    @ResponseBody
    GasPrice getPriceById(@RequestParam(value = "id",
            required = false, defaultValue = "asdfasdfasdf") final String id,
                          @RequestParam(value = "timeStamp", required = false,
                                  defaultValue = "201508061245") final String timeStamp) {
        return new GasPrice(id, 1.23f, Integer.valueOf(timeStamp.substring(0, 8)),
                Integer.valueOf(timeStamp.substring(8, 12)));
    }
}
