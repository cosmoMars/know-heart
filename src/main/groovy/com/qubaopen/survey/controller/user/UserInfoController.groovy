package com.qubaopen.survey.controller.user

import org.springframework.beans.BeanUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

import com.qubaopen.survey.controller.AbstractBaseController
import com.qubaopen.survey.entity.user.UserInfo
import com.qubaopen.survey.repository.MyRepository
import com.qubaopen.survey.repository.user.UserInfoRepository
import com.qubaopen.survey.repository.user.UserRepository

@RestController
@RequestMapping("userInfos")
public class UserInfoController extends AbstractBaseController<UserInfo, Long> {

	@Autowired
	UserInfoRepository userInfoRepository

	@Autowired
	UserRepository userRepository

	@Override
	protected MyRepository<UserInfo, Long> getRepository() {
		return userInfoRepository
	}

	/**
	 * 保存用户基本信息
	 * @param phone
	 * @param info
	 * @return
	 */
	@RequestMapping(value = "saveUserInfo", method = RequestMethod.POST)
	saveUesrInfo(@RequestBody UserInfo info) {

		def user = userRepository.findActivatedByUserId(info.user.id)

		if (!user) {
			return '{"success": 0, "message": "err001"}'
		}

		def userInfo = userInfoRepository.findOneByFilters(
				[
					user_equal : user,
					isRemove_isFalse : null
				]
			)

		if (userInfo) {
			BeanUtils.copyProperties(info, userInfo)
		} else {
			userInfo = new UserInfo()
			BeanUtils.copyProperties(info, userInfo)
		}
		userInfoRepository.save(userInfo)
		'{"success": 1}'
	}
}
