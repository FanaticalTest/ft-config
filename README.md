# ft-config

This library handle the config file in a Test factory.

## How to use the library?

#### Build the project and install in your local maven repository:
```
gradle install
```

#### Add the library in your POM or Gradle `build.gradle`:
```
repositories {
	//..
	mavenLocal()
}

dependencies {
    //..
    // Where x.x.x is the version number you are using
    compile("com.fanaticaltest:ft-config:x.x.x")
    testCompile("com.fanaticaltest:ft-config:x.x.x")
}
```
#### Add yor application property file. Let call it `application.properties` and add a value as bellow
```
test.value=toto
```
Now to get this value, you have to specify where is your configuration file:
```
Property p = new Property("./src/main/resources/application.properties");
```
Then get your value:
```
public String myValue = p.read("test.value");
```


## How to build the library?
```
gradle build
```

## Using Artifactory
In Version 0.1.2 we add the Artifactory support. But we kept commented to use back `jcenter()` :
* To publish `gradle publish`
* Our Artifactory has been set on the port 80 and not 8081. And we use jfrog as Artifactory server.
* Also you need to update the Artifact url `${artifactory_url}/gradle-dev`. Pay attention how you set your gradle repo in your Artifactory. On our side we have call it `gradle-dev
* Don't forget to add in `~/.gradle/gradle.properties` the following lines:
```
artifactory_user=user
artifactory_password=password
artifactory_url=http://articatory-url:8081/artifactory
org.gradle.caching=true
gradle.cache.push=false
```