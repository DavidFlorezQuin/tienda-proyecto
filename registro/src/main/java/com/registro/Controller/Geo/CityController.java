package com.registro.Controller.Geo;

import java.util.List;

import com.registro.Controller.ABaseController;
import com.registro.DTO.ApiResponseDto;
import com.registro.DTO.Geo.ICityDto;
import com.registro.Entity.Geo.City;
import com.registro.IService.Geo.ICityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/city")
public class CityController extends ABaseController<City, ICityService> {
	public CityController(ICityService service) {
        super(service, "City");
    }

	@GetMapping("/list")
    public ResponseEntity<ApiResponseDto<List<ICityDto>>> show() {
        try {
            List<ICityDto> entity = service.getList();
            return ResponseEntity.ok(new ApiResponseDto<List<ICityDto>>("Registro encontrado", entity, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<List<ICityDto>>(e.getMessage(), null, false));
        }
    }

}
