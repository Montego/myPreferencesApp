package repository;

import entity.Authority;
import entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByNickname(String nickname);
    User findAllByAuthority(Authority authority);
    User findByEmail(String email);
    User findByRegistrated(Timestamp registrated);

}
