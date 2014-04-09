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

It's possible to configure Flyway using Config.groovy. The code below show you which variables are availables.

		grails.plugins.gflyway.initOnMigrate = true;
		grails.plugins.gflyway.schemas = "public"
		grails.plugins.gflyway.table = "schema_version"
		grails.plugins.gflyway.locations = "db/migration"
		grails.plugins.gflyway.encoding = "UTF-8"
		grails.plugins.gflyway.sqlMigrationPrefix = "V"
		grails.plugins.gflyway.sqlMigrationSuffix = ".sql"
		grails.plugins.gflyway.validationErrorMode = "FAIL"
		grails.plugins.gflyway.autoMigrate = true;


How to use
-------------------------

    You must start in Grails console with 'flyway-' argument


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
