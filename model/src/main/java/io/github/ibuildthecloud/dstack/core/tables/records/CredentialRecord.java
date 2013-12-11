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
@javax.persistence.Table(name = "credential", schema = "dstack")
public class CredentialRecord extends org.jooq.impl.UpdatableRecordImpl<io.github.ibuildthecloud.dstack.core.tables.records.CredentialRecord> implements io.github.ibuildthecloud.dstack.db.jooq.utils.TableRecordJaxb, org.jooq.Record11<java.lang.Long, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.util.Map<String,Object>, java.lang.String>, io.github.ibuildthecloud.dstack.core.model.Credential {

	private static final long serialVersionUID = 1238617014;

	/**
	 * Setter for <code>dstack.credential.id</code>. 
	 */
	@Override
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dstack.credential.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	@Override
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>dstack.credential.name</code>. 
	 */
	@Override
	public void setName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dstack.credential.name</code>. 
	 */
	@javax.persistence.Column(name = "name", length = 255)
	@Override
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>dstack.credential.account_id</code>. 
	 */
	@Override
	public void setAccountId(java.lang.Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>dstack.credential.account_id</code>. 
	 */
	@javax.persistence.Column(name = "account_id", nullable = false, precision = 19)
	@Override
	public java.lang.Long getAccountId() {
		return (java.lang.Long) getValue(2);
	}

	/**
	 * Setter for <code>dstack.credential.state</code>. 
	 */
	@Override
	public void setState(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>dstack.credential.state</code>. 
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 255)
	@Override
	public java.lang.String getState() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>dstack.credential.kind</code>. 
	 */
	@Override
	public void setKind(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>dstack.credential.kind</code>. 
	 */
	@javax.persistence.Column(name = "kind", nullable = false, length = 255)
	@Override
	public java.lang.String getKind() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>dstack.credential.public_value</code>. 
	 */
	@Override
	public void setPublicValue(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>dstack.credential.public_value</code>. 
	 */
	@javax.persistence.Column(name = "public_value", nullable = false, length = 16777215)
	@Override
	public java.lang.String getPublicValue() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>dstack.credential.secret_value</code>. 
	 */
	@Override
	public void setSecretValue(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>dstack.credential.secret_value</code>. 
	 */
	@javax.persistence.Column(name = "secret_value", length = 1024)
	@Override
	public java.lang.String getSecretValue() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>dstack.credential.created</code>. 
	 */
	@Override
	public void setCreated(java.sql.Timestamp value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>dstack.credential.created</code>. 
	 */
	@javax.persistence.Column(name = "created", nullable = false)
	@Override
	public java.sql.Timestamp getCreated() {
		return (java.sql.Timestamp) getValue(7);
	}

	/**
	 * Setter for <code>dstack.credential.removed</code>. 
	 */
	@Override
	public void setRemoved(java.sql.Timestamp value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>dstack.credential.removed</code>. 
	 */
	@javax.persistence.Column(name = "removed")
	@Override
	public java.sql.Timestamp getRemoved() {
		return (java.sql.Timestamp) getValue(8);
	}

	/**
	 * Setter for <code>dstack.credential.data</code>. 
	 */
	@Override
	public void setData(java.util.Map<String,Object> value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>dstack.credential.data</code>. 
	 */
	@javax.persistence.Column(name = "data", length = 16777215)
	@Override
	public java.util.Map<String,Object> getData() {
		return (java.util.Map<String,Object>) getValue(9);
	}

	/**
	 * Setter for <code>dstack.credential.uuid</code>. 
	 */
	@Override
	public void setUuid(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>dstack.credential.uuid</code>. 
	 */
	@javax.persistence.Column(name = "uuid", nullable = false, length = 128)
	@Override
	public java.lang.String getUuid() {
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
	public org.jooq.Row11<java.lang.Long, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.util.Map<String,Object>, java.lang.String> fieldsRow() {
		return (org.jooq.Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.lang.Long, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.util.Map<String,Object>, java.lang.String> valuesRow() {
		return (org.jooq.Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return io.github.ibuildthecloud.dstack.core.tables.CredentialTable.CREDENTIAL.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return io.github.ibuildthecloud.dstack.core.tables.CredentialTable.CREDENTIAL.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field3() {
		return io.github.ibuildthecloud.dstack.core.tables.CredentialTable.CREDENTIAL.ACCOUNT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return io.github.ibuildthecloud.dstack.core.tables.CredentialTable.CREDENTIAL.STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return io.github.ibuildthecloud.dstack.core.tables.CredentialTable.CREDENTIAL.KIND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return io.github.ibuildthecloud.dstack.core.tables.CredentialTable.CREDENTIAL.PUBLIC_VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return io.github.ibuildthecloud.dstack.core.tables.CredentialTable.CREDENTIAL.SECRET_VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field8() {
		return io.github.ibuildthecloud.dstack.core.tables.CredentialTable.CREDENTIAL.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field9() {
		return io.github.ibuildthecloud.dstack.core.tables.CredentialTable.CREDENTIAL.REMOVED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.Map<String,Object>> field10() {
		return io.github.ibuildthecloud.dstack.core.tables.CredentialTable.CREDENTIAL.DATA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return io.github.ibuildthecloud.dstack.core.tables.CredentialTable.CREDENTIAL.UUID;
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
	public java.lang.Long value3() {
		return getAccountId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getKind();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getPublicValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getSecretValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value8() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value9() {
		return getRemoved();
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
		return getUuid();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(io.github.ibuildthecloud.dstack.core.model.Credential from) {
		setId(from.getId());
		setName(from.getName());
		setAccountId(from.getAccountId());
		setState(from.getState());
		setKind(from.getKind());
		setPublicValue(from.getPublicValue());
		setSecretValue(from.getSecretValue());
		setCreated(from.getCreated());
		setRemoved(from.getRemoved());
		setData(from.getData());
		setUuid(from.getUuid());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends io.github.ibuildthecloud.dstack.core.model.Credential> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CredentialRecord
	 */
	public CredentialRecord() {
		super(io.github.ibuildthecloud.dstack.core.tables.CredentialTable.CREDENTIAL);
	}

	/**
	 * Create a detached, initialised CredentialRecord
	 */
	public CredentialRecord(java.lang.Long id, java.lang.String name, java.lang.Long accountId, java.lang.String state, java.lang.String kind, java.lang.String publicValue, java.lang.String secretValue, java.sql.Timestamp created, java.sql.Timestamp removed, java.util.Map<String,Object> data, java.lang.String uuid) {
		super(io.github.ibuildthecloud.dstack.core.tables.CredentialTable.CREDENTIAL);

		setValue(0, id);
		setValue(1, name);
		setValue(2, accountId);
		setValue(3, state);
		setValue(4, kind);
		setValue(5, publicValue);
		setValue(6, secretValue);
		setValue(7, created);
		setValue(8, removed);
		setValue(9, data);
		setValue(10, uuid);
	}
}
