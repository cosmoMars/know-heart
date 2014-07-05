package com.qubaopen.survey.repository.util;

import org.apache.commons.lang3.StringUtils;

public class ValidateUtil {

	/**
	 * 判断是否为合法的手机号码
	 */
	public static boolean validatePhone(String phone) {
		if (StringUtils.isEmpty(phone)) {
			return false;
		}
		return phone.matches("^1[3458][0-9]{9}$");
	}
}
