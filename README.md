# Автотесты для сайта <a href="https://developer.accuweather.com/">Developer AccuWeather</a>:

<h6><b>Тест-кейсы можно посмотреть <i><a href="https://docs.google.com/spreadsheets/d/19OGLU2VpDEI8ScSmPuKU6Esxt392eqM6eLdnv9mRHrI/edit?usp=sharing">тут.</a></i><b></h6>
  
<h1>Cucumber:</h1>
  
<h2>Авторизация:</h2>
  
<ol>
  <p><li>Позитивные кейсы:</li></p>
    <p><ul>
      <li>
        <i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/cucumber/authorization/positive/Success%20Authorization.feature">Успешная авторизация</a></i>
      </li>
    </ul></p>
  
  <p><li>Негативные кейсы:</li></p>
    <p><ul>
      <li>
        <i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/cucumber/authorization/negative/Authorization%20with%20an%20empty%20login%20field.feature">Авторизация с пустым полем "Username or e-mail address"</a></i>
      </li>
      <li>
        <i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/cucumber/authorization/negative/Authorization%20with%20an%20empty%20password%20field.feature">Авторизация с пустым полем "Password"</a></i>
      </li>
      <li>
        <i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/cucumber/authorization/negative/Authorization%20with%20empty%20login%20and%20password%20fields.feature">Авторизация с пустыми полями "Username or e-mail address" и "Password"</a></i>
      </li>
      <li>
        <i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/cucumber/authorization/negative/Authorization%20with%20incorrect%20login.feature">Авторизация с некорректным логином</a></i>
      </li>
      <li>
        <i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/cucumber/authorization/negative/Authorization%20with%20incorrect%20password.feature">Авторизация с некорректным паролем</a></i>
      </li>
    </ul></p>
  </ol>
  </p>
  
<h2>Создание нового приложения</h2>
  <ol>
  <p><li>Позитивные кейсы:</li></p>
    <ul>
      <li>
        <p><i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/cucumber/creatingANewApplication/Creating%20a%20new%20application.feature">Успешное создание нового приложения</a></i></p>
      </li>
    </ul>
  </ol>
  
<h2>Удаление существующего приложения</h2>
<ol>
  <p><li>Позитивные кейсы:</li></p>
    <ul>
      <li>
        <i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/cucumber/uninstallingAnApplication/Uninstalling%20an%20application.feature">Успешное удаление существующего приложения</a></i>
      </li>
      </ul>
  </ol>
  
  
<h1>Selenide:</h1>
  
<h2>Авторизация:</h2>
  
<ol>
  <p><li>Позитивные кейсы:</li></p>
    <p><ul>
      <li>
        <i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/selenide/authorization/positive/SuccessAuthorizationTest.java">Успешная авторизация</a></i>
      </li>
      </ul></p>
  
  <p><li>Негативные кейсы:</li></p>
    <p><ul>
      <li>
        <i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/selenide/authorization/negative/AuthorizationWithAnEmptyLoginFieldTest.java">Авторизация с пустым полем "Username or e-mail address"</a></i>
      </li>
      <li>
        <i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/selenide/authorization/negative/AuthorizationWithAnEmptyPasswordFieldTest.java">Авторизация с пустым полем "Password"</a></i>
      </li>
      <li>
        <i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/selenide/authorization/negative/AuthorizationWithEmptyLoginAndPasswordFieldsTest.java">Авторизация с пустыми полями "Username or e-mail address" и "Password"</a></i>
      </li>
      <li>
        <i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/selenide/authorization/negative/AuthorizationWithIncorrectLoginTest.java">Авторизация с некорректным логином</a></i>
      </li>
      <li>
        <i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/selenide/authorization/negative/AuthorizationWithIncorrectPasswordTest.java">Авторизация с некорректным паролем</a></i>
      </li>
    </ul></p>
  </ol>
  
<h2>Создание нового приложения</h2>
  <ol>
  <p><li>Позитивные кейсы:</li></p>
    <ul>
      <li>
        <p><i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/selenide/creatingANewApplication/CreatingANewApplicationTest.java">Успешное создание нового приложения</a></i></p>
      </li>
    </ul>
  </ol>
  
<h2>Удаление существующего приложения</h2>
<ol>
  <p><li>Позитивные кейсы:</li></p>
    <ul>
      <li>
        <p><i><a href="https://github.com/Purvich/AccuWeatherWebUIAutotests/blob/master/src/test/java/selenide/uninstallingAnApplication/uninstallingAnApplicationTest.java">Успешное удаление существующего приложения</a></i></p>
      </li>
      </ul>
  </ol>
