package com.ctrip.framework.apollo.portal.spi.um;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class UmAuthenticationProvider implements AuthenticationProvider {

	@Override
	public Authentication authenticate(Authentication arg0) throws AuthenticationException {
		//TODO 调用UM接口验证用户
		boolean loginStatus = false;
		System.out.println(arg0.getName()+" "+arg0.getCredentials());
		if(!loginStatus) {
			throw new UsernameNotFoundException("no user found");
		}
		
		return new UsernamePasswordAuthenticationToken(arg0.getName(), arg0.getCredentials());
	}

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return true;
	}

}
