package com.nesting.maven2.mongodb;

import java.io.File;
import java.io.IOException;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

import com.mongodb.DB;
import com.mongodb.Mongo;

/**
 * Mojo for filling databases with data.
 * @goal update
 */
public class MongoDBUpdateMojo
    extends AbstractMongoDBMojo {

    /**
     * The directory that contains update scripts.
     * @parameter
     * @required
     */
    private File[] dbUpdateScriptsDirectory;

    /**
     * {@inheritDoc}
     */
    public void executeInternal() throws MojoExecutionException, MojoFailureException {
        executeForDirectories(dbUpdateScriptsDirectory);
    }
}
