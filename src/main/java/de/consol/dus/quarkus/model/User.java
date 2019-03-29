package de.consol.dus.quarkus.model;

import java.util.Objects;

public class User {
  private final long uuid;
  private final String name;
  private final String eMail;

  private User(long uuid, String name, String eMail) {
    this.uuid = uuid;
    this.name = name;
    this.eMail = eMail;
  }

  public static User of(long uuid, String name, String eMail) {
    return new User(uuid, name, eMail);
  }

  public long getUuid() {
    return uuid;
  }

  public String getName() {
    return name;
  }

  public String geteMail() {
    return eMail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return uuid == user.uuid &&
        Objects.equals(name, user.name) &&
        Objects.equals(eMail, user.eMail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, eMail);
  }
}