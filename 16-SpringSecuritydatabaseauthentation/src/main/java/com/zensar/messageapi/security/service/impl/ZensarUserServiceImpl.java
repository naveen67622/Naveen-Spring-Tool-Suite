package com.zensar.messageapi.security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.zensar.messageapi.entity.ZensarUser;
import com.zensar.messageapi.repository.ZensarUserRepository;

@Service
public class ZensarUserServiceImpl implements UserDetailsService  {
	
	@Autowired
	private ZensarUserRepository repo;
	/**
	 * Following method is used to fetch UserName and password from DB
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		//Here we are fetching user from DB
		ZensarUser founderUser =this.repo.findByUserName(username);
		
		if(founderUser == null)
		{
			throw new UsernameNotFoundException(username);
		}

	User authenticatedUser = new User(founderUser.getUserName(), founderUser.getPassword(),
				AuthorityUtils.createAuthorityList("ROLE_USER"));
	
				return authenticatedUser;
				}

	}
	


