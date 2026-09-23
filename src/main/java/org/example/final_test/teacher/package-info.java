@ApplicationModule(
        allowedDependencies = {
                "student",
               "student :: *",
                // "student :: repository",
               // "student :: controller"
        }
)
package org.example.final_test.teacher;
import org.springframework.modulith.ApplicationModule;