package io.hops.metadata.s3.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

import java.util.List;

public interface S3MetadataAccess<T> extends EntityDataAccess {

    public T getPath(String parent, String child) throws StorageException;
    public boolean putPath(T path) throws StorageException;
    public boolean deletePath(String parent, String child) throws StorageException;

    // https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_BatchWriteItem.html
    public boolean putPaths(List<T> paths) throws StorageException;
    public boolean deletePaths(List<List<String>> paths) throws StorageException;

    public boolean isDirEmpty(String parent, String child) throws StorageException;
    public boolean deleteTable(String table_name) throws StorageException ;


    public List<T> getExpiredFiles(long modTime) throws StorageException;

    public List<T> getPathChildren(String parent) throws StorageException;


}
