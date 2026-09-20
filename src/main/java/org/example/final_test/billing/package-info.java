@ApplicationModule(
        type = ApplicationModule.Type.CLOSED,
        allowedDependencies = "payment :: *"
)
package org.example.final_test.billing;

import org.springframework.modulith.ApplicationModule;