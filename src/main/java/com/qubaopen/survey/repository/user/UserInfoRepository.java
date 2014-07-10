package com.qubaopen.survey.repository.user;

import com.qubaopen.survey.entity.user.UserInfo;
import com.qubaopen.survey.repository.MyRepository;

public interface UserInfoRepository extends MyRepository<UserInfo, Long> {

//	@RequestMapping(value = "from UserInfo ui where ui.user.id = :userId and ui.isRemoved = false")
//	UserInfo findByUserId(@Param("userId") long userId);

}
