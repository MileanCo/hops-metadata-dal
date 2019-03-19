package io.hops.metadata.s3.entity;

// represents a row in NDB
public final class S3PathMeta {
    // required params
    public String bucket;
    public String parent;
    public String child;

    // optional params
    public boolean isDeleted;
    public boolean isDir = false;
    public long blockSize = 0;
    public long fileLength = 0;
    public long modTime = System.currentTimeMillis();

    // always null except 1 row named ../VERSION
    public long tableCreated;
    public long tableVersion;


    // used by PBHelper to retrieve data
    public S3PathMeta(String parent, String child, String bucket, boolean isDeleted, boolean isDir, long blockSize, long fileLength, long mod_time, long tableCreated, long tableVersion) {
        this.parent = parent;
        this.child = child;
        this.bucket = bucket;
        this.isDeleted = isDeleted;
        this.blockSize = blockSize;
        this.fileLength = fileLength;
        this.modTime = mod_time;
        this.isDir = isDir;
        this.tableCreated = tableCreated;
        this.tableVersion = tableVersion;
    }

    // used to create new objects
    public S3PathMeta(String parent, String child, String bucket, boolean isDeleted, boolean isDir, long blockSize, long fileLength, long mod_time) {
        this.parent = parent;
        this.child = child;
        this.bucket = bucket;
        this.isDeleted = isDeleted;
        this.blockSize = blockSize;
        this.fileLength = fileLength;
        this.modTime = mod_time;
        this.isDir = isDir;
    }

    public S3PathMeta(String parent, String child, String bucket, boolean isDeleted, boolean isDir, long blockSize, long fileLength ) {
        this.parent = parent;
        this.child = child;
        this.bucket = bucket;
        this.isDeleted = isDeleted;
        this.blockSize = blockSize;
        this.fileLength = fileLength;
        this.isDir = isDir;
    }

    public S3PathMeta(String parent, String child, String bucket, boolean isDeleted, boolean isDir) {
        this.parent = parent;
        this.child = child;
        this.bucket = bucket;
        this.isDeleted = isDeleted;
        this.isDir = isDir;
    }

    public S3PathMeta() {

    }

    @Override
    public String toString() {
        return this.bucket + ":" + this.parent + "/" + this.child;
    }


    public String getParent() {
        return parent;
    }

    public String getChild() {
        return child;
    }

    public String getBucket() {
        return bucket;
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
