package io.hops.metadata.s3.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

import java.util.List;

public interface S3PathMetaDataAccess<T> extends EntityDataAccess {

    public T getPath(String parent, String child, String bucket) throws StorageException;
    public void putPath(T path) throws StorageException;
    public void deletePath(String parent, String child, String bucket) throws StorageException;

    // https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_BatchWriteItem.html
    public void putPaths(List<T> paths) throws StorageException;
    public void deletePaths(List<T> paths) throws StorageException;

    public boolean isDirEmpty(String parent, String child, String bucket) throws StorageException;
    public void deleteBucket(String bucketName) throws StorageException ;


    public List<T> getExpiredFiles(long modTime, String bucket) throws StorageException;

    public List<T> getPathChildren(String parent, String bucket) throws StorageException;


}
