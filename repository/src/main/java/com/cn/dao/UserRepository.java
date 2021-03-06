package com.cn.dao;

import com.cn.entity.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;
import java.util.List;
import java.util.Optional;

/**
 * Created by chen on 2017/6/23.
 */
@Repository
//@Table(name="user")
//@Qualifier("userRepository")
//@CacheConfig(cacheNames = "users")
public interface UserRepository extends JpaRepository<User,String> {

    Optional<User> findById(String userId);

    Optional<User> findByUsernameOrEmail(String username, String email);

    Optional<User> findByUnionId(String unionId);

    List<User> findByIdIn(List<Long> userIds);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

}
