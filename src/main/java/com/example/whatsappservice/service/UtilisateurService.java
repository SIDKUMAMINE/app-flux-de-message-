//package com.example.whatsappservice.service;
//
//import com.example.whatsappservice.models.Utilisateur;
//import com.example.whatsappservice.Repository.UtilisateurRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service("utilisateurService")
//@Qualifier("utilisateurService")
//public class UtilisateurService implements UserDetailsService {
//
//    @Autowired
//    private UtilisateurRepository utilisateurRepository;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        return utilisateurRepository.findByUsername(username)
//                .orElseThrow(() -> new UsernameNotFoundException("Utilisateur non trouvé"));
//    }
//
//    public Optional<Utilisateur> trouverParNomUtilisateur(String username) {
//        return utilisateurRepository.findByUsername(username);
//    }
//
//    public Utilisateur registerNewUser(Utilisateur user) {
//        // Check if the username already exists
//        if (utilisateurRepository.existsByUsername(user.getUsername())) {
//            throw new RuntimeException("Username already exists");
//        }
//
//        // Encode the user's password
//        String encodedPassword = passwordEncoder.encode(user.getPassword());
//        user.setPassword(encodedPassword);  // Set the encoded password
//
//        // Save and return the user
//        return utilisateurRepository.save(user);
//    }
//    public Utilisateur enregistrerUtilisateur(Utilisateur utilisateur) {
//        return utilisateurRepository.save(utilisateur);
//    }
//}
