package erp_system_backend.controllers;

import erp_system_backend.model.User;
import erp_system_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(method = RequestMethod.GET)
    //@GetMapping
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok(users);
    }

    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public ResponseEntity<?> getUser(@PathVariable String username) {
        for (User c: users){
            if (c.getUsername().equalsIgnoreCase(username)){
                return ResponseEntity.ok(c);
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Username not found :" + username);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> postUser(@RequestBody User user) {
        users.add(user);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{username}")
                .buildAndExpand(user.getUsername())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> putUser( @RequestBody User user) {
        for (User c : users ) {
            if (c.getUser_id() == user.getUser_id()) {
                c.setUsername(user.getUsername());
                c.setEmail(user.getEmail());
                c.setPassword(user.getPassword());
                return ResponseEntity.noContent().build();
            }
        }
        return ResponseEntity.notFound().build();
    }

    @RequestMapping(value = "/{user_id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteUser(@PathVariable int user_id) {
        for (User c: users) {
            if(c.getUser_id() == user_id){
                users.remove(c);
                return ResponseEntity.noContent().build();
            }
        }
        return ResponseEntity.notFound().build();
    }

    @RequestMapping(method = RequestMethod.PATCH)
    public ResponseEntity<?> patchUser(@RequestBody User user ) {
        for(User c: users) {
            if(c.getUser_id() == user.getUser_id()) {
                if (user.getUsername() != null) {
                    c.setUsername(user.getUsername());
                }
                if (user.getEmail() != null) {
                    c.setEmail(user.getEmail());
                }
                if (user.getPassword() != null) {
                    c.setPassword(user.getPassword());
                }
                return ResponseEntity.ok("User modified success: " + user.getUser_id());
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found with the Id: " + user.getUser_id());

    }
}
