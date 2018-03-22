package formation.com.constat.api;

import formation.com.constat.Model.ResponseDataModel;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by mohamed-sami-mejri on 22/03/18.
 */

public interface ApiRequest {
    //Insert Data from Android Client to Sql server
    @FormUrlEncoded
    @POST("Inscrire.php")
    Call<ResponseDataModel> Inscrire(
            @Field("nom") String nom,
            @Field("prenom") String prenom,
            @Field("adresse") String adresse,
            @Field("numTel") int numtel,
            @Field("login") String login,
            @Field("motdepasse") String motdepasse
    );

    //Insert Data from Android Client to Sql server
    @FormUrlEncoded
    @POST("Reclamation.php")
    Call<ResponseDataModel> Reclamation(
            @Field("sujet") String sujet,
            @Field("idSpectateur") String idspectateur,
            @Field("reclamation") String reclamation
    );

    //Select All Data from sql server
    @GET("SelectAll.php")
    Call<ResponseDataModel> getAllData();

    //Select All Offre from sql server
    @GET("SelectOffre.php")
    Call<ResponseDataModel> getAllOffre();

    //Select All Club from sql server
    @GET("SelectClub.php")
    Call<ResponseDataModel> getAllClub();

}
