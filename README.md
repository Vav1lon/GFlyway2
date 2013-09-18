GFlyway2
=========

Plugin flyway 2 for use in Grails

Installation
-------------------------

You need to modify Config.groovy configuration file by adding in section log4j next code:

    appenders {
        console name: 'stdout', layout: pattern(conversionPattern: '%m%n')
    }
    info 'com.googlecode.flyway'


Configuration
-------------------------

 By default you should put your sql file into this folder: grails-app/conf/db/migration/


How to use
-------------------------

    You must start Grails with 'flyway-' argument


Basic commands:
 - flyway-clean (Drops all objects in the configured schemas)
 - flyway-init	(Creates and initializes the metadata table)
 - flyway-migrate (Migrates the database)
 - flyway-validate	(Validates the applied migrations against the ones available on the classpath)
 - flyway-info	(Prints the details and status information about all the migrations)
 - flyway-repair (Repairs the metadata table after a failed migration)

    original site: http://flywaydb.org/documentation/commandline/

Added a new command:
 - flyway-combo (executes [clean, init, migrate] commands)
