package sm.cloud.common

import org.springframework.context.ApplicationContextInitializer
import org.springframework.context.ConfigurableApplicationContext

class RejectProfileAppInitializer : ApplicationContextInitializer<ConfigurableApplicationContext> {

    override fun initialize(applicationContext: ConfigurableApplicationContext) {
        if (applicationContext.environment.activeProfiles.isEmpty())
            throw RuntimeException("Please select profile")
    }
}
