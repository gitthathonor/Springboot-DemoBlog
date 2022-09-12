package site.metacoding.demo.web;


import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.demo.domain.users.Users;
import site.metacoding.demo.domain.users.UsersDao;
import site.metacoding.demo.web.dto.request.users.JoinDto;
import site.metacoding.demo.web.dto.request.users.LoginDto;

@Controller
@RequiredArgsConstructor
public class UsersController {
	
	private final UsersDao usersDao;
	private final HttpSession session;
	
	@GetMapping("/joinForm")
	public String joinForm() {
		return "users/joinForm";
	}
	
	@PostMapping("/join")
	public String join(JoinDto joinDto) {
		Users usersPS = new Users();
		usersPS.회원가입(joinDto);
		usersDao.insert(usersPS);
		return "redirect:/";
	}
	
	@GetMapping("/loginForm")
	public String loginForm() {
		return "users/loginForm";
	}
	
	@PostMapping("/login")
	public String login(LoginDto loginDto) {
		Users usersPS = usersDao.login(loginDto);
		if(usersPS == null) {
			return "redirect:/loginForm";
		}
		return "";
	}
	
	
}
