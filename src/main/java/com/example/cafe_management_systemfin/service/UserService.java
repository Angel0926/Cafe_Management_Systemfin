package com.example.cafe_management_systemfin.service;


import com.example.cafe_management_systemfin.dto.request.SignUpRequestDto;
import com.example.cafe_management_systemfin.dto.responce.SignInResponseDto;
import com.example.cafe_management_systemfin.dto.responce.SignUpResponseDto;
import com.example.cafe_management_systemfin.dto.responce.UserResponseDto;

import javax.transaction.Transactional;
import java.nio.file.attribute.UserPrincipalNotFoundException;

public interface UserService {



    @Transactional
    SignUpResponseDto signUp(SignUpRequestDto signUpRequestDto) throws UserPrincipalNotFoundException;

    SignInResponseDto signIn(String username, String password) throws UserPrincipalNotFoundException;



    UserResponseDto deleteUser(String username) throws UserPrincipalNotFoundException;

    UserResponseDto findById(Long userId) throws UserPrincipalNotFoundException;

    Object findByRoleTypeWaiter() throws UserPrincipalNotFoundException;

    Object findAll() throws UserPrincipalNotFoundException;

   UserResponseDto updatePassword(String username, String newPassword) throws UserPrincipalNotFoundException;
}
