package app;

import data.Auta;
import data.Cennik;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import repo.AutaRepo;
import repo.CennikRepo;

@RestController
public class ServletController {
    @Autowired
    AutaRepo auta;

    @Autowired
    CennikRepo cenniki;


    @RequestMapping(
            value = "/hello",
            method = RequestMethod.GET
    )
    public String hello() {
        return "hello";
    }

    @RequestMapping(
            value = "/find",
            method = RequestMethod.GET
    )
    public Integer find(@RequestParam String nazwa) {
        return auta.findBynazwa(nazwa).get(0).getPredkosc();
    }

    @RequestMapping(
            value = "/s",
            method = RequestMethod.GET)
    public String szukanie_cennika(@RequestParam Integer id){
        return cenniki.findAll().get(0).getNazwa();

    }

}