package net.javaguides.springboot.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;


import net.javaguides.springboot.model.*;

@Repository
public interface userRepo extends JpaRepository <users, Long>{

}
