package accuweather.data;

public enum LoginPageButtons {
  LOGIN_BUTTON("Login"),
  LOGOUT_BUTTON("Logout");

  private final String value;

  LoginPageButtons(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return value;
  }
}
