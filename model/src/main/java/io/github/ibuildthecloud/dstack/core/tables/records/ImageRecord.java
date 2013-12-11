/**
 * This class is generated by jOOQ
 */
package io.github.ibuildthecloud.dstack.core.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "image", schema = "dstack")
public class ImageRecord extends org.jooq.impl.UpdatableRecordImpl<io.github.ibuildthecloud.dstack.core.tables.records.ImageRecord> implements io.github.ibuildthecloud.dstack.db.jooq.utils.TableRecordJaxb, org.jooq.Record16<java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.sql.Timestamp>, io.github.ibuildthecloud.dstack.core.model.Image {

	private static final long serialVersionUID = -555708681;

	/**
	 * Setter for <code>dstack.image.id</code>. 
	 */
	@Override
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dstack.image.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	@Override
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>dstack.image.name</code>. 
	 */
	@Override
	public void setName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dstack.image.name</code>. 
	 */
	@javax.persistence.Column(name = "name", length = 255)
	@Override
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>dstack.image.uuid</code>. 
	 */
	@Override
	public void setUuid(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>dstack.image.uuid</code>. 
	 */
	@javax.persistence.Column(name = "uuid", nullable = false, length = 255)
	@Override
	public java.lang.String getUuid() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>dstack.image.account_id</code>. 
	 */
	@Override
	public void setAccountId(java.lang.Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>dstack.image.account_id</code>. 
	 */
	@javax.persistence.Column(name = "account_id", nullable = false, precision = 19)
	@Override
	public java.lang.Long getAccountId() {
		return (java.lang.Long) getValue(3);
	}

	/**
	 * Setter for <code>dstack.image.url</code>. 
	 */
	@Override
	public void setUrl(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>dstack.image.url</code>. 
	 */
	@javax.persistence.Column(name = "url", length = 255)
	@Override
	public java.lang.String getUrl() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>dstack.image.description</code>. 
	 */
	@Override
	public void setDescription(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>dstack.image.description</code>. 
	 */
	@javax.persistence.Column(name = "description", length = 1024)
	@Override
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>dstack.image.is_public</code>. 
	 */
	@Override
	public void setIsPublic(java.lang.Boolean value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>dstack.image.is_public</code>. 
	 */
	@javax.persistence.Column(name = "is_public", nullable = false, precision = 1)
	@Override
	public java.lang.Boolean getIsPublic() {
		return (java.lang.Boolean) getValue(6);
	}

	/**
	 * Setter for <code>dstack.image.state</code>. 
	 */
	@Override
	public void setState(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>dstack.image.state</code>. 
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 255)
	@Override
	public java.lang.String getState() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>dstack.image.prepopulate</code>. 
	 */
	@Override
	public void setPrepopulate(java.lang.Boolean value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>dstack.image.prepopulate</code>. 
	 */
	@javax.persistence.Column(name = "prepopulate", nullable = false, precision = 1)
	@Override
	public java.lang.Boolean getPrepopulate() {
		return (java.lang.Boolean) getValue(8);
	}

	/**
	 * Setter for <code>dstack.image.prepopulate_stamp</code>. 
	 */
	@Override
	public void setPrepopulateStamp(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>dstack.image.prepopulate_stamp</code>. 
	 */
	@javax.persistence.Column(name = "prepopulate_stamp", nullable = false, length = 255)
	@Override
	public java.lang.String getPrepopulateStamp() {
		return (java.lang.String) getValue(9);
	}

	/**
	 * Setter for <code>dstack.image.physical_size_bytes</code>. 
	 */
	@Override
	public void setPhysicalSizeBytes(java.lang.Long value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>dstack.image.physical_size_bytes</code>. 
	 */
	@javax.persistence.Column(name = "physical_size_bytes", precision = 19)
	@Override
	public java.lang.Long getPhysicalSizeBytes() {
		return (java.lang.Long) getValue(10);
	}

	/**
	 * Setter for <code>dstack.image.virtual_size_bytes</code>. 
	 */
	@Override
	public void setVirtualSizeBytes(java.lang.Long value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>dstack.image.virtual_size_bytes</code>. 
	 */
	@javax.persistence.Column(name = "virtual_size_bytes", precision = 19)
	@Override
	public java.lang.Long getVirtualSizeBytes() {
		return (java.lang.Long) getValue(11);
	}

	/**
	 * Setter for <code>dstack.image.checksum</code>. 
	 */
	@Override
	public void setChecksum(java.lang.String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>dstack.image.checksum</code>. 
	 */
	@javax.persistence.Column(name = "checksum", length = 255)
	@Override
	public java.lang.String getChecksum() {
		return (java.lang.String) getValue(12);
	}

	/**
	 * Setter for <code>dstack.image.created</code>. 
	 */
	@Override
	public void setCreated(java.sql.Timestamp value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>dstack.image.created</code>. 
	 */
	@javax.persistence.Column(name = "created")
	@Override
	public java.sql.Timestamp getCreated() {
		return (java.sql.Timestamp) getValue(13);
	}

	/**
	 * Setter for <code>dstack.image.removed</code>. 
	 */
	@Override
	public void setRemoved(java.sql.Timestamp value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>dstack.image.removed</code>. 
	 */
	@javax.persistence.Column(name = "removed")
	@Override
	public java.sql.Timestamp getRemoved() {
		return (java.sql.Timestamp) getValue(14);
	}

	/**
	 * Setter for <code>dstack.image.remove_time</code>. 
	 */
	@Override
	public void setRemoveTime(java.sql.Timestamp value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>dstack.image.remove_time</code>. 
	 */
	@javax.persistence.Column(name = "remove_time")
	@Override
	public java.sql.Timestamp getRemoveTime() {
		return (java.sql.Timestamp) getValue(15);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Long> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record16 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row16<java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row16) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row16<java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row16) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return io.github.ibuildthecloud.dstack.core.tables.ImageTable.IMAGE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return io.github.ibuildthecloud.dstack.core.tables.ImageTable.IMAGE.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return io.github.ibuildthecloud.dstack.core.tables.ImageTable.IMAGE.UUID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field4() {
		return io.github.ibuildthecloud.dstack.core.tables.ImageTable.IMAGE.ACCOUNT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return io.github.ibuildthecloud.dstack.core.tables.ImageTable.IMAGE.URL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return io.github.ibuildthecloud.dstack.core.tables.ImageTable.IMAGE.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field7() {
		return io.github.ibuildthecloud.dstack.core.tables.ImageTable.IMAGE.IS_PUBLIC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return io.github.ibuildthecloud.dstack.core.tables.ImageTable.IMAGE.STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field9() {
		return io.github.ibuildthecloud.dstack.core.tables.ImageTable.IMAGE.PREPOPULATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return io.github.ibuildthecloud.dstack.core.tables.ImageTable.IMAGE.PREPOPULATE_STAMP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field11() {
		return io.github.ibuildthecloud.dstack.core.tables.ImageTable.IMAGE.PHYSICAL_SIZE_BYTES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field12() {
		return io.github.ibuildthecloud.dstack.core.tables.ImageTable.IMAGE.VIRTUAL_SIZE_BYTES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field13() {
		return io.github.ibuildthecloud.dstack.core.tables.ImageTable.IMAGE.CHECKSUM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field14() {
		return io.github.ibuildthecloud.dstack.core.tables.ImageTable.IMAGE.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field15() {
		return io.github.ibuildthecloud.dstack.core.tables.ImageTable.IMAGE.REMOVED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field16() {
		return io.github.ibuildthecloud.dstack.core.tables.ImageTable.IMAGE.REMOVE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getUuid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value4() {
		return getAccountId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getUrl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value7() {
		return getIsPublic();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value9() {
		return getPrepopulate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
		return getPrepopulateStamp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value11() {
		return getPhysicalSizeBytes();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value12() {
		return getVirtualSizeBytes();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value13() {
		return getChecksum();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value14() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value15() {
		return getRemoved();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value16() {
		return getRemoveTime();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(io.github.ibuildthecloud.dstack.core.model.Image from) {
		setId(from.getId());
		setName(from.getName());
		setUuid(from.getUuid());
		setAccountId(from.getAccountId());
		setUrl(from.getUrl());
		setDescription(from.getDescription());
		setIsPublic(from.getIsPublic());
		setState(from.getState());
		setPrepopulate(from.getPrepopulate());
		setPrepopulateStamp(from.getPrepopulateStamp());
		setPhysicalSizeBytes(from.getPhysicalSizeBytes());
		setVirtualSizeBytes(from.getVirtualSizeBytes());
		setChecksum(from.getChecksum());
		setCreated(from.getCreated());
		setRemoved(from.getRemoved());
		setRemoveTime(from.getRemoveTime());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends io.github.ibuildthecloud.dstack.core.model.Image> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ImageRecord
	 */
	public ImageRecord() {
		super(io.github.ibuildthecloud.dstack.core.tables.ImageTable.IMAGE);
	}

	/**
	 * Create a detached, initialised ImageRecord
	 */
	public ImageRecord(java.lang.Long id, java.lang.String name, java.lang.String uuid, java.lang.Long accountId, java.lang.String url, java.lang.String description, java.lang.Boolean isPublic, java.lang.String state, java.lang.Boolean prepopulate, java.lang.String prepopulateStamp, java.lang.Long physicalSizeBytes, java.lang.Long virtualSizeBytes, java.lang.String checksum, java.sql.Timestamp created, java.sql.Timestamp removed, java.sql.Timestamp removeTime) {
		super(io.github.ibuildthecloud.dstack.core.tables.ImageTable.IMAGE);

		setValue(0, id);
		setValue(1, name);
		setValue(2, uuid);
		setValue(3, accountId);
		setValue(4, url);
		setValue(5, description);
		setValue(6, isPublic);
		setValue(7, state);
		setValue(8, prepopulate);
		setValue(9, prepopulateStamp);
		setValue(10, physicalSizeBytes);
		setValue(11, virtualSizeBytes);
		setValue(12, checksum);
		setValue(13, created);
		setValue(14, removed);
		setValue(15, removeTime);
	}
}
