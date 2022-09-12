package site.metacoding.demo.web.dto.request.users;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JoinDto {
	
	private String username;
	private String password;
	private String email;
	
	public JoinDto(String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
}
