package com.entropy.backend.middleware.pattern.factory;

import com.entropy.backend.enumeration.OAuth2Type;
import com.entropy.backend.middleware.oauth2.FacebookOAuth2UserInfo;
import com.entropy.backend.middleware.oauth2.GithubOAuth2UserInfo;
import com.entropy.backend.middleware.oauth2.GoogleOAuth2UserInfo;
import com.entropy.backend.middleware.pattern.template.OAuth2UserInfoTemplate;
import com.entropy.backend.util.ResourceNotFoundExceptionHandler;

import java.util.Map;

public class OAuth2UserInfoFactory {
    public static OAuth2UserInfoTemplate getOAuth2UserInfo(String registrationId, Map<String, Object> attributes) {
        if (registrationId.equalsIgnoreCase(OAuth2Type.GOOGLE.name()))
            return new GoogleOAuth2UserInfo(attributes);
        else if (registrationId.equalsIgnoreCase(OAuth2Type.FACEBOOK.name()))
            return new FacebookOAuth2UserInfo(attributes);
        else if (registrationId.equalsIgnoreCase(OAuth2Type.GITHUB.name()))
            return new GithubOAuth2UserInfo(attributes);
        else {
            throw new ResourceNotFoundExceptionHandler("Sorry! Login with " + registrationId + " is not supported yet.");
        }
    }
}
