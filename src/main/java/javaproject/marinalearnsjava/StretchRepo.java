// Create a repository interface to interact with the DB

package javaproject.marinalearnsjava;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StretchRepo extends JpaRepository<Stretch, Long> {
    List<Stretch> findByBodyPart(String bodyPart);
}
