package learning.mybatis;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by nico_ on 2017/1/10.
 */
public class ExceptionOutPrint {


    /**
     * 将异常信息转化成字符串
     * @param t
     * @return
     * @throws IOException
     */
    public static String exception(Throwable t) {
        if(t == null)
            return null;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try{
            t.printStackTrace(new PrintStream(baos));
        }finally{
            try {
                baos.close();
            } catch (IOException e) {
            }
        }
        return baos.toString();
    }
}
