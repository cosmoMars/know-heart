package com.qubaopen.survey.repository.user;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.qubaopen.survey.entity.user.User;
import com.qubaopen.survey.repository.MyRepository;

public interface UserRepository extends MyRepository<User, Long> {

	@Query(value = "from User u where u.phone = :phone and u.isRemoved = false")
	User findByPhone(@Param("phone") String phone);

	@Query(value = "from User u where u.phone = :phone and u.password = :password and u.isActivated = true and u.isRemoved = false")
	User login(@Param("phone") String phone, @Param("password") String password);

	@Query(value = "from User u where u.id = :userId and u.isActivated = true and u.isRemoved = false")
	User findActivatedByUserId(@Param("userId") long userId);

}

