package be.dondesang.swliege.web.social;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.web.SignInAdapter;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;

@Service
public class SimpleSignInAdapter implements SignInAdapter {

    @Override
    public String signIn(String s, Connection<?> connection, NativeWebRequest nativeWebRequest) {
        SecurityContextHolder.getContext().setAuthentication(
                new UsernamePasswordAuthenticationToken("userBidon", null, null));
        return null;
    }
}