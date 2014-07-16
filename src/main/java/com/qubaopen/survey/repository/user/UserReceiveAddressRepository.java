package com.qubaopen.survey.repository.user;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.qubaopen.survey.entity.user.UserReceiveAddress;
import com.qubaopen.survey.repository.MyRepository;

public interface UserReceiveAddressRepository extends MyRepository<UserReceiveAddress, Long> {

//	@Query("from UserReceiveAddress ura where ura.user.id = :userId and ura.isDefault = true")
//	UserReceiveAddress findDefaultAddressByUserId(@Param("userId") long userId);

	@Query("from UserReceiveAddress ura where ura.user.id = :userId")
	List<UserReceiveAddress> findByUserId(@Param("userId") long userId);
}
