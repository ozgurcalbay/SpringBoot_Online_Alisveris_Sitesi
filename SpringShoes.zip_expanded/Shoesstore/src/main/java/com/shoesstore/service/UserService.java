package com.shoesstore.service;

import com.shoesstore.domain.User;
import com.shoesstore.domain.security.PasswordResetToken;

public interface UserService {

	PasswordResetToken getPasswordResetToken(final String token);

	void createPasswordResetTokenForUser(final User user, final String token);

}
