package zerjioang.im.legalhack.dao;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 *
 * @see AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig sitiosDaoConfig;
    private final DaoConfig historialDaoConfig;
    private final DaoConfig cHATS_INICIADOSDaoConfig;
    private final DaoConfig mENSAJESDaoConfig;

    private final SitiosDao sitiosDao;
    private final HistorialDao historialDao;
    private final CHATS_INICIADOSDao cHATS_INICIADOSDao;
    private final MENSAJESDao mENSAJESDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        sitiosDaoConfig = daoConfigMap.get(SitiosDao.class).clone();
        sitiosDaoConfig.initIdentityScope(type);

        historialDaoConfig = daoConfigMap.get(HistorialDao.class).clone();
        historialDaoConfig.initIdentityScope(type);

        cHATS_INICIADOSDaoConfig = daoConfigMap.get(CHATS_INICIADOSDao.class).clone();
        cHATS_INICIADOSDaoConfig.initIdentityScope(type);

        mENSAJESDaoConfig = daoConfigMap.get(MENSAJESDao.class).clone();
        mENSAJESDaoConfig.initIdentityScope(type);

        sitiosDao = new SitiosDao(sitiosDaoConfig, this);
        historialDao = new HistorialDao(historialDaoConfig, this);
        cHATS_INICIADOSDao = new CHATS_INICIADOSDao(cHATS_INICIADOSDaoConfig, this);
        mENSAJESDao = new MENSAJESDao(mENSAJESDaoConfig, this);

        registerDao(Sitios.class, sitiosDao);
        registerDao(Historial.class, historialDao);
        registerDao(CHATS_INICIADOS.class, cHATS_INICIADOSDao);
        registerDao(MENSAJES.class, mENSAJESDao);
    }

    public void clear() {
        sitiosDaoConfig.getIdentityScope().clear();
        historialDaoConfig.getIdentityScope().clear();
        cHATS_INICIADOSDaoConfig.getIdentityScope().clear();
        mENSAJESDaoConfig.getIdentityScope().clear();
    }

    public SitiosDao getSitiosDao() {
        return sitiosDao;
    }

    public HistorialDao getHistorialDao() {
        return historialDao;
    }

    public CHATS_INICIADOSDao getCHATS_INICIADOSDao() {
        return cHATS_INICIADOSDao;
    }

    public MENSAJESDao getMENSAJESDao() {
        return mENSAJESDao;
    }

}
