package com.example.authentication.Services;

import com.example.authentication.Entity.User;

public interface IAuthenticationService
{
    User signInAndReturnJWT(User signInRequest);
}
