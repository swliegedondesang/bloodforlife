package be.dondesang.swliege.web.controller.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.web.ProviderSignInUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value="/login", method= RequestMethod.GET)
    public String signUp(WebRequest request) {
        Connection<?> connection = ProviderSignInUtils.getConnection(request);
        if (connection != null) {
            connection.fetchUserProfile();  // TODO
            return "index.html";
        }
        return "facebookLogin.html";
    }

//    @RequestMapping(value="/signin", method=RequestMethod.POST)
//    public String signin(WebRequest request) {
//                   logger.info("signin");
//
////            ProviderSignInUtils.handlePostSignUp(account.getUsername(), request);
//
//        return "index.html";
//    }


//    @RequestMapping(value="/signup", method=RequestMethod.POST)
//    public String signup(WebRequest request) {
//        logger.info("signup");
//
////            ProviderSignInUtils.handlePostSignUp(account.getUsername(), request);
//
//        return "index.html";
//    }



    /*
    @RequestMapping(value="/connect", method= RequestMethod.GET)
    public SignupForm signupForm(WebRequest request) {
        Connection<?> connection = ProviderSignInUtils.getConnection(request);
        if (connection != null) {
            return SignupForm.fromProviderUser(connection.fetchUserProfile());
        } else {
            return new SignupForm();
        }
    }

    public static SignupForm fromProviderUser(UserProfile providerUser) {
        SignupForm form = new SignupForm();
        form.setFirstName(providerUser.getFirstName());
        form.setLastName(providerUser.getLastName());
        form.setUsername(providerUser.getUsername());
        form.setEmail(providerUser.getEmail());
        return form;
    }

    @RequestMapping(value="/signup", method=RequestMethod.POST)
    public String signup(@Valid SignupForm form, BindingResult formBinding, WebRequest request) {
        if (formBinding.hasErrors()) {
            return null;
        }
        Account account = createAccount(form, formBinding);
        if (account != null) {
            SignInUtils.signin(account.getUsername());
            ProviderSignInUtils.handlePostSignUp(account.getUsername(), request);
            return "redirect:/";
        }
        return null;
    } */
}
