package com.qubaopen.survey.repository.user;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.qubaopen.survey.entity.user.UserIDCardBind;
import com.qubaopen.survey.repository.MyRepository;

public interface UserIDCardBindRepository extends MyRepository<UserIDCardBind, Long> {

	@Query("from UserIDCardBind u where u.user.id = :userId")
	UserIDCardBind findByUserId(@Param("userId") long userId);
}
