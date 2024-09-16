//package com.example.whatsappservice.Controller;
//
//
//import com.example.whatsappservice.models.Utilisateur;
//import com.example.whatsappservice.service.UtilisateurService;
//import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.security.authentication.AuthenticationManager;
////import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
////import org.springframework.security.core.Authentication;
////import org.springframework.security.core.context.SecurityContextHolder;
////import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api")
//public class AuthController {
//
////    @Autowired
////    private AuthenticationManager authenticationManager;
////
////    @Autowired
////    private UtilisateurService utilisateurService;
////
////    @Autowired
////    private PasswordEncoder passwordEncoder;
////
////    @PostMapping("/register")
////    public String registerUser(Utilisateur utilisateur) {
////        utilisateur.setMotDePasse(passwordEncoder.encode(utilisateur.getMotDePasse()));
////        utilisateurService.enregistrerUtilisateur(utilisateur);
////        return "redirect:/login";
////    }
////
////    @PostMapping("/login")
////    public String login(@RequestParam String username, @RequestParam String password) {
////        Authentication authentication = authenticationManager.authenticate(
////                new UsernamePasswordAuthenticationToken(username, password)
////        );
////        SecurityContextHolder.getContext().setAuthentication(authentication);
////        return "redirect:/dashboard"; // Redirect to the dashboard or home page after login
////    }
//
//    @GetMapping("/login")
//    public String loginPage() {
//        return "login"; // Thymeleaf template for login
//    }
//
//    @GetMapping("/register")
//    public String registerPage() {
//        return "register"; // Thymeleaf template for register
//    }
////
////    @PostMapping("/login")
////    public String login(@RequestParam String username, @RequestParam String password) {
////        try {
////            Authentication authentication = authenticationManager.authenticate(
////                    new UsernamePasswordAuthenticationToken(username, password)
////            );
////            SecurityContextHolder.getContext().setAuthentication(authentication);
////            return "Connexion réussie";
////        } catch (BadCredentialsException e) {
////            return "redirect:/login?registerSuccess=true";  // Redirect to login on success
////        }
//    }
//
//
//
//
//
//
//
//
//
//
