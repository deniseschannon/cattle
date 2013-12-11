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
public class AgentGroupTable extends org.jooq.impl.TableImpl<io.github.ibuildthecloud.dstack.core.tables.records.AgentGroupRecord> {

	private static final long serialVersionUID = -774953141;

	/**
	 * The singleton instance of <code>dstack.agent_group</code>
	 */
	public static final io.github.ibuildthecloud.dstack.core.tables.AgentGroupTable AGENT_GROUP = new io.github.ibuildthecloud.dstack.core.tables.AgentGroupTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<io.github.ibuildthecloud.dstack.core.tables.records.AgentGroupRecord> getRecordType() {
		return io.github.ibuildthecloud.dstack.core.tables.records.AgentGroupRecord.class;
	}

	/**
	 * The column <code>dstack.agent_group.id</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.tables.records.AgentGroupRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>dstack.agent_group.name</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.tables.records.AgentGroupRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>dstack.agent_group.description</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.tables.records.AgentGroupRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this);

	/**
	 * The column <code>dstack.agent_group.data</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.tables.records.AgentGroupRecord, java.util.Map<String,Object>> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB.length(16777215).asConvertedDataType(new io.github.ibuildthecloud.dstack.db.jooq.converter.DataConverter()), this);

	/**
	 * The column <code>dstack.agent_group.state</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.tables.records.AgentGroupRecord, java.lang.String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * Create a <code>dstack.agent_group</code> table reference
	 */
	public AgentGroupTable() {
		super("agent_group", io.github.ibuildthecloud.dstack.core.DstackTable.DSTACK);
	}

	/**
	 * Create an aliased <code>dstack.agent_group</code> table reference
	 */
	public AgentGroupTable(java.lang.String alias) {
		super(alias, io.github.ibuildthecloud.dstack.core.DstackTable.DSTACK, io.github.ibuildthecloud.dstack.core.tables.AgentGroupTable.AGENT_GROUP);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<io.github.ibuildthecloud.dstack.core.tables.records.AgentGroupRecord, java.lang.Long> getIdentity() {
		return io.github.ibuildthecloud.dstack.core.Keys.IDENTITY_AGENT_GROUP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.core.tables.records.AgentGroupRecord> getPrimaryKey() {
		return io.github.ibuildthecloud.dstack.core.Keys.KEY_AGENT_GROUP_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.core.tables.records.AgentGroupRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.core.tables.records.AgentGroupRecord>>asList(io.github.ibuildthecloud.dstack.core.Keys.KEY_AGENT_GROUP_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public io.github.ibuildthecloud.dstack.core.tables.AgentGroupTable as(java.lang.String alias) {
		return new io.github.ibuildthecloud.dstack.core.tables.AgentGroupTable(alias);
	}
}
