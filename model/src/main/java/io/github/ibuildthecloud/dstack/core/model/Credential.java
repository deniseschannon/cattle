/**
 * This class is generated by jOOQ
 */
package io.github.ibuildthecloud.dstack.core.model;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "credential", schema = "dstack")
public interface Credential extends java.io.Serializable {

	/**
	 * Setter for <code>dstack.credential.id</code>. 
	 */
	public void setId(java.lang.Long value);

	/**
	 * Getter for <code>dstack.credential.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	public java.lang.Long getId();

	/**
	 * Setter for <code>dstack.credential.name</code>. 
	 */
	public void setName(java.lang.String value);

	/**
	 * Getter for <code>dstack.credential.name</code>. 
	 */
	@javax.persistence.Column(name = "name", length = 255)
	public java.lang.String getName();

	/**
	 * Setter for <code>dstack.credential.account_id</code>. 
	 */
	public void setAccountId(java.lang.Long value);

	/**
	 * Getter for <code>dstack.credential.account_id</code>. 
	 */
	@javax.persistence.Column(name = "account_id", nullable = false, precision = 19)
	public java.lang.Long getAccountId();

	/**
	 * Setter for <code>dstack.credential.state</code>. 
	 */
	public void setState(java.lang.String value);

	/**
	 * Getter for <code>dstack.credential.state</code>. 
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 255)
	public java.lang.String getState();

	/**
	 * Setter for <code>dstack.credential.kind</code>. 
	 */
	public void setKind(java.lang.String value);

	/**
	 * Getter for <code>dstack.credential.kind</code>. 
	 */
	@javax.persistence.Column(name = "kind", nullable = false, length = 255)
	public java.lang.String getKind();

	/**
	 * Setter for <code>dstack.credential.public_value</code>. 
	 */
	public void setPublicValue(java.lang.String value);

	/**
	 * Getter for <code>dstack.credential.public_value</code>. 
	 */
	@javax.persistence.Column(name = "public_value", nullable = false, length = 16777215)
	public java.lang.String getPublicValue();

	/**
	 * Setter for <code>dstack.credential.secret_value</code>. 
	 */
	public void setSecretValue(java.lang.String value);

	/**
	 * Getter for <code>dstack.credential.secret_value</code>. 
	 */
	@javax.persistence.Column(name = "secret_value", length = 1024)
	public java.lang.String getSecretValue();

	/**
	 * Setter for <code>dstack.credential.created</code>. 
	 */
	public void setCreated(java.sql.Timestamp value);

	/**
	 * Getter for <code>dstack.credential.created</code>. 
	 */
	@javax.persistence.Column(name = "created", nullable = false)
	public java.sql.Timestamp getCreated();

	/**
	 * Setter for <code>dstack.credential.removed</code>. 
	 */
	public void setRemoved(java.sql.Timestamp value);

	/**
	 * Getter for <code>dstack.credential.removed</code>. 
	 */
	@javax.persistence.Column(name = "removed")
	public java.sql.Timestamp getRemoved();

	/**
	 * Setter for <code>dstack.credential.data</code>. 
	 */
	public void setData(java.util.Map<String,Object> value);

	/**
	 * Getter for <code>dstack.credential.data</code>. 
	 */
	@javax.persistence.Column(name = "data", length = 16777215)
	public java.util.Map<String,Object> getData();

	/**
	 * Setter for <code>dstack.credential.uuid</code>. 
	 */
	public void setUuid(java.lang.String value);

	/**
	 * Getter for <code>dstack.credential.uuid</code>. 
	 */
	@javax.persistence.Column(name = "uuid", nullable = false, length = 128)
	public java.lang.String getUuid();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface Credential
	 */
	public void from(io.github.ibuildthecloud.dstack.core.model.Credential from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface Credential
	 */
	public <E extends io.github.ibuildthecloud.dstack.core.model.Credential> E into(E into);
}
