package ru.lechif.HiChatDden.security.crypt;

import ru.lechif.HiChatDden.security.models.ApplicationUser;

public interface ApplicationCrypt<T extends ApplicationUser> {
    String crypt(String value);
}
