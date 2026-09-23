@ApplicationModule(
        allowedDependencies = {
                // "student",
               //"student :: *",
                "student :: repository",
        }
)
package org.example.final_test.teacher;
import org.springframework.modulith.ApplicationModule;