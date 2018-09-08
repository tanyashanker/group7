package com.capgemini.bechdalo.group7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public User create(String fullname, String username, String password, String phone, String email, String address, String gender) {
		return repo.save(new User(fullname,username,email,password,address,phone,gender));
		
	}

	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return repo.findByEmail(email);
	}

	public User findByPhone(String phone) {
		// TODO Auto-generated method stub
		return repo.findByPhone(phone);
	}

	public User findByfullname(String fullname) {
		// TODO Auto-generated method stub
		return repo.findByFullname(fullname);
	}

	public User Username(String uname) {
		// TODO Auto-generated method stub
		return repo.findByUsername(uname);
	}
	
	public User findByPassword(String password) {
		return repo.findByPassword(password);
	}
//	
//	public User findByPhone(String phone) {
//		return repo.findByPhone(phone);
//	}
//	
//	public User findByNameAndPassword(String name, String password) {
//		return repo.findByNameAndPassword(name,password);
//	}
}
