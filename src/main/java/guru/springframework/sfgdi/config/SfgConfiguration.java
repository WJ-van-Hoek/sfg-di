/**
 * 
 */
package guru.springframework.sfgdi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author Hoek0024 on 21 feb. 2023
 *
 */
@ConfigurationProperties("guru")
@Configuration
public class SfgConfiguration {
	private String username;
	private String password;
	private String jdbcurl;

	/**
	 * @return the username
	 */
	public String getUsername() {
		return this.username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the jdbcurl
	 */
	public String getJdbcurl() {
		return this.jdbcurl;
	}

	/**
	 * @param jdbcurl the jdbcurl to set
	 */
	public void setJdbcurl(String jdbcurl) {
		this.jdbcurl = jdbcurl;
	}

}
