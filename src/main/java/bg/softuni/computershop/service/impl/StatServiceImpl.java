package bg.softuni.computershop.service.impl;

import bg.softuni.computershop.models.view.StatsView;
import bg.softuni.computershop.service.StatService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class StatServiceImpl implements StatService {

    private int anonymousRequests, authRequests;

    @Override
    public void onRequest() {

        Authentication authentication = SecurityContextHolder
                .getContext()
                .getAuthentication();

        if (authentication != null && (authentication.getPrincipal() instanceof UserDetails)) {
            authRequests++;
        }else {
            anonymousRequests++;
        }
    }

    @Override
    public StatsView getStats() {
        return new StatsView(authRequests, anonymousRequests);
    }
}
