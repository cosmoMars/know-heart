package com.qubaopen.survey.utils;

import static org.apache.commons.lang3.StringUtils.isNotEmpty;

public class ValidateUtil {

	/**
	 * 判断是否为合法的手机号码
	 */
	public static boolean validatePhone(String phone) {
		return isNotEmpty(phone) && phone.matches("^1[3458][0-9]{9}$");
	}
}
