package dio.spring.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public class UserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT e FROM User e JOIN FETCH e.roles WHERE e.username= (:username)")
    public User findByUsername(@Param ("username") String username);
}
