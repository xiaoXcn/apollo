package com.ctrip.framework.apollo.portal.spi.um;

import java.util.List;

import com.ctrip.framework.apollo.portal.entity.bo.UserInfo;
import com.ctrip.framework.apollo.portal.spi.UserService;

public class UmUserService implements UserService {

	@Override
	public List<UserInfo> searchUsers(String keyword, int offset, int limit) {
		// TODO 调用um接口查询用户
		return null;
	}

	@Override
	public UserInfo findByUserId(String userId) {
		// TODO 调用um接口查询用户
		return null;
	}

	@Override
	public List<UserInfo> findByUserIds(List<String> userIds) {
		// TODO 调用um接口查询用户
		return null;
	}

}
