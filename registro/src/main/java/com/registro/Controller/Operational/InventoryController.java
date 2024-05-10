package com.registro.Controller.Operational;

import com.registro.Controller.ABaseController;
import com.registro.DTO.ApiResponseDto;
import com.registro.DTO.Operational.IInventoryDto;
import com.registro.DTO.Operational.ISupplyProductDto;
import com.registro.Entity.Operational.Inventory;
import com.registro.Service.Operational.InventoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/inventory")
public class InventoryController extends ABaseController<Inventory, InventoryService> {
    /**
     * Constructor for ABaseController.
     *
     * @param service    The service for the entity.
     */
    protected InventoryController(InventoryService service) {
        super(service, "inventory");
    }

    @GetMapping("/list")
    public ResponseEntity<ApiResponseDto<List<IInventoryDto>>> show(){
        try{
            List<IInventoryDto> entity = service.getList();
            return  ResponseEntity.ok(new ApiResponseDto<List<IInventoryDto>>("Registro encontrado", entity, true));

        } catch (Exception e){
            return  ResponseEntity.internalServerError().body(new ApiResponseDto<List<IInventoryDto>>(e.getMessage(), null, false));
        }
    }
}
