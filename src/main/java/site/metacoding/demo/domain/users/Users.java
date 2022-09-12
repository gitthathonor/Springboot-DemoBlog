package site.metacoding.demo.domain.users;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import site.metacoding.demo.web.dto.request.users.JoinDto;
import site.metacoding.demo.web.dto.request.users.LoginDto;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Users {
	
	
	private Integer id;
	private String username;
	private String password;
	private String email;
	private Timestamp createdAt;
	
	public Users(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	
	public void 회원가입(JoinDto joinDto) {
		this.username = joinDto.getUsername();
		this.password = joinDto.getPassword();
		this.email = joinDto.getEmail();
	}
}
