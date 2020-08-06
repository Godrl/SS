package org.yona.util;

import java.util.Collection;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.yona.login.LoginServiceImp;

public class Authentication implements AuthenticationProvider{

	private static final Logger logger = LoggerFactory.getLogger(Authentication.class);
	
	@Inject
	private LoginServiceImp service;
	
	@SuppressWarnings("unchecked")
	@Override
	public org.springframework.security.core.Authentication authenticate(org.springframework.security.core.Authentication authentication) throws AuthenticationException {
		
		String userid = (String)authentication.getPrincipal();
		String userpw = (String)authentication.getCredentials();
		
		UserDetailsImp user = (UserDetailsImp)service.loadUserByUsername(userid);
		
		logger.info("userid = "+user.getUsername() + " userpw = "+user.getPassword());
		
		if(!matchPassword(userpw,user.getPassword())) {
			logger.info("=====비밀번호가 불일치=====");
			throw new BadCredentialsException(userid);
		}
		
		Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>)user.getAuthorities();
		
		if(!user.isEnabled()) {
			logger.info("=====계정 활성화 여부=====");
			throw new BadCredentialsException(userid);
		}
		
		return new UsernamePasswordAuthenticationToken(user,user,authorities);
	}

	
	private boolean matchPassword(String userpw, String password) {
		return userpw.equals(password);
	}


	@Override
	public boolean supports(Class<?> authentication) {
		return true;
	}


}
