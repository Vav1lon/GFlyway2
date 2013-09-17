package gflyway2

class GFlyway {

    def config

    public void clean() {
        FlywayClean flyway = new FlywayClean(config)
        flyway.execute()
    }

    public void init() {
        FlywayInit flyway = new FlywayInit(config)
        flyway.execute()
    }

    public void migrate() {
        FlywayMigrate flyway = new FlywayMigrate(config)
        flyway.execute()
    }

    public void info() {
        FlywayInfo flyway = new FlywayInfo(config)
        flyway.execute()
    }

    public void validate() {
        FlywayValidate flyway = new FlywayValidate(config)
        flyway.execute()
    }

    public void repair() {
        FlywayValidate flyway = new FlywayValidate(config)
        flyway.execute()
    }

}
