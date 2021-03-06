/*
 * This file is generated by jOOQ.
 */
package com.jooq.crud.model;


import com.jooq.crud.model.tables.Users;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Checkjooq extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>checkjooq</code>
     */
    public static final Checkjooq CHECKJOOQ = new Checkjooq();

    /**
     * The table <code>checkjooq.users</code>.
     */
    public final Users USERS = Users.USERS;

    /**
     * No further instances allowed
     */
    private Checkjooq() {
        super("checkjooq", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Users.USERS);
    }
}
