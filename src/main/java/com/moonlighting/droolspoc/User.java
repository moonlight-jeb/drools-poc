package com.moonlighting.droolspoc;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
  private String name;
  
  private String premiumStatus;
  
  private List<String> verifications;
  
  @Id
  private String id;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPremiumStatus() {
    return premiumStatus;
  }

  public void setPremiumStatus(String premiumStatus) {
    this.premiumStatus = premiumStatus;
  }

  public List<String> getVerifications() {
    return verifications;
  }

  public void setVerifications(List<String> verifications) {
    this.verifications = verifications;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

}
