//package com.example.whatsappservice.service;
//
//import com.example.whatsappservice.models.Utilisateur;
//import com.example.whatsappservice.Repository.UtilisateurRepository;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//@Service
//public class CustomUserDetailsService implements UserDetailsService {
//
//    private final UtilisateurRepository utilisateurRepository;
//    private final PasswordEncoder passwordEncoder;
//
//    public CustomUserDetailsService(UtilisateurRepository utilisateurRepository, PasswordEncoder passwordEncoder) {
//        this.utilisateurRepository = utilisateurRepository;
//        this.passwordEncoder = passwordEncoder;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Utilisateur utilisateur = utilisateurRepository.findByUsername(username)
//                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
//
//        return org.springframework.security.core.userdetails.User
//                .withUsername(utilisateur.getUsername())
//                .password(utilisateur.getPassword())
//                .authorities(utilisateur.getAuthorities())
//                .build();
//    }
//}
