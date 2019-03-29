package de.consol.dus.quarkus.resources;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
public class UserApp extends Application {

  private static final Set<Class<?>> classes = new HashSet<>(
      Arrays.asList(UserResource.class));

  @Override
  public Set<Class<?>> getClasses() {
    return UserApp.classes;
  }

}
