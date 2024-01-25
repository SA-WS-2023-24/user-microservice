//package com.htwberlin.userservice.core.domain.service.impl;
//
//import com.htwberlin.userservice.core.domain.model.UserDTO;
//import com.htwberlin.userservice.core.domain.service.interfaces.IKeycloakAdminClientService;
//import jakarta.ws.rs.core.Response;
//import org.keycloak.admin.client.Keycloak;
//
//import org.keycloak.admin.client.KeycloakBuilder;
//import org.keycloak.representations.idm.UserRepresentation;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//
//@Service
//public class KeycloakAdminClientService implements IKeycloakAdminClientService {
//  private final Keycloak keycloak;
//
//  public KeycloakAdminClientService(Keycloak keycloak) {
//
//    this.keycloak = keycloak;
//  }
//
//  @Override
//  public String getAccessToken() {
//    return this.keycloak.tokenManager().getAccessTokenString();
//  }
//
//
//  @Override
//  public void createUser() {
//    UserRepresentation user = new UserRepresentation();
//    user.setUsername(UserDTO.getEmail());
//    user.setEnabled(true);
//    user.setFirstName(UserDTO.getFirstName());
//    user.setLastName(UserDTO.getLastName());
//    user.setEmail(UserDTO.getEmail());
//
//    Response res = this.keycloak.realm("master").users().create(user);
//    if (res.getStatus() != 201) {
//      throw new RuntimeException("Could not create user");
//    }
//    res.close();
//  }
//}
