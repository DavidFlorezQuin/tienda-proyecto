package com.registro.Controller.Geo;

import java.util.List;

import com.registro.Controller.ABaseController;
import com.registro.DTO.ApiResponseDto;
import com.registro.DTO.Geo.IDepartmentDto;
import com.registro.Entity.Geo.Department;
import com.registro.IService.Geo.IDepartmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/department")
public class DepartmentController extends ABaseController<Department, IDepartmentService> {
	public DepartmentController(IDepartmentService service) {
        super(service, "Department");
    }
	

	@GetMapping("/list")
    public ResponseEntity<ApiResponseDto<List<IDepartmentDto>>> show() {
        try {
            List<IDepartmentDto> entity = service.getList();
            return ResponseEntity.ok(new ApiResponseDto<List<IDepartmentDto>>("Registro encontrado", entity, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<List<IDepartmentDto>>(e.getMessage(), null, false));
        }
    }
}
