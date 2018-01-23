package com.lmig.gfc.roadgameraterbe.api;

import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmig.gfc.roadgameraterbe.models.User;
import com.lmig.gfc.roadgameraterbe.repositories.UserRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/user")
public class UserApiController {

	private UserRepository userRepository;
	private PasswordEncoder encoder;

	public UserApiController(UserRepository userRepository, PasswordEncoder encoder) {
		this.userRepository = userRepository;
		this.encoder = encoder;
	}

	//Get the user currently logged in. (name, address, and etc)
	@GetMapping("")
	public User getUser(Authentication auth) {
		if (auth != null) {
			User user = (User) auth.getPrincipal();
			String username = user.getUsername();
			return userRepository.findByUsername(username);
		}
		return null;

	}
	//update the users info if needed
	@PutMapping("")
	public User updateUser(Authentication auth, @RequestBody User user) {

		User loggedInUser = (User) auth.getPrincipal();
		user.setId(loggedInUser.getId());

		return userRepository.save(user);
	}
	
	//Create a new user. Post record in DB. Encrypt new password.
	@PostMapping("create")
	public User createUser(@RequestBody User user) {
		String password = user.getPassword();
		String encryptedPassword = encoder.encode(password);
		user.setPassword(encryptedPassword);
		userRepository.save(user);
		return user;
	}
}
