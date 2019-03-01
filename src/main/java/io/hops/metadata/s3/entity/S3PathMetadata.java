package io.hops.metadata.s3.entity;

public final class S3PathMetadata {
    // required params
    public String parent;
    public String child;
    public boolean isDeleted;

    // optional params
    public long blockSize = 0;
    public long fileLength = 0;
    public long modTime = 0;
    public boolean isDir = false;

    // always null except 1 row named ../VERSION
    public long tableCreated;
    public long tableVersion;



    public S3PathMetadata(String parent, String child, boolean isDeleted, long blockSize, long fileLength, long mod_time, boolean isDir, long tableCreated, long tableVersion) {
        this.parent = parent;
        this.child = child;
        this.isDeleted = isDeleted;
        this.blockSize = blockSize;
        this.fileLength = fileLength;
        this.modTime = mod_time;
        this.isDir = isDir;
        this.tableCreated = tableCreated;
        this.tableVersion = tableVersion;
    }


    public String getParent() {
        return parent;
    }

    public String getChild() {
        return child;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public long getBlockSize() {
        return blockSize;
    }

    public long getFileLength() {
        return fileLength;
    }

    public long getModTime() {
        return modTime;
    }

    public boolean isDir() {
        return isDir;
    }

    public long getTableCreated() {
        return tableCreated;
    }

    public long getTableVersion() {
        return tableVersion;
    }



}
