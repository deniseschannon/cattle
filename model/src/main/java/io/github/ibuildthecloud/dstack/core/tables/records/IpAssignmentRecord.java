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
@javax.persistence.Table(name = "ip_assignment", schema = "dstack")
public class IpAssignmentRecord extends org.jooq.impl.UpdatableRecordImpl<io.github.ibuildthecloud.dstack.core.tables.records.IpAssignmentRecord> implements io.github.ibuildthecloud.dstack.db.jooq.utils.TableRecordJaxb, org.jooq.Record7<java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.sql.Timestamp, java.sql.Timestamp>, io.github.ibuildthecloud.dstack.core.model.IpAssignment {

	private static final long serialVersionUID = -925430086;

	/**
	 * Setter for <code>dstack.ip_assignment.id</code>. 
	 */
	@Override
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dstack.ip_assignment.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	@Override
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>dstack.ip_assignment.state</code>. 
	 */
	@Override
	public void setState(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dstack.ip_assignment.state</code>. 
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 255)
	@Override
	public java.lang.String getState() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>dstack.ip_assignment.nic_id</code>. 
	 */
	@Override
	public void setNicId(java.lang.Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>dstack.ip_assignment.nic_id</code>. 
	 */
	@javax.persistence.Column(name = "nic_id", precision = 19)
	@Override
	public java.lang.Long getNicId() {
		return (java.lang.Long) getValue(2);
	}

	/**
	 * Setter for <code>dstack.ip_assignment.account_id</code>. 
	 */
	@Override
	public void setAccountId(java.lang.Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>dstack.ip_assignment.account_id</code>. 
	 */
	@javax.persistence.Column(name = "account_id", nullable = false, precision = 19)
	@Override
	public java.lang.Long getAccountId() {
		return (java.lang.Long) getValue(3);
	}

	/**
	 * Setter for <code>dstack.ip_assignment.ip_address_id</code>. 
	 */
	@Override
	public void setIpAddressId(java.lang.Long value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>dstack.ip_assignment.ip_address_id</code>. 
	 */
	@javax.persistence.Column(name = "ip_address_id", nullable = false, precision = 19)
	@Override
	public java.lang.Long getIpAddressId() {
		return (java.lang.Long) getValue(4);
	}

	/**
	 * Setter for <code>dstack.ip_assignment.created</code>. 
	 */
	@Override
	public void setCreated(java.sql.Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>dstack.ip_assignment.created</code>. 
	 */
	@javax.persistence.Column(name = "created", nullable = false)
	@Override
	public java.sql.Timestamp getCreated() {
		return (java.sql.Timestamp) getValue(5);
	}

	/**
	 * Setter for <code>dstack.ip_assignment.removed</code>. 
	 */
	@Override
	public void setRemoved(java.sql.Timestamp value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>dstack.ip_assignment.removed</code>. 
	 */
	@javax.persistence.Column(name = "removed")
	@Override
	public java.sql.Timestamp getRemoved() {
		return (java.sql.Timestamp) getValue(6);
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
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.sql.Timestamp, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.sql.Timestamp, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return io.github.ibuildthecloud.dstack.core.tables.IpAssignmentTable.IP_ASSIGNMENT.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return io.github.ibuildthecloud.dstack.core.tables.IpAssignmentTable.IP_ASSIGNMENT.STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field3() {
		return io.github.ibuildthecloud.dstack.core.tables.IpAssignmentTable.IP_ASSIGNMENT.NIC_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field4() {
		return io.github.ibuildthecloud.dstack.core.tables.IpAssignmentTable.IP_ASSIGNMENT.ACCOUNT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field5() {
		return io.github.ibuildthecloud.dstack.core.tables.IpAssignmentTable.IP_ASSIGNMENT.IP_ADDRESS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field6() {
		return io.github.ibuildthecloud.dstack.core.tables.IpAssignmentTable.IP_ASSIGNMENT.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field7() {
		return io.github.ibuildthecloud.dstack.core.tables.IpAssignmentTable.IP_ASSIGNMENT.REMOVED;
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
		return getState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value3() {
		return getNicId();
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
	public java.lang.Long value5() {
		return getIpAddressId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value6() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value7() {
		return getRemoved();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(io.github.ibuildthecloud.dstack.core.model.IpAssignment from) {
		setId(from.getId());
		setState(from.getState());
		setNicId(from.getNicId());
		setAccountId(from.getAccountId());
		setIpAddressId(from.getIpAddressId());
		setCreated(from.getCreated());
		setRemoved(from.getRemoved());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends io.github.ibuildthecloud.dstack.core.model.IpAssignment> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached IpAssignmentRecord
	 */
	public IpAssignmentRecord() {
		super(io.github.ibuildthecloud.dstack.core.tables.IpAssignmentTable.IP_ASSIGNMENT);
	}

	/**
	 * Create a detached, initialised IpAssignmentRecord
	 */
	public IpAssignmentRecord(java.lang.Long id, java.lang.String state, java.lang.Long nicId, java.lang.Long accountId, java.lang.Long ipAddressId, java.sql.Timestamp created, java.sql.Timestamp removed) {
		super(io.github.ibuildthecloud.dstack.core.tables.IpAssignmentTable.IP_ASSIGNMENT);

		setValue(0, id);
		setValue(1, state);
		setValue(2, nicId);
		setValue(3, accountId);
		setValue(4, ipAddressId);
		setValue(5, created);
		setValue(6, removed);
	}
}
