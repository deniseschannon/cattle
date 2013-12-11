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
@javax.persistence.Table(name = "account", schema = "dstack")
public class AccountRecord extends org.jooq.impl.UpdatableRecordImpl<io.github.ibuildthecloud.dstack.core.tables.records.AccountRecord> implements io.github.ibuildthecloud.dstack.db.jooq.utils.TableRecordJaxb, org.jooq.Record11<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.sql.Timestamp, java.sql.Timestamp, java.sql.Timestamp, java.util.Map<String,Object>, java.lang.String>, io.github.ibuildthecloud.dstack.core.model.Account {

	private static final long serialVersionUID = -593699438;

	/**
	 * Setter for <code>dstack.account.id</code>. 
	 */
	@Override
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dstack.account.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	@Override
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>dstack.account.uuid</code>. 
	 */
	@Override
	public void setUuid(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dstack.account.uuid</code>. 
	 */
	@javax.persistence.Column(name = "uuid", nullable = false, length = 128)
	@Override
	public java.lang.String getUuid() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>dstack.account.kind</code>. 
	 */
	@Override
	public void setKind(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>dstack.account.kind</code>. 
	 */
	@javax.persistence.Column(name = "kind", nullable = false, length = 255)
	@Override
	public java.lang.String getKind() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>dstack.account.name</code>. 
	 */
	@Override
	public void setName(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>dstack.account.name</code>. 
	 */
	@javax.persistence.Column(name = "name", nullable = false, length = 255)
	@Override
	public java.lang.String getName() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>dstack.account.state</code>. 
	 */
	@Override
	public void setState(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>dstack.account.state</code>. 
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 255)
	@Override
	public java.lang.String getState() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>dstack.account.hold_data</code>. 
	 */
	@Override
	public void setHoldData(java.lang.Boolean value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>dstack.account.hold_data</code>. 
	 */
	@javax.persistence.Column(name = "hold_data", nullable = false, precision = 1)
	@Override
	public java.lang.Boolean getHoldData() {
		return (java.lang.Boolean) getValue(5);
	}

	/**
	 * Setter for <code>dstack.account.created</code>. 
	 */
	@Override
	public void setCreated(java.sql.Timestamp value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>dstack.account.created</code>. 
	 */
	@javax.persistence.Column(name = "created")
	@Override
	public java.sql.Timestamp getCreated() {
		return (java.sql.Timestamp) getValue(6);
	}

	/**
	 * Setter for <code>dstack.account.removed</code>. 
	 */
	@Override
	public void setRemoved(java.sql.Timestamp value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>dstack.account.removed</code>. 
	 */
	@javax.persistence.Column(name = "removed")
	@Override
	public java.sql.Timestamp getRemoved() {
		return (java.sql.Timestamp) getValue(7);
	}

	/**
	 * Setter for <code>dstack.account.remove_time</code>. 
	 */
	@Override
	public void setRemoveTime(java.sql.Timestamp value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>dstack.account.remove_time</code>. 
	 */
	@javax.persistence.Column(name = "remove_time")
	@Override
	public java.sql.Timestamp getRemoveTime() {
		return (java.sql.Timestamp) getValue(8);
	}

	/**
	 * Setter for <code>dstack.account.data</code>. 
	 */
	@Override
	public void setData(java.util.Map<String,Object> value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>dstack.account.data</code>. 
	 */
	@javax.persistence.Column(name = "data", length = 16777215)
	@Override
	public java.util.Map<String,Object> getData() {
		return (java.util.Map<String,Object>) getValue(9);
	}

	/**
	 * Setter for <code>dstack.account.description</code>. 
	 */
	@Override
	public void setDescription(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>dstack.account.description</code>. 
	 */
	@javax.persistence.Column(name = "description", length = 255)
	@Override
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(10);
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
	// Record11 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.sql.Timestamp, java.sql.Timestamp, java.sql.Timestamp, java.util.Map<String,Object>, java.lang.String> fieldsRow() {
		return (org.jooq.Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.sql.Timestamp, java.sql.Timestamp, java.sql.Timestamp, java.util.Map<String,Object>, java.lang.String> valuesRow() {
		return (org.jooq.Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return io.github.ibuildthecloud.dstack.core.tables.AccountTable.ACCOUNT.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return io.github.ibuildthecloud.dstack.core.tables.AccountTable.ACCOUNT.UUID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return io.github.ibuildthecloud.dstack.core.tables.AccountTable.ACCOUNT.KIND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return io.github.ibuildthecloud.dstack.core.tables.AccountTable.ACCOUNT.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return io.github.ibuildthecloud.dstack.core.tables.AccountTable.ACCOUNT.STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field6() {
		return io.github.ibuildthecloud.dstack.core.tables.AccountTable.ACCOUNT.HOLD_DATA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field7() {
		return io.github.ibuildthecloud.dstack.core.tables.AccountTable.ACCOUNT.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field8() {
		return io.github.ibuildthecloud.dstack.core.tables.AccountTable.ACCOUNT.REMOVED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field9() {
		return io.github.ibuildthecloud.dstack.core.tables.AccountTable.ACCOUNT.REMOVE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.Map<String,Object>> field10() {
		return io.github.ibuildthecloud.dstack.core.tables.AccountTable.ACCOUNT.DATA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return io.github.ibuildthecloud.dstack.core.tables.AccountTable.ACCOUNT.DESCRIPTION;
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
		return getUuid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getKind();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value6() {
		return getHoldData();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value7() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value8() {
		return getRemoved();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value9() {
		return getRemoveTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.Map<String,Object> value10() {
		return getData();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value11() {
		return getDescription();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(io.github.ibuildthecloud.dstack.core.model.Account from) {
		setId(from.getId());
		setUuid(from.getUuid());
		setKind(from.getKind());
		setName(from.getName());
		setState(from.getState());
		setHoldData(from.getHoldData());
		setCreated(from.getCreated());
		setRemoved(from.getRemoved());
		setRemoveTime(from.getRemoveTime());
		setData(from.getData());
		setDescription(from.getDescription());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends io.github.ibuildthecloud.dstack.core.model.Account> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AccountRecord
	 */
	public AccountRecord() {
		super(io.github.ibuildthecloud.dstack.core.tables.AccountTable.ACCOUNT);
	}

	/**
	 * Create a detached, initialised AccountRecord
	 */
	public AccountRecord(java.lang.Long id, java.lang.String uuid, java.lang.String kind, java.lang.String name, java.lang.String state, java.lang.Boolean holdData, java.sql.Timestamp created, java.sql.Timestamp removed, java.sql.Timestamp removeTime, java.util.Map<String,Object> data, java.lang.String description) {
		super(io.github.ibuildthecloud.dstack.core.tables.AccountTable.ACCOUNT);

		setValue(0, id);
		setValue(1, uuid);
		setValue(2, kind);
		setValue(3, name);
		setValue(4, state);
		setValue(5, holdData);
		setValue(6, created);
		setValue(7, removed);
		setValue(8, removeTime);
		setValue(9, data);
		setValue(10, description);
	}
}
