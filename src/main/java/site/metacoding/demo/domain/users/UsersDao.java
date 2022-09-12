package site.metacoding.demo.domain.users;

import java.util.List;

import site.metacoding.demo.web.dto.request.users.LoginDto;

public interface UsersDao {
	public void insert(Users users);
	public Users findById(Integer id);
	public List<Users> findAll();
	public void update(Users users);
	public void delete(Integer id);
	public Users login(LoginDto loginDto);
}
