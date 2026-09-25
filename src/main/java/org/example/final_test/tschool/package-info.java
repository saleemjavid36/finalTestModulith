@ApplicationModule(

        allowedDependencies = {
                "student :: repository",
                "student",
                "student :: controller",
                "student :: dto"
        })
package org.example.final_test.tschool;
import org.springframework.modulith.ApplicationModule;