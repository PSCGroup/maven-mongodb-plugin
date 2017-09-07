package com.nesting.maven2.mongodb;

import com.mongodb.DB;
import com.mongodb.Mongo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

import java.io.File;
import java.io.IOException;

/**
 * Mojo for filling databases with data.
 * @goal develop
 */
public class MongoDBDevelopMojo
    extends AbstractMongoDBMojo {

    /**
     * The directory that contains update scripts.
     * @parameter
     * @required
     */
    private File[] dbDevelopScriptsDirectory;

    /**
     * {@inheritDoc}
     */
    public void executeInternal() throws MojoExecutionException, MojoFailureException {
        executeForDirectories(dbDevelopScriptsDirectory);
    }
}
