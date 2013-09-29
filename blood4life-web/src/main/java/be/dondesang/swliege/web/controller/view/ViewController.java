package be.dondesang.swliege.web.controller.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.social.connect.web.ProviderSignInUtils;
import org.springframework.social.connect.web.SignInAdapter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.WebRequest;

/**
 * @since 29/09/13
 */
@Controller
public class ViewController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ViewController.class);
    
    @Autowired
    private SignInAdapter signInAdapter;

    @RequestMapping("/")
    public String getMainPage() {
        LOGGER.debug("User is authenticated ? {}", SecurityContextHolder.getContext().getAuthentication().isAuthenticated());
        if (SecurityContextHolder.getContext().getAuthentication().isAuthenticated()) {
            LOGGER.debug("User connected : {}", SecurityContextHolder.getContext().getAuthentication().getName());
        }
        return "index.html";
    }
    
    @RequestMapping("/signin")
    public String getMainPage(final WebRequest webRequest) {
//        LOGGER.debug("signin with user : {}", );
        signInAdapter.signIn("toto", ProviderSignInUtils.getConnection(webRequest), (NativeWebRequest) webRequest);
        return "index.html";
    }

}
