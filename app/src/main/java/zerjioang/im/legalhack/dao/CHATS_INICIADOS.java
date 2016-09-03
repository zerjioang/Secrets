package zerjioang.im.legalhack.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

/**
 * Entity mapped to table CHATS__INICIADOS.
 */
public class CHATS_INICIADOS {

    private Long id;
    /**
     * Not-null value.
     */
    private String RUTA;
    /**
     * Not-null value.
     */
    private String TITULO;
    private String ULTIMOSMS;
    private String ULTIMAHORA;
    private String USUARIODESTINO;

    public CHATS_INICIADOS() {
    }

    public CHATS_INICIADOS(Long id) {
        this.id = id;
    }

    public CHATS_INICIADOS(Long id, String RUTA, String TITULO, String ULTIMOSMS, String ULTIMAHORA, String USUARIODESTINO) {
        this.id = id;
        this.RUTA = RUTA;
        this.TITULO = TITULO;
        this.ULTIMOSMS = ULTIMOSMS;
        this.ULTIMAHORA = ULTIMAHORA;
        this.USUARIODESTINO = USUARIODESTINO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Not-null value.
     */
    public String getRUTA() {
        return RUTA;
    }

    /**
     * Not-null value; ensure this value is available before it is saved to the database.
     */
    public void setRUTA(String RUTA) {
        this.RUTA = RUTA;
    }

    /**
     * Not-null value.
     */
    public String getTITULO() {
        return TITULO;
    }

    /**
     * Not-null value; ensure this value is available before it is saved to the database.
     */
    public void setTITULO(String TITULO) {
        this.TITULO = TITULO;
    }

    public String getULTIMOSMS() {
        return ULTIMOSMS;
    }

    public void setULTIMOSMS(String ULTIMOSMS) {
        this.ULTIMOSMS = ULTIMOSMS;
    }

    public String getULTIMAHORA() {
        return ULTIMAHORA;
    }

    public void setULTIMAHORA(String ULTIMAHORA) {
        this.ULTIMAHORA = ULTIMAHORA;
    }

    public String getUSUARIODESTINO() {
        return USUARIODESTINO;
    }

    public void setUSUARIODESTINO(String USUARIODESTINO) {
        this.USUARIODESTINO = USUARIODESTINO;
    }

}
