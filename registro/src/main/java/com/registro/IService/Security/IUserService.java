package com.registro.IService.Security;

import java.util.List;

import com.registro.DTO.Security.IUserDto;
import com.registro.DTO.Security.UserResponseDto;
import com.registro.Entity.Security.User;
import com.registro.IService.IBaseService;

public interface IUserService extends IBaseService<User> {

	UserResponseDto getLogin(String username, String password);

	List<IUserDto> getList();
}
