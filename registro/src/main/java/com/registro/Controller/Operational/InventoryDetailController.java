package com.registro.Controller.Operational;

import com.registro.Controller.ABaseController;
import com.registro.DTO.ApiResponseDto;
import com.registro.DTO.Operational.IInventoryDetailDto;
import com.registro.Entity.Operational.InventoryDetail;
import com.registro.Service.Operational.InventoryDetailService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/inventory-detail")
public class InventoryDetailController extends ABaseController<InventoryDetail, InventoryDetailService> {
    /**
     * Constructor for ABaseController.
     * @param service    The service for the entity.
     */
    protected InventoryDetailController(InventoryDetailService service) {
        super(service, "InventoryDetail");
    }

    @GetMapping("/list")
    public ResponseEntity<ApiResponseDto<List<IInventoryDetailDto>>> show(){
        try{
            List<IInventoryDetailDto> entity = service.getList();
            return  ResponseEntity.ok(new ApiResponseDto<List<IInventoryDetailDto>>("Registro encontrado", entity, true));

        } catch (Exception e){
            return  ResponseEntity.internalServerError().body(new ApiResponseDto<List<IInventoryDetailDto>>(e.getMessage(), null, false));
        }
    }


}
