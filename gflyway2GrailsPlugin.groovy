class gflyway2GrailsPlugin {
    // the plugin version
    def version = "0.1"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "2.2 > *"
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/views/error.gsp"
            , "grails-app/controllers/"
            , "grails-app/domain/"
            , "grails-app/i18n/"
            , "grails-app/services/"
            , "grails-app/taglib/"
            , "grails-app/utils/"
            , "grails-app/views/"
            , "lib/"
            , "test/"
            , "web-app/"
    ]

    // TODO Fill in these fields
    def title = "gflyway2 Plugin" // Headline display name of the plugin
    def author = "Denis Kuzmin"
    def authorEmail = "vavilon.rus@gmail.com"
    def description = '''\
    Plugin flyway 2 for use in Grails
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/gflyway2-plugin"

    // Extra (optional) plugin metadata

    // License: one of 'APACHE', 'GPL2', 'GPL3'
    def license = "GPL2"

    // Details of company behind the plugin (if there is one)
    def organization = [name: "Vav1lon", url: "http://www.vav1lon.com/"]

    // Any additional developers beyond the author specified above.
    def developers = [[name: "Kuzmin Denis", email: "vavilon.rus@gmail.com"]]

    // Location of the plugin's issue tracker.
//    def issueManagement = [ system: "JIRA", url: "http://jira.grails.org/browse/GPMYPLUGIN" ]

    // Online location of the plugin's browseable source code.
    def scm = [url: "http://svn.codehaus.org/grails-plugins/"]

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
