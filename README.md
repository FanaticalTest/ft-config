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
./gradlew build
```

## Jenkins
The project have a `Jenkinsfile` that allows you to [setup a pipeline job](https://ziridis.atlassian.net/wiki/spaces/FT/pages/288292869/Jenkins+Pipeline+Setup).