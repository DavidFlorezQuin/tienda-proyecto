package com.registro.Service.Security;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import com.registro.DTO.Security.*;
import com.registro.Entity.Security.User;
import com.registro.IRepository.IBaseRepository;
import com.registro.IService.Security.IRoleViewService;
import com.registro.IService.Security.IUserRoleService;
import com.registro.Service.ABaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registro.IRepository.Security.IUserRepository;
import com.registro.IService.Security.IUserService;

@Service
public class UserService extends ABaseService<User> implements IUserService{

	@Override
	protected IBaseRepository<User, Long> getRepository() {
		return repository;
	}

	@Autowired
	private IRoleViewService viewService;
	
	@Autowired
	private IUserRepository repository;

	@Autowired
	private IUserRoleService roleService;


	@Override
	public UserResponseDto getLogin(String username, String password) {

		Optional<IUserDto> user = repository.getLogin(username, password);

		if (user.isPresent()) {

			// ACCEDER AL ROLE

			IUserDto userDto =  user.get();

			Long idUser = user.get().getId();

			List<IUserRoleDto> roles = roleService.getUserRole(idUser);

			List<IRoleViewDto> allViews = new ArrayList<>();

			for(IUserRoleDto role : roles){
				List<IRoleViewDto> roleView = viewService.getRoleView(role.getId());
				allViews.addAll(roleView);
			}


			UserResponseDto response = new UserResponseDto();

			// ASIGNAR VALORES
			response.setUser(userDto);

			response.setRoles(roles);

			response.setView(allViews);

			return response;

		} else {

			throw new NoSuchElementException("Usuario no encontrado");

		}
	}


	@Override
	public List<IUserDto> getList() {
		return repository.getList();
	}	
}
