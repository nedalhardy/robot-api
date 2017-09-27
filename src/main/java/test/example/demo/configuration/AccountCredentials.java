package test.example.demo.configuration;

import lombok.Getter;
import lombok.Setter;

public class AccountCredentials {
    /**
     * username String
     */
    @Getter
    @Setter
	private String username;
    /**
     * password String
     */
    @Getter
    @Setter
	private String password;

}
