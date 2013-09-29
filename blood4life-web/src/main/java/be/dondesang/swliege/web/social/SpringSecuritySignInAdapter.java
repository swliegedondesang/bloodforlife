package be.dondesang.swliege.web.social;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.web.SignInAdapter;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;

@Service
public class SpringSecuritySignInAdapter implements SignInAdapter {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringSecuritySignInAdapter.class);

    @Override
    public String signIn(final String userLocalId, final Connection<?> connection, final NativeWebRequest nativeWebRequest) {
        LOGGER.info("adding user {} to spring security context", userLocalId);
        SecurityContextHolder.getContext().setAuthentication(
                new UsernamePasswordAuthenticationToken(userLocalId, null, null));
        // Return to postSignIn URL
        return null;

    }

}