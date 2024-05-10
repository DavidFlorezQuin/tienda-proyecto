package com.registro.Controller.Security;

import com.registro.Controller.ABaseController;
import com.registro.DTO.ApiResponseDto;
import com.registro.DTO.Security.IListUserRoleDto;
import com.registro.DTO.Security.IUserDto;
import com.registro.DTO.Security.IUserRoleDto;
import com.registro.Entity.Security.UserRole;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.registro.IService.Security.IUserRoleService;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/userRole")
public class UserRoleController extends ABaseController<UserRole,IUserRoleService> {
	public UserRoleController(IUserRoleService service) {
        super(service, "UserRole");
    }


    @GetMapping ("/UserRole/{id}")
    public ResponseEntity<ApiResponseDto<List<IUserRoleDto>>> showRole(@PathVariable Long id){
        try{
            List<IUserRoleDto> entity = service.getUserRole(id);
            return ResponseEntity.ok(new ApiResponseDto<List<IUserRoleDto>>("Registro encontrado", entity, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<List<IUserRoleDto>>(e.getMessage(), null, false));
        }
        }

    @GetMapping("/list")
    public ResponseEntity<ApiResponseDto<List<IListUserRoleDto>>> show() {
        try {
            List<IListUserRoleDto> entity = service.getList();
            return ResponseEntity.ok(new ApiResponseDto<List<IListUserRoleDto>>("Registro encontrado", entity, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<List<IListUserRoleDto>>(e.getMessage(), null, false));
        }
    }



}
