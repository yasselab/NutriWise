package ma.ac.esi.nutriwise.service;

import ma.ac.esi.nutriwise.repository.UserRepository;

public class UserService {

    private final UserRepository userRepository;

    public UserService() {
        this.userRepository = new UserRepository();
    }

    // méthode existante (optionnelle, peut être conservée)
    public boolean findUserByCredentials(String login, String password) {
        return userRepository.userExists(login, password);
    }

    // méthode manquante à ajouter obligatoirement
    public boolean authenticateUser(String login, String password) {
        // ici on peut réutiliser la méthode existante
        return findUserByCredentials(login, password);
    }
}
