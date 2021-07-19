package com.entropy.backend.models.rests.requests.users;

import com.entropy.backend.common.constants.ApiMessage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * Class map with user request of Openfire Rest API
 *
 * @author bac-ta
 * @see OpenfireUserRegistrationRequest
 * @since 2021-06-13
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
@MappedSuperclass
public class OpenfireUserRegistrationRequest {
    @NotBlank(message = ApiMessage.USER_NAME_NOT_BLANK)
    private String username;

    @NotBlank(message = ApiMessage.NAME_NOT_BLANK)
    private String name;

    @Email
    @NotBlank(message = ApiMessage.EMAIL_NOT_BLANK)
    private String email;
    private String password;
}
