package zerjioang.im.legalhack.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table HISTORIAL.
 */
public class HistorialDao extends AbstractDao<Historial, Long> {

    public static final String TABLENAME = "HISTORIAL";

    public HistorialDao(DaoConfig config) {
        super(config);
    }

    ;


    public HistorialDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /**
     * Creates the underlying database table.
     */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists ? "IF NOT EXISTS " : "";
        db.execSQL("CREATE TABLE " + constraint + "'HISTORIAL' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'IP' TEXT NOT NULL ," + // 1: IP
                "'PORT' TEXT NOT NULL ," + // 2: PORT
                "'SERVERNAME' TEXT NOT NULL ," + // 3: SERVERNAME
                "'VISIBLENAME' TEXT NOT NULL ," + // 4: VISIBLENAME
                "'LOGINENABLED' INTEGER NOT NULL ," + // 5: LOGINENABLED
                "'USER' TEXT NOT NULL ," + // 6: USER
                "'PASS' TEXT NOT NULL );"); // 7: PASS
    }

    /**
     * Drops the underlying database table.
     */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'HISTORIAL'";
        db.execSQL(sql);
    }

    /**
     * @inheritdoc
     */
    @Override
    protected void bindValues(SQLiteStatement stmt, Historial entity) {
        stmt.clearBindings();

        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getIP());
        stmt.bindString(3, entity.getPORT());
        stmt.bindString(4, entity.getSERVERNAME());
        stmt.bindString(5, entity.getVISIBLENAME());
        stmt.bindLong(6, entity.getLOGINENABLED() ? 1l : 0l);
        stmt.bindString(7, entity.getUSER());
        stmt.bindString(8, entity.getPASS());
    }

    /**
     * @inheritdoc
     */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }

    /**
     * @inheritdoc
     */
    @Override
    public Historial readEntity(Cursor cursor, int offset) {
        Historial entity = new Historial( //
                cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
                cursor.getString(offset + 1), // IP
                cursor.getString(offset + 2), // PORT
                cursor.getString(offset + 3), // SERVERNAME
                cursor.getString(offset + 4), // VISIBLENAME
                cursor.getShort(offset + 5) != 0, // LOGINENABLED
                cursor.getString(offset + 6), // USER
                cursor.getString(offset + 7) // PASS
        );
        return entity;
    }

    /**
     * @inheritdoc
     */
    @Override
    public void readEntity(Cursor cursor, Historial entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setIP(cursor.getString(offset + 1));
        entity.setPORT(cursor.getString(offset + 2));
        entity.setSERVERNAME(cursor.getString(offset + 3));
        entity.setVISIBLENAME(cursor.getString(offset + 4));
        entity.setLOGINENABLED(cursor.getShort(offset + 5) != 0);
        entity.setUSER(cursor.getString(offset + 6));
        entity.setPASS(cursor.getString(offset + 7));
    }

    /**
     * @inheritdoc
     */
    @Override
    protected Long updateKeyAfterInsert(Historial entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }

    /**
     * @inheritdoc
     */
    @Override
    public Long getKey(Historial entity) {
        if (entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /**
     * @inheritdoc
     */
    @Override
    protected boolean isEntityUpdateable() {
        return true;
    }

    /**
     * Properties of entity Historial.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property IP = new Property(1, String.class, "IP", false, "IP");
        public final static Property PORT = new Property(2, String.class, "PORT", false, "PORT");
        public final static Property SERVERNAME = new Property(3, String.class, "SERVERNAME", false, "SERVERNAME");
        public final static Property VISIBLENAME = new Property(4, String.class, "VISIBLENAME", false, "VISIBLENAME");
        public final static Property LOGINENABLED = new Property(5, boolean.class, "LOGINENABLED", false, "LOGINENABLED");
        public final static Property USER = new Property(6, String.class, "USER", false, "USER");
        public final static Property PASS = new Property(7, String.class, "PASS", false, "PASS");
    }

}
