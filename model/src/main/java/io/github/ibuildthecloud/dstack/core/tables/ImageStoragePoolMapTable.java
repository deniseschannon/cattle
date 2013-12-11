/**
 * This class is generated by jOOQ
 */
package io.github.ibuildthecloud.dstack.core.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ImageStoragePoolMapTable extends org.jooq.impl.TableImpl<io.github.ibuildthecloud.dstack.core.tables.records.ImageStoragePoolMapRecord> {

	private static final long serialVersionUID = 1518638740;

	/**
	 * The singleton instance of <code>dstack.image_storage_pool_map</code>
	 */
	public static final io.github.ibuildthecloud.dstack.core.tables.ImageStoragePoolMapTable IMAGE_STORAGE_POOL_MAP = new io.github.ibuildthecloud.dstack.core.tables.ImageStoragePoolMapTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<io.github.ibuildthecloud.dstack.core.tables.records.ImageStoragePoolMapRecord> getRecordType() {
		return io.github.ibuildthecloud.dstack.core.tables.records.ImageStoragePoolMapRecord.class;
	}

	/**
	 * The column <code>dstack.image_storage_pool_map.id</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.tables.records.ImageStoragePoolMapRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>dstack.image_storage_pool_map.template_id</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.tables.records.ImageStoragePoolMapRecord, java.lang.Long> TEMPLATE_ID = createField("template_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>dstack.image_storage_pool_map.storage_pool_id</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.tables.records.ImageStoragePoolMapRecord, java.lang.Long> STORAGE_POOL_ID = createField("storage_pool_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>dstack.image_storage_pool_map.progress</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.tables.records.ImageStoragePoolMapRecord, java.lang.String> PROGRESS = createField("progress", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>dstack.image_storage_pool_map.resource_state</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.tables.records.ImageStoragePoolMapRecord, java.lang.String> RESOURCE_STATE = createField("resource_state", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>dstack.image_storage_pool_map.location</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.tables.records.ImageStoragePoolMapRecord, java.lang.String> LOCATION = createField("location", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>dstack.image_storage_pool_map.created</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.tables.records.ImageStoragePoolMapRecord, java.sql.Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>dstack.image_storage_pool_map.billing_start</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.tables.records.ImageStoragePoolMapRecord, java.sql.Timestamp> BILLING_START = createField("billing_start", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>dstack.image_storage_pool_map.billing_end</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.tables.records.ImageStoragePoolMapRecord, java.sql.Timestamp> BILLING_END = createField("billing_end", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>dstack.image_storage_pool_map.removed</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.tables.records.ImageStoragePoolMapRecord, java.sql.Timestamp> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>dstack.image_storage_pool_map.resource_remove_schedule</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.tables.records.ImageStoragePoolMapRecord, java.sql.Timestamp> RESOURCE_REMOVE_SCHEDULE = createField("resource_remove_schedule", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>dstack.image_storage_pool_map.resource_removed</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.tables.records.ImageStoragePoolMapRecord, java.sql.Timestamp> RESOURCE_REMOVED = createField("resource_removed", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>dstack.image_storage_pool_map.remove_locked</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.tables.records.ImageStoragePoolMapRecord, java.lang.Boolean> REMOVE_LOCKED = createField("remove_locked", org.jooq.impl.SQLDataType.BIT.nullable(false).defaulted(true), this);

	/**
	 * Create a <code>dstack.image_storage_pool_map</code> table reference
	 */
	public ImageStoragePoolMapTable() {
		super("image_storage_pool_map", io.github.ibuildthecloud.dstack.core.DstackTable.DSTACK);
	}

	/**
	 * Create an aliased <code>dstack.image_storage_pool_map</code> table reference
	 */
	public ImageStoragePoolMapTable(java.lang.String alias) {
		super(alias, io.github.ibuildthecloud.dstack.core.DstackTable.DSTACK, io.github.ibuildthecloud.dstack.core.tables.ImageStoragePoolMapTable.IMAGE_STORAGE_POOL_MAP);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<io.github.ibuildthecloud.dstack.core.tables.records.ImageStoragePoolMapRecord, java.lang.Long> getIdentity() {
		return io.github.ibuildthecloud.dstack.core.Keys.IDENTITY_IMAGE_STORAGE_POOL_MAP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.core.tables.records.ImageStoragePoolMapRecord> getPrimaryKey() {
		return io.github.ibuildthecloud.dstack.core.Keys.KEY_IMAGE_STORAGE_POOL_MAP_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.core.tables.records.ImageStoragePoolMapRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.core.tables.records.ImageStoragePoolMapRecord>>asList(io.github.ibuildthecloud.dstack.core.Keys.KEY_IMAGE_STORAGE_POOL_MAP_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<io.github.ibuildthecloud.dstack.core.tables.records.ImageStoragePoolMapRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<io.github.ibuildthecloud.dstack.core.tables.records.ImageStoragePoolMapRecord, ?>>asList(io.github.ibuildthecloud.dstack.core.Keys.FK_TEMPLATE_STORAGE_POOL_MAP_TEMPLATE_ID, io.github.ibuildthecloud.dstack.core.Keys.FK_TEMPLATE_STORAGE_POOL_MAP_STORAGE_POOL_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public io.github.ibuildthecloud.dstack.core.tables.ImageStoragePoolMapTable as(java.lang.String alias) {
		return new io.github.ibuildthecloud.dstack.core.tables.ImageStoragePoolMapTable(alias);
	}
}
