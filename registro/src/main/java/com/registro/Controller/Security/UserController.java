package com.registro.Controller.Security;

import java.util.List;
import java.util.NoSuchElementException;

import com.registro.Controller.ABaseController;
import com.registro.DTO.ApiResponseDto;
import com.registro.DTO.Security.ILoginDto;
import com.registro.DTO.Security.IUserDto;
import com.registro.DTO.Security.UserResponseDto;
import com.registro.Entity.Security.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.registro.IService.Security.IUserService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/user")
public class UserController extends ABaseController<User,IUserService> {
	public UserController(IUserService service) {
        super(service, "user");
    }
	
	@PostMapping("/login")
    public ResponseEntity<ApiResponseDto<UserResponseDto>> show(@RequestBody ILoginDto login) {
        String username = login.getUsername();
        String password = login.getPassword();

        try {
            UserResponseDto entity = service.getLogin(username, password);
            return ResponseEntity.ok(new ApiResponseDto<UserResponseDto>("Registro encontrado", entity, true));
        }catch (NoSuchElementException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new ApiResponseDto<>("Usuario no encontrado", null, false));
        }
    }

	@GetMapping("/list")
    public ResponseEntity<ApiResponseDto<List<IUserDto>>> show() {
        try {
            List<IUserDto> entity = service.getList();
            return ResponseEntity.ok(new ApiResponseDto<List<IUserDto>>("Registro encontrado", entity, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<List<IUserDto>>(e.getMessage(), null, false));
        }
		}
}
