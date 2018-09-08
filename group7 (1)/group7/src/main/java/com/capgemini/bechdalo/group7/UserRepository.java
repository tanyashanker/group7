package com.capgemini.bechdalo.group7;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends MongoRepository<User, String> {

	public User findByUsername(String uname);
	public User findByPhone(String phone);
	public User findByEmail(String email);
	public User findByFullname(String fname);
	public User findByPassword(String password);
}
