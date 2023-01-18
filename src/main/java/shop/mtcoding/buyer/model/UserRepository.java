package shop.mtcoding.buyer.model;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserRepository {

    public User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
