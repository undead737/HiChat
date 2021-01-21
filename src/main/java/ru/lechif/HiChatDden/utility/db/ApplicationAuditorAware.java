package ru.lechif.HiChatDden.utility.db;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("ApplicationAuditorAware")
public class ApplicationAuditorAware implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("HiChatDdenApplication");
    }
}
