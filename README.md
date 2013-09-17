GFlyway2
=========

Plugin flyway 2 for use in Grails

Installation

You need add this code to Config.groovy

    appenders {
            console name: 'stdout', layout: pattern(conversionPattern: '%m%n')
        }
    info 'com.googlecode.flyway'


Configuration

By default you need add yours sql file to folder: grails-app/conf/db/migration/


Allows you to use the basic commands:
 - clean (Drops all objects in the configured schemas)
 - init	(Creates and initializes the metadata table)
 - migrate (Migrates the database)
 - validate	(Validates the applied migrations against the ones available on the classpath)
 - info	(Prints the details and status information about all the migrations)
 - repair (Repairs the metadata table after a failed migration)

    original site: http://flywaydb.org/documentation/commandline/

Added a new command:
 - combo (executes the commands in sequence [clean, init, migrate])

How to use

    You must Grails team starts with 'flyway-'