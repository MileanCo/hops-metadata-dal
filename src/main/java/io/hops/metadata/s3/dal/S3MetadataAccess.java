package io.hops.metadata.s3.dal;

import io.hops.metadata.common.EntityDataAccess;

import java.util.List;

public interface S3MetadataAccess<T> extends EntityDataAccess {

    public T getPath(String parent, String child);
    public boolean putPath(T path);
    public boolean deletePath(String parent, String child);

    // https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_BatchWriteItem.html
    public boolean putPaths(List<T> paths);
    public boolean deletePaths(List<List<String>> paths);

    public boolean isDirEmpty(String parent, String child);
    public boolean deleteTable(String table_name);


    public List<T> getExpiredFiles(long modTime);

    public List<T> getPathChildren(String parent);


}
