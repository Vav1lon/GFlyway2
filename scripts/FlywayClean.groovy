includeTargets << new File("$gflyway2PluginDir/scripts/_FlywayInit.groovy")

target(main: "Drop all database objects") {
    depends flywayInit

    flyway.clean()
}

setDefaultTarget(main)
