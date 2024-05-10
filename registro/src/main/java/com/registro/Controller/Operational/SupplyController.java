package com.registro.Controller.Operational;

import com.registro.Controller.ABaseController;
import com.registro.DTO.ApiResponseDto;
import com.registro.DTO.Operational.IProductDto;
import com.registro.DTO.Operational.ISupplyDto;
import com.registro.Entity.Operational.Supply;
import com.registro.IService.Operational.ISupplyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/supply")
public class SupplyController extends ABaseController<Supply, ISupplyService> {

    /**
     * Constructor for ABaseController.
     *
     * @param service    The service for the entity.
     */
    protected SupplyController(ISupplyService service) {
        super(service, "supply");
    }

    @GetMapping("/list")
    public ResponseEntity<ApiResponseDto<List<ISupplyDto>>> show(){
        try{
            List<ISupplyDto> entity = service.getList();
            return  ResponseEntity.ok(new ApiResponseDto<List<ISupplyDto>>("Registro encontrado", entity, true));

        } catch (Exception e){
            return  ResponseEntity.internalServerError().body(new ApiResponseDto<List<ISupplyDto>>(e.getMessage(), null, false));
        }
    }


}
