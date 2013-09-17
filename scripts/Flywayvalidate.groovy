includeTargets << new File(gflyway2PluginDir, "scripts/_FlywayInit.groovy")

target(flywayvalidate: "Flyway init") {
    depends flywayInit

    flyway.validate()
}

setDefaultTarget(flywayvalidate)
