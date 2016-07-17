# dropwizard-trim [![Build Status](https://travis-ci.org/vivekkothari/dropwizard-trim.svg?branch=master)](https://travis-ci.org/vivekkothari/dropwizard-trim) [![Coverage Status](https://coveralls.io/repos/github/vivekkothari/dropwizard-trim/badge.svg?branch=master)](https://coveralls.io/github/vivekkothari/dropwizard-trim?branch=master)

This bundle trims config values of dropwizard YAML config file.

## Usage
This makes it easier to make the application not break due to manual errors when sleepy DevOps adds a space to a config value

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
