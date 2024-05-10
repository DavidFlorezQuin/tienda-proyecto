package com.registro.Controller.Operational;

import com.registro.Controller.ABaseController;
import com.registro.DTO.ApiResponseDto;
import com.registro.DTO.Operational.IProductDto;
import com.registro.DTO.Operational.IUnitMeasurementDto;
import com.registro.Entity.Operational.UnitMeasurement;
import com.registro.IService.Operational.IUnitMeasurementService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/unit-measurement")
public class UnitMeasurementController extends ABaseController<UnitMeasurement, IUnitMeasurementService> {
    /**
     * Constructor for ABaseController.
     *
     * @param service    The service for the entity.
     */
    protected UnitMeasurementController(IUnitMeasurementService service) {
        super(service, "UnitMeasurement");
    }

    @GetMapping("/list")
    public ResponseEntity<ApiResponseDto<List<IUnitMeasurementDto>>> show(){
        try{
            List<IUnitMeasurementDto> entity = service.getList();
            return  ResponseEntity.ok(new ApiResponseDto<List<IUnitMeasurementDto>>("Registro encontrado", entity, true));

        } catch (Exception e){
            return  ResponseEntity.internalServerError().body(new ApiResponseDto<List<IUnitMeasurementDto>>(e.getMessage(), null, false));
        }
    }

}
