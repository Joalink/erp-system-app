package erp_system_backend.service;

import erp_system_backend.model.User;
import erp_system_backend.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUserById(Long user_id) {
        return Optional.empty();
    }

    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public Optional<User> updateUser(Long user_id, User user) {
        return Optional.empty();
    }

    @Override
    public Optional<User> patchUser(Long user_id, User user) {
        return Optional.empty();
    }

    @Override
    public Optional<User> delete(Long user_id) {
        return Optional.empty();
    }

//    @Autowired
//    UserRepository userRepository;
//
//    @Override
//    @Transactional
//    public User save(User user) {
//        return this.userRepository.save(user);
//    }
//
//    @Override
//    @Transactional(readOnly = true)
//    public List<User> get(){
//        return (List<User> this.userRepository.findAll();
//    }
//
//    @Override
//    @Transactional(readOnly = true)
//    public Optional<User> getById(Long user_id) {
//        return this.userRepository.findById(user_id);
//    }
//
//    @Override
//    @Transactional
//    public Optional<User> delete(Long user_id) {
//        Optional<User> user = this.getById(user_id);
//        if(user.isPresent()){
//            this.userRepository.deleteById(user_id);
//        }
//        return user;
//    }
//
//    @Override
//    @Transactional
//    public Optional <User> update(Long user_id, User user) {
//        Optional(User) user1 = this.getById(id);
//
//        if(user1.isPresent()){
//            User usr = user1.orElseThrow();
//            usr.setUsername(usr.getUsername);
//            usr.setPassword(usr.getPassword);
//            usr.setEmail(usr.getEmail);
//        }
//    }

}
