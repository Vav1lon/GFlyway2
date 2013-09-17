includeTargets << new File(gflyway2PluginDir, "scripts/_FlywayInit.groovy")

target(flywayClean: "Drop all database objects") {
    depends flywayInit

    flyway.clean()
}

setDefaultTarget(flywayClean)
