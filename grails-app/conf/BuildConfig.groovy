grails.project.work.dir = 'target'

grails.project.dependency.resolver = "maven"

grails.project.dependency.resolution = {

    inherits 'global'
    log 'warn'

    repositories {
        grailsCentral()
        mavenLocal()
        mavenCentral()
    }

    dependencies {
        compile 'org.flywaydb:flyway-core:3.0'
    }

    plugins {
        build(":release:3.0.1", ":rest-client-builder:1.0.3") {
            export = false
        }
    }

}