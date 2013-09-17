package gflyway2

class GFlyway {

    def config

    void clean() {
        new FlywayClean(config).execute()
    }

    void init() {
        new FlywayInit(config).execute()
    }

    void migrate() {
        new FlywayMigrate(config).execute()
    }

    void info() {
        new FlywayInfo(config).execute()
    }

    void validate() {
        new FlywayValidate(config).execute()
    }

    void repair() {
        new FlywayValidate(config).execute()
    }
}
