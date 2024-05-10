package com.registro.Controller.Geo;

import com.registro.Controller.ABaseController;
import com.registro.Entity.Geo.Continent;
import com.registro.IService.Geo.IContinentService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/continent")
public class ContinentController extends ABaseController<Continent, IContinentService> {
    /**
     * Constructor for ABaseController.
     *
     * @param service    The service for the entity.
     */
    protected ContinentController(IContinentService service) {
        super(service, "Continent");
    }
}
