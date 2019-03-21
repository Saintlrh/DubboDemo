package cn.itcast.service.impl;



import cn.itcast.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getName() {
        return "heima";
    }
}

