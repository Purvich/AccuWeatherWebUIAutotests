package accuweather.data;

public enum LoginModalDialogElements {

  LOG_IN_BUTTON("Log in", "edit-submit"),
  USERNAME_INPUT("Username or e-mail address", "edit-name"),
  PASSWORD_INPUT("Password", "edit-pass");

  private final String value;
  private final String id;

  LoginModalDialogElements(String value, String id) {
    this.value = value;
    this.id = id;
  }

  public String getValue() {
    return value;
  }

  public String getId() {
    return id;
  }

  @Override
  public String toString() {
    return value;
  }
}
