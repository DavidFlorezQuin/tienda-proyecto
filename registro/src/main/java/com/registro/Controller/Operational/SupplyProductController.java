package com.registro.Controller.Operational;

import com.registro.Controller.ABaseController;
import com.registro.DTO.ApiResponseDto;
import com.registro.DTO.Operational.ISupplyDto;
import com.registro.DTO.Operational.ISupplyProductDto;
import com.registro.Entity.Operational.SupplyProduct;
import com.registro.IService.Operational.ISupplyProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/supply-product")
public class SupplyProductController extends ABaseController<SupplyProduct, ISupplyProductService> {
    /**
     * Constructor for ABaseController.
     *
     * @param service    The service for the entity.
     */
    protected SupplyProductController(ISupplyProductService service) {
        super(service, "SupplyProduct");
    }


    @GetMapping("/list")
    public ResponseEntity<ApiResponseDto<List<ISupplyProductDto>>> show(){
        try{
            List<ISupplyProductDto> entity = service.getList();
            return  ResponseEntity.ok(new ApiResponseDto<List<ISupplyProductDto>>("Registro encontrado", entity, true));

        } catch (Exception e){
            return  ResponseEntity.internalServerError().body(new ApiResponseDto<List<ISupplyProductDto>>(e.getMessage(), null, false));
        }
    }

    @GetMapping("/supply-product/{id}")
    public ResponseEntity<ApiResponseDto<List<ISupplyProductDto>>> showSupplies(@PathVariable Long id){
        try{
            List<ISupplyProductDto> entity = service.getSupplyProduct(id);
            return  ResponseEntity.ok(new ApiResponseDto<List<ISupplyProductDto>>("Registro encontrado", entity, true));

        } catch (Exception e){
            return  ResponseEntity.internalServerError().body(new ApiResponseDto<List<ISupplyProductDto>>(e.getMessage(), null, false));
        }
    }


}
