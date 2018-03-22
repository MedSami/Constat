package formation.com.constat.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by mohamed-sami-mejri on 22/03/18.
 */

public class RetrofitServer {
    private static final String Base_Url="http://10.0.3.2/Constat/";
    private static Retrofit retrofit;

    public static Retrofit getClient(){

        if (retrofit==null){
            retrofit=new Retrofit.Builder()
                    .baseUrl(Base_Url).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
