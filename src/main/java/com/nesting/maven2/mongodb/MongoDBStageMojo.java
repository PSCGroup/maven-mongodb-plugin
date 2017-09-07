package com.nesting.maven2.mongodb;

import com.mongodb.DB;
import com.mongodb.Mongo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

import java.io.File;
import java.io.IOException;

/**
 * Mojo for filling databases with data.
 * @goal stage
 */
public class MongoDBStageMojo
    extends AbstractMongoDBMojo {

    /**
     * The directory that contains update scripts.
     * @parameter
     */
    private File[] dbStageScriptsDirectory;

    /**
     * {@inheritDoc}
     */
    public void executeInternal() throws MojoExecutionException, MojoFailureException {
        executeForDirectories(dbStageScriptsDirectory);
    }
}
