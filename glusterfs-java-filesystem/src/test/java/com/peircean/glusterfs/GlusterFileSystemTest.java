package com.peircean.glusterfs;

import junit.framework.TestCase;
import org.junit.Test;

import java.nio.file.FileSystem;

/**
 * @author <a href="http://about.me/louiszuckerman">Louis Zuckerman</a>
 */
public class GlusterFileSystemTest extends TestCase {
    @Test
    public void testGetSeparator() {
        FileSystem g = new GlusterFileSystem();
        assertEquals("/", g.getSeparator());
    }
}