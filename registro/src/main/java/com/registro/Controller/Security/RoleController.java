package com.registro.Controller.Security;

import java.util.List;

import com.registro.Controller.ABaseController;
import com.registro.DTO.ApiResponseDto;
import com.registro.DTO.Security.IRoleDto;
import com.registro.Entity.Security.Role;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.registro.IService.Security.IRoleService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/role")
public class RoleController extends ABaseController<Role,IRoleService> {
	public RoleController(IRoleService service) {
        super(service, "Role");
    }
	
	@GetMapping("/list")
    public ResponseEntity<ApiResponseDto<List<IRoleDto>>> show() {
        try {
            List<IRoleDto> entity = service.getList();
            return ResponseEntity.ok(new ApiResponseDto<List<IRoleDto>>("Registro encontrado", entity, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<List<IRoleDto>>(e.getMessage(), null, false));
        }
    }
}
