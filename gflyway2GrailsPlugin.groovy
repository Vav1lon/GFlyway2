class gflyway2GrailsPlugin {

    def version = "0.1"
    def grailsVersion = "2.2 > *"
    def pluginExcludes = [
    ]

    def title = "Grails Flyway 2 Plugin"
    def author = "Denis Kuzmin"
    def authorEmail = "vavilon.rus@gmail.com"
    def description = '''\
    Plugin flyway 2 for use in Grails
'''

    def documentation = "http://grails.org/plugin/gflyway2-plugin"
    def license = "APACHE"

    def organization = [name: "Vav1lon", url: "http://www.vav1lon.com/"]
    def developers = [[name: "Kuzmin Denis", email: "vavilon.rus@gmail.com"], [name: "Bulat Nigmatullin", email: ""]]
    def scm = [url: "https://github.com/Vav1lon/GFlyway2"]

    // Location of the plugin's issue tracker.
//    def issueManagement = [ system: "JIRA", url: "http://jira.grails.org/browse/GPMYPLUGIN" ]

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }

    def onShutdown = { event ->
        // TODO Implement code that is executed when the application shuts down (optional)
    }
}
