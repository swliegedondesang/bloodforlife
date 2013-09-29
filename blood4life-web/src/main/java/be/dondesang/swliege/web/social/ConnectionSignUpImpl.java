package be.dondesang.swliege.web.social;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionSignUp;

import java.util.Calendar;
import java.util.Random;

/**
 * @since 29/09/13
 */
public class ConnectionSignUpImpl implements ConnectionSignUp {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConnectionSignUpImpl.class);

    private static Random rand;

    public ConnectionSignUpImpl() {
        rand = new Random(Calendar.getInstance().getTimeInMillis());
    }

    @Override
    public String execute(final Connection<?> connection) {
        LOGGER.debug("connection sign up");
        return Long.toString(rand.nextLong());
    }
}
