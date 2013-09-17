includeTargets << new File(gflyway2PluginDir, "scripts/_FlywayInit.groovy")

target(flywayRepair: "Flyway init") {
    depends flywayInit

    flyway.repair()
}

setDefaultTarget(flywayRepair)
