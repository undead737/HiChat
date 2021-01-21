package ru.lechif.HiChatDden.security.crypt;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ru.lechif.HiChatDden.security.models.CrvAuth.CrvAuthUser;

@Service
public class CrvAuthPasswordCrypt implements ApplicationCrypt<CrvAuthUser>{
    @Override
    public String crypt(String value) {
        return new BCryptPasswordEncoder().encode(value);
    }
}
