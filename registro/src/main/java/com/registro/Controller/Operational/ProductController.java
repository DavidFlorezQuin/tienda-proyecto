package com.registro.Controller.Operational;

import com.registro.Controller.ABaseController;
import com.registro.DTO.ApiResponseDto;
import com.registro.DTO.Operational.IProductDto;
import com.registro.Entity.Operational.Product;
import com.registro.IService.Operational.IProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/product")
public class ProductController extends ABaseController<Product, IProductService> {


    /**
     * Constructor for ABaseController.
     *
     * @param service    The service for the entity.
     */
    protected ProductController(IProductService service) {
        super(service, "product");
    }

    @GetMapping("/list")
    public ResponseEntity<ApiResponseDto<List<IProductDto>>> show(){
        try{
            List<IProductDto> entity = service.getList();
            return  ResponseEntity.ok(new ApiResponseDto<List<IProductDto>>("Registro encontrado", entity, true));

        } catch (Exception e){
            return  ResponseEntity.internalServerError().body(new ApiResponseDto<List<IProductDto>>(e.getMessage(), null, false));
        }
    }
}
