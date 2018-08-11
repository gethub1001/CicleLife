package test.services;

import org.springframework.stereotype.Service;
import com.entity.User;

@Service
public class TestServicesInterfaceImpl implements TestServicesInterFace {
    @Override
    public int testInterface() {
        return 0;
    }

    @Override
    public User TesrUser() {
        return new User();
    }
}
