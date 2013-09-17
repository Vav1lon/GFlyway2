grails.project.dependency.resolution = {
    inherits 'global'
    log 'warn'

    repositories {
        grailsPlugins()
        grailsHome()
        grailsCentral()
        mavenCentral()
    }

    dependencies {
        compile 'com.googlecode.flyway:flyway-core:2.2.1'
    }

    plugins {

    }
}
