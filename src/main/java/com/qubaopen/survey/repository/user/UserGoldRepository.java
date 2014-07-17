package com.qubaopen.survey.repository.user;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.qubaopen.survey.entity.user.UserGold;
import com.qubaopen.survey.repository.MyRepository;

public interface UserGoldRepository extends MyRepository<UserGold, Long> {

	@Query("from UserGold ug where ug.user.id = :userid")
	UserGold findByUserId(@Param("userId") long userId);
}
