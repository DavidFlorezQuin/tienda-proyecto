package com.registro.Controller.Geo;

import java.util.List;

import com.registro.Controller.ABaseController;
import com.registro.DTO.ApiResponseDto;
import com.registro.DTO.Geo.ICountryDto;
import com.registro.Entity.Geo.Country;
import com.registro.IService.Geo.ICountryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/country")
public class CountryController extends ABaseController<Country, ICountryService> {
	public CountryController(ICountryService service) {
        super(service, "Country");
    }

	@GetMapping("/list")
    public ResponseEntity<ApiResponseDto<List<ICountryDto>>> show() {
        try {
            List<ICountryDto> entity = service.getList();
            return ResponseEntity.ok(new ApiResponseDto<List<ICountryDto>>("Registro encontrado", entity, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<List<ICountryDto>>(e.getMessage(), null, false));
        }
    }
	
}
