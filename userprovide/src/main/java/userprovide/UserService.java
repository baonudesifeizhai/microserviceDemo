package userprovide;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import userprovide.User;
@Service
public class UserService {
  
    private static HashMap<Long, User> userMap = new HashMap<Long, User>();

    static {
         
        userMap.put(1l, new User(1l,"zhangsan"));
        userMap.put(2l, new User(2l,"li si"));
    }

    /*
     * 根据传入的number返回用户信息
     */
    public User queryUserInfo(Long id) {
        return userMap.get(id);
    }
}