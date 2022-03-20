package com.smalldogg.msa.security.domain.user;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name= "User Controller")
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

  @Operation(summary = "유저 조회", description = "요청된 유저의 정보를 조회합니다.")
  @GetMapping("/{username}")
  public ResponseEntity<?> getUser(@PathVariable String username){
    return ResponseEntity.ok().body(null);
  }
}