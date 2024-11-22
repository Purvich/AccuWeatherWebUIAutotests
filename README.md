# Automated Tests for the website <a href="https://developer.accuweather.com/">Developer AccuWeather</a>:

```diff
- The tests are written using chromedriver and only work if the Google Chrome browser is installed.
```

<h6><b>You can view the test cases <i><a href="https://docs.google.com/spreadsheets/d/19OGLU2VpDEI8ScSmPuKU6Esxt392eqM6eLdnv9mRHrI/edit?usp=sharing">here</a></i><b></h6>
  
<h1>Cucumber:</h1>
  
<h2>Authorization:</h2>
  
<ol>
  <p><li>Positive cases:</li></p>
    <p><ul>
      <li>
        <i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/cucumber/authorizationTests/Success%20Authorization.feature">Successful authorization</a></i>
      </li>
    </ul></p>
  
  <p><li>Negative cases:</li></p>
    <p><ul>
      <li>
        <i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/cucumber/authorizationTests/Authorization%20with%20an%20empty%20login%20field.feature">Authorization with an empty "Username or e-mail address" field</a></i>
      </li>
      <li>
        <i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/cucumber/authorizationTests/Authorization%20with%20an%20empty%20password%20field.feature">Authorization with an empty "Password" field</a></i>
      </li>
      <li>
        <i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/cucumber/authorizationTests/Authorization%20with%20empty%20login%20and%20password%20fields.feature">Authorization with empty "Username or e-mail address" and "Password" fields</a></i>
      </li>
      <li>
        <i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/cucumber/authorizationTests/Authorization%20with%20incorrect%20login.feature">Authorization with an incorrect username</a></i>
      </li>
      <li>
        <i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/cucumber/authorizationTests/Authorization%20with%20incorrect%20password.feature">Authorization with an incorrect password</a></i>
      </li>
    </ul></p>
  </ol>
  </p>
  
<h2>Creating a new application</h2>
  <ol>
  <p><li>Positive cases:</li></p>
    <ul>
      <li>
        <p><i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/cucumber/applicationTests/Creating%20a%20new%20application.feature">Successful creation of a new application</a></i></p>
      </li>
    </ul>
  </ol>
  
<h2>Deleting an existing application</h2>
<ol>
  <p><li>Positive cases:</li></p>
    <ul>
      <li>
        <i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/cucumber/applicationTests/Uninstalling%20an%20application.feature">Successful deletion of an existing application</a></i>
      </li>
      </ul>
  </ol>
  
  
<h1>Selenide:</h1>
  
<h2>Authorization:</h2>
  
<ol>
  <p><li>Positive cases:</li></p>
    <p><ul>
      <li>
        <i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/selenide/authorizationTests/PositiveAuthorizationTest.java">Successful authorization</a></i>
      </li>
      </ul></p>
  
  <p><li><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/selenide/authorizationTests/NegativeAuthorizationTest.java">Negative cases:</a></li></p>
    <p><ul>
      <li>
        <i>Authorization with an empty "Username or e-mail address" field"</i>
      </li>
      <li>
        <i>Authorization with an empty "Password" field</i>
      </li>
      <li>
        <i>Authorization with empty "Username or e-mail address" and "Password" fields</i>
      </li>
      <li>
        <i>Authorization with an incorrect username</i>
      </li>
      <li>
        <i>Authorization with an incorrect password</i>
      </li>
    </ul></p>
  </ol>
  
<h2>Creating a new application</h2>
  <ol>
  <p><li>Positive cases:</li></p>
    <ul>
      <li>
        <p><i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/selenide/applicationTests/CreatingANewApplicationTest.java">Successful creation of a new application</a></i></p>
      </li>
    </ul>
  </ol>
  
<h2>Deleting an existing application</h2>
<ol>
  <p><li>Positive cases:</li></p>
    <ul>
      <li>
        <p><i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/selenide/applicationTests/UninstallingAnApplicationTest.java">Successful deletion of an existing application</a></i></p>
      </li>
      </ul>
  </ol>
