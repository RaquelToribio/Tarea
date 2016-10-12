/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibatis;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class Bd {

    public static SqlMapClient conectar() {
        try {
            Reader reader = null;
            String resource = "ibatis/SqlMapConfig.xml";
            reader = Resources.getResourceAsReader(resource);
            SqlMapClient sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
            
            return sqlMap;
        } catch (IOException ex) {
            return null;
            }
    }
}
