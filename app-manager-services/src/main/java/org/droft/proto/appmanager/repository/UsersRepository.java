package org.droft.proto.appmanager.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.droft.proto.appmanager.dm.User;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("AppUsersRepo")
public interface UsersRepository extends JpaRepository<User,Long>{
}
