package com.google.checkstyle.test.chapter3filestructure.rule331nowildcard;

import java.io.File;
import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

import com.google.checkstyle.test.base.BaseCheckTestSupport;
import com.google.checkstyle.test.base.ConfigurationBuilder;
import com.puppycrawl.tools.checkstyle.api.CheckstyleException;
import com.puppycrawl.tools.checkstyle.api.Configuration;
import com.puppycrawl.tools.checkstyle.checks.imports.AvoidStarImportCheck;

public class AvoidStarImportTest extends BaseCheckTestSupport{
    
    static ConfigurationBuilder builder;
    
    @BeforeClass
    public static void setConfigurationBuilder() throws CheckstyleException {
        builder = new ConfigurationBuilder(new File("src/"),
                "checkstyle_google_style.xml");
    }

    @Test
    public void emptyTest() throws IOException, Exception {

        final String[] expected = {
            "7: Using the '.*' form of import should be avoided - java.io.*.",
            "8: Using the '.*' form of import should be avoided - java.lang.*.",
            "22: Using the '.*' form of import should be avoided - javax.swing.WindowConstants.*.",
            "23: Using the '.*' form of import should be avoided - javax.swing.WindowConstants.*.",
        };
        
        Configuration checkConfig = builder.getCheckConfig("AvoidStarImport");
        String filePath = builder.getFilePath("AvoidStarImportInput");
        
        verify(checkConfig, filePath, expected);
    }
}
