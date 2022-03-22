# Автотесты для сайта <a href="https://developer.accuweather.com/">Developer AccuWeather</a>:

```diff
- Тесты написаны с использованием chromedriver и работают только при наличии браузера Google Chrome.
```

<h6><b>Тест-кейсы можно посмотреть <i><a href="https://docs.google.com/spreadsheets/d/19OGLU2VpDEI8ScSmPuKU6Esxt392eqM6eLdnv9mRHrI/edit?usp=sharing">тут.</a></i><b></h6>
  
<h1>Cucumber:</h1>
  
<h2>Авторизация:</h2>
  
<ol>
  <p><li>Позитивные кейсы:</li></p>
    <p><ul>
      <li>
        <i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/cucumber/authorizationTests/Success%20Authorization.feature">Успешная авторизация</a></i>
      </li>
    </ul></p>
  
  <p><li>Негативные кейсы:</li></p>
    <p><ul>
      <li>
        <i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/cucumber/authorizationTests/Authorization%20with%20an%20empty%20login%20field.feature">Авторизация с пустым полем "Username or e-mail address"</a></i>
      </li>
      <li>
        <i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/cucumber/authorizationTests/Authorization%20with%20an%20empty%20password%20field.feature">Авторизация с пустым полем "Password"</a></i>
      </li>
      <li>
        <i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/cucumber/authorizationTests/Authorization%20with%20empty%20login%20and%20password%20fields.feature">Авторизация с пустыми полями "Username or e-mail address" и "Password"</a></i>
      </li>
      <li>
        <i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/cucumber/authorizationTests/Authorization%20with%20incorrect%20login.feature">Авторизация с некорректным логином</a></i>
      </li>
      <li>
        <i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/cucumber/authorizationTests/Authorization%20with%20incorrect%20password.feature">Авторизация с некорректным паролем</a></i>
      </li>
    </ul></p>
  </ol>
  </p>
  
<h2>Создание нового приложения</h2>
  <ol>
  <p><li>Позитивные кейсы:</li></p>
    <ul>
      <li>
        <p><i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/cucumber/applicationTests/Creating%20a%20new%20application.feature">Успешное создание нового приложения</a></i></p>
      </li>
    </ul>
  </ol>
  
<h2>Удаление существующего приложения</h2>
<ol>
  <p><li>Позитивные кейсы:</li></p>
    <ul>
      <li>
        <i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/cucumber/applicationTests/Uninstalling%20an%20application.feature">Успешное удаление существующего приложения</a></i>
      </li>
      </ul>
  </ol>
  
  
<h1>Selenide:</h1>
  
<h2>Авторизация:</h2>
  
<ol>
  <p><li>Позитивные кейсы:</li></p>
    <p><ul>
      <li>
        <i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/selenide/authorizationTests/PositiveAuthorizationTest.java">Успешная авторизация</a></i>
      </li>
      </ul></p>
  
  <p><li><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/selenide/authorizationTests/NegativeAuthorizationTest.java">Негативные кейсы:</a></li></p>
    <p><ul>
      <li>
        <i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/selenide/authorizationTests/NegativeAuthorizationTest.java#:~:text=NegativeAuthorizationTest%20extends%20BaseTest%20%7B-,%40Test,%7D,-%40Test">Авторизация с пустым полем "Username or e-mail address"</a></i>
      </li>
      <li>
        <i>Авторизация с пустым полем "Password"</i>
      </li>
      <li>
        <i>Авторизация с пустыми полями "Username or e-mail address" и "Password"</i>
      </li>
      <li>
        <i>Авторизация с некорректным логином</i>
      </li>
      <li>
        <i>Авторизация с некорректным паролем</i>
      </li>
    </ul></p>
  </ol>
  
<h2>Создание нового приложения</h2>
  <ol>
  <p><li>Позитивные кейсы:</li></p>
    <ul>
      <li>
        <p><i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/selenide/applicationTests/CreatingANewApplicationTest.java">Успешное создание нового приложения</a></i></p>
      </li>
    </ul>
  </ol>
  
<h2>Удаление существующего приложения</h2>
<ol>
  <p><li>Позитивные кейсы:</li></p>
    <ul>
      <li>
        <p><i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/selenide/applicationTests/UninstallingAnApplicationTest.java">Успешное удаление существующего приложения</a></i></p>
      </li>
      </ul>
  </ol>
