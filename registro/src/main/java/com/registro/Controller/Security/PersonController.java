package com.registro.Controller.Security;

import java.util.List;

import com.registro.Controller.ABaseController;
import com.registro.DTO.ApiResponseDto;
import com.registro.DTO.Security.IDocumentPersonDto;
import com.registro.DTO.Security.IPersonDto;
import com.registro.Entity.Security.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.registro.IService.Security.IPersonService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/person")
public class PersonController extends ABaseController<Person,IPersonService> {
	public PersonController(IPersonService service) {
        super(service, "Person");
        
    }

	@GetMapping("/list")
    public ResponseEntity<ApiResponseDto<List<IPersonDto>>> show() {
        try {
            List<IPersonDto> entity = service.getList();
            return ResponseEntity.ok(new ApiResponseDto<List<IPersonDto>>("Registro encontrado", entity, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<List<IPersonDto>>(e.getMessage(), null, false));
        }
		}


	}
