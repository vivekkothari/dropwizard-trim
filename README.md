# dropwizard-trim
This bundle trims config values of dropwizard YAML config file.

## Usage
This makes it easier perform rolling deployments & maintenance of dropwizard applications

### Build instructions
  - Clone the source:

        git clone github.com/vivekkothari/dropwizard-trim

  - Build

        mvn install

### Maven Dependency
* Use the following maven dependency:
```
<dependency>
    <groupId>com.github.vivekkothari</groupId>
    <artifactId>dropwizard-trim</artifactId>
    <version>1.0.0-rc4</version>
</dependency>
```

### Using Trim bundle

#### Bootstrap
```java
    @Override
    public void initialize(final Bootstrap...) {
        bootstrap.addBundle(new ConfigTrimmingBundle());
    }
```
