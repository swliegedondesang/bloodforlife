package be.dondesang.swliege.social;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.connect.ConnectionSignUp;
import org.springframework.social.connect.web.SignInAdapter;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;

import javax.servlet.http.HttpServletResponse;

@Service
public class SimpleSignInAdapter implements SignInAdapter, ConnectionSignUp {

    private static final Logger logger = LoggerFactory.getLogger(SimpleSignInAdapter.class);

//    @Autowired
//    private ConnectionRepository connectionRepository;

    @Override
    public String signIn(String userId, Connection<?> connection, NativeWebRequest request)

    {

//        User user = userService.findByLogin(userId);
//        Authentication authentication = SecurityUtil.signInUser(user);
//        // set remember-me cookie
//        tokenBasedRememberMeServices.onLoginSuccess(
//                (HttpServletRequest) request.getNativeRequest(),
//                (HttpServletResponse) request.getNativeResponse(),
//                authentication);
//        return null;

        HttpServletResponse response = (HttpServletResponse) request.getNativeResponse();
        logger.info("\n\n\n"+userId+"\n\n\n");
//        SecurityContextHolder.getContext().setAuthentication(
//                new UsernamePasswordAuthenticationToken(userId, null, null));
        return "index.html";
    }

    @Override
    public String execute(Connection<?> connection) {
        logger.info("\n\n\nexecute\n\n\n");
        return "userBidon";
    }
}