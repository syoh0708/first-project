package com.beauty.api.model.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AdminMemberUpdatePassword {

  private Long id;
  private String email;
  private String password;
  private String newPassword;
}
