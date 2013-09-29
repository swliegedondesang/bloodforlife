package be.dondesang.swliege.web.social;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionSignUp;
import org.springframework.social.connect.web.SignInAdapter;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;

@Service
public class SimpleSignInAdapter implements SignInAdapter, ConnectionSignUp {

    private static final Logger logger = LoggerFactory.getLogger(SimpleSignInAdapter.class);

//    @Autowired
//    private ConnectionRepository connectionRepository;

    @Override
    public String signIn(final String userLocalId, final Connection<?> connection, final NativeWebRequest nativeWebRequest) {
        SecurityContextHolder.getContext().setAuthentication(
                new UsernamePasswordAuthenticationToken(userLocalId, null, null));
        // Return to postSignIn URL
        return null;
    }

    @Override
    public String execute(Connection<?> connection) {
        return null;
    }
}