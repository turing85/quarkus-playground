package de.consol.dus.quarkus.resources;

import de.consol.dus.quarkus.model.User;
import java.util.Arrays;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("users")
public class UserResource {

  private static final User ALICE = User.of(0L, "Alice", "alice@wonder.land");
  private static final User BOB = User.of(13L, "Bob", "bob@builder.com");

  private static final List<User> ALL_USERS = Arrays.asList(ALICE, BOB);

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Response getAllUsers() {
    return Response.ok(ALL_USERS).build();
  }
}
