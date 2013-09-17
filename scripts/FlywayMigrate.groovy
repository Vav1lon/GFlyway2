includeTargets << new File(gflyway2PluginDir, "scripts/_FlywayInit.groovy")

target(flywayMigrate: "Flyway migrate") {
    depends flywayInit

    flyway.migrate()
}

setDefaultTarget(flywayMigrate)
