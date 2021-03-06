package com.qubaopen.survey.repository.user;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.qubaopen.survey.entity.user.UserCaptcha;
import com.qubaopen.survey.repository.MyRepository;

public interface UserCaptchaRepository extends MyRepository<UserCaptcha, Long> {

	@Query("from UserCaptcha uc where uc.user.phone = :phone")
	UserCaptcha findByPhone(@Param("phone") String phone);

}
