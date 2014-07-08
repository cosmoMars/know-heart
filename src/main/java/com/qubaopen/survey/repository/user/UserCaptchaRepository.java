package com.qubaopen.survey.repository.user;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qubaopen.survey.entity.user.User;
import com.qubaopen.survey.entity.user.UserCaptcha;
import com.qubaopen.survey.repository.MyRepository;

public interface UserCaptchaRepository extends MyRepository<UserCaptcha, Long> {

	@RequestMapping("form UserCaptcha uc where uc.user = :user and uc.isRemoved = false")
	UserCaptcha findByUser(@Param("user") User user);
}
