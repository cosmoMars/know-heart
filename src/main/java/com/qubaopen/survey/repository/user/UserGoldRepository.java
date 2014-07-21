package com.qubaopen.survey.repository.user;

import com.qubaopen.survey.entity.user.User;
import com.qubaopen.survey.entity.user.UserGold;
import com.qubaopen.survey.repository.MyRepository;

public interface UserGoldRepository extends MyRepository<UserGold, Long> {

	UserGold findByUser(User user);
}
