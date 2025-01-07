package erp_system_backend.service;

import erp_system_backend.model.User;

import java.util.List;
import java.util.Optional;

//public interface UserService {
//    public User save(User user);
//    public List<User> get();
//    public Optional <User> getById(Long user_id);
//    public Optional <User> delete(Long user_id);
//    public Optional <User> update(Long user_id, User user);
//
//}


public interface UserService {
    public List<User> getAllUsers();
    public Optional <User> getUserById(Long user_id);
    public User saveUser(User user);
    public Optional <User> updateUser(Long user_id, User user);
    public Optional <User> patchUser(Long user_id, User user);
    public Optional <User> delete(Long user_id);
}
