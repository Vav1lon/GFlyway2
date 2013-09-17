includeTargets << new File("$gflyway2PluginDir/scripts/_FlywayInit.groovy")

target(main: "Flyway migrate") {
    depends flywayInit

    flyway.migrate()
}

setDefaultTarget(main)
