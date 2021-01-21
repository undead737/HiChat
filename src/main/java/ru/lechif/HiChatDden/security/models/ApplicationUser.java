package ru.lechif.HiChatDden.security.models;

import java.util.List;

public interface ApplicationUser {
    String getId();
    String getUserName();
    String getPassword();
    String getEmail();
    boolean isActive();
    List<? extends ApplicationRole> getRoles();
}
