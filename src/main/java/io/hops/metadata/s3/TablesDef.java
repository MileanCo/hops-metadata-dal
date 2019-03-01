package io.hops.metadata.s3;

public class TablesDef {
    public interface S3PathMetadataTableDef {
        String TABLE_NAME = "s3_metadata_store";

        String PARENT = "parent";
        String CHILD = "child";
        String IS_DELETED = "is_deleted";
        String BLOCK_SIZE = "block_size";
        String FILE_LENGTH = "file_length";
        String MOD_TIME = "mod_time";
        String IS_DIR = "is_dir";
        String TABLE_CREATED = "table_created";
        String TABLE_VERSION = "table_version";
    }

}
