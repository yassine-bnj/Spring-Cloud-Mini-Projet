package com.example.demo.security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Role;
import com.example.demo.entities.User;
import com.example.demo.repos.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class CustomUserDetailsService implements UserDetailsService {
    private UserRepository userRepo;

    
    
    @Autowired
    public CustomUserDetailsService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }
/*    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByUsername(username);
        if (user != null) {
            org.springframework.security.core.userdetails.User authUser = new org.springframework.security.core.userdetails.User(
                    user.getUsername(),
                    user.getPassword(),
                    user.getRoles().stream().map((role) -> new SimpleGrantedAuthority(role.getRole()))
                            .collect(Collectors.toList())
            );
            System.out.println("user = "+ authUser.toString());
            return authUser;
        } else {
            throw new UsernameNotFoundException("User not found");
        }
    }*/
    
    
    @Override
    public UserDetails loadUserByUsername(String email) throws
    UsernameNotFoundException {
    	System.out.println(email);
    	Optional<User> user = userRepo.findByEmail(email);
    	System.out.println(user);
    	if (!user.isPresent())
    		{user = userRepo.findByUsername(email);
    		}
    	
    	if (!user.isPresent())
    	 throw new UsernameNotFoundException("Utilisateur introuvable !");
    	
    	List<GrantedAuthority> auths = new ArrayList<>();
    	
    	auths = user.get().getRoles().stream().map((role) -> new SimpleGrantedAuthority(role.getRole()))
        .collect(Collectors.toList());
    	
    	
    	
    		 for(Role R : user.get().getRoles()) {
    			 System.out.println("role == "+ R);
    			 GrantedAuthority auhority = new SimpleGrantedAuthority(R.getRole());
    			 auths.add(auhority);
    		 }
    	
    	System.out.println("roles = "+ auths);

    	
    	
    	return new org.springframework.security.core.
    	userdetails.User(user.get().getUsername(),user.get().getPassword(),auths);
    	 }
    
    
    
    
    
    
    
    
    
}
