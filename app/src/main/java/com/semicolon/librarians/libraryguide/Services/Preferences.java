package com.semicolon.librarians.libraryguide.Services;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.semicolon.librarians.libraryguide.Models.CompanyModel;
import com.semicolon.librarians.libraryguide.Models.LibraryModel;
import com.semicolon.librarians.libraryguide.Models.NormalUserData;
import com.semicolon.librarians.libraryguide.Models.PublisherModel;
import com.semicolon.librarians.libraryguide.Models.UniversityModel;

/**
 * Created by Delta on 08/02/2018.
 */

public class Preferences {
    Context context;

    public Preferences(Context context) {
        this.context = context;


    }
    public void Create_SharedPreference_User(NormalUserData userData)
    {
        SharedPreferences sharedPreferences = context.getSharedPreferences("user_pref",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();



        editor.putString("type",userData.getUserType());
        editor.putString("id",userData.getUserId());
        editor.putString("name",userData.getUserName());
        editor.putString("email",userData.getUserEmail());
        editor.putString("phone",userData.getUserPhone());
        if (userData.getTitle()==null)
        {
            editor.putString("country",userData.getUserCountry());

        }else
            {
                editor.putString("country",userData.getTitle());

            }

        if (userData.getUserPhoto()==null)
        {
            editor.putString("photo",userData.getUser_photo());
            editor.putString("photo_link","null");

        }else
            {
                editor.putString("photo",userData.getUser_photo());
                editor.putString("photo_link",userData.getUserPhoto());

            }
        editor.apply();

        Log.e("CurrUserID",userData.getUserId()+"\n"+"Photo"+userData.getUser_photo()+"\n"+"link"+userData.getUserPhoto());

    }
    public void Create_SharedPreference_Publisher(PublisherModel publisherModel)
    {
        SharedPreferences sharedPreferences = context.getSharedPreferences("pub_pref",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("type",publisherModel.getUser_type());
        editor.putString("id",publisherModel.getPub_username());
        editor.putString("name",publisherModel.getPub_name());
        editor.putString("email",publisherModel.getPub_email());
        editor.putString("phone",publisherModel.getPub_phone());
        if (publisherModel.getTitle()==null)
        {
            editor.putString("country",publisherModel.getPub_country());

        }else
        {
            editor.putString("country",publisherModel.getTitle());

        }

        editor.putString("address",publisherModel.getPub_address());
        editor.putString("town",publisherModel.getPub_town());
        editor.putString("site",publisherModel.getPub_website());
        editor.putString("photo",publisherModel.getUser_photo());
        editor.apply();
        Log.e("CurrUserID",publisherModel.getPub_username()+"\n"+"Photo"+publisherModel.getUser_photo());

    }
    public void Create_SharedPreference_Library(LibraryModel libraryModel)
    {
        Log.e("modddddddd",libraryModel.getType_title()+"");
        SharedPreferences sharedPreferences = context.getSharedPreferences("lib_pref",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("type",libraryModel.getUser_type());
        editor.putString("id",libraryModel.getLib_username());
        editor.putString("name",libraryModel.getLib_name());
        editor.putString("libType",libraryModel.getType_title());
        editor.putString("email",libraryModel.getLib_email());
        editor.putString("phone",libraryModel.getLib_phone());
        if (libraryModel.getTitle()==null)
        {
            editor.putString("country",libraryModel.getLib_country());

        }else
        {
            editor.putString("country",libraryModel.getTitle());

        }
        editor.putString("address",libraryModel.getLib_address());
        editor.putString("photo",libraryModel.getUser_photo());
        editor.apply();
        Log.e("CurrUserID",libraryModel.getLib_username()+"\n"+"Photo"+libraryModel.getUser_photo());

    }
    public void Create_SharedPreference_University(UniversityModel universityModel)
    {
        SharedPreferences sharedPreferences = context.getSharedPreferences("uni_pref",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("type",universityModel.getUser_type());
        editor.putString("id",universityModel.getUni_username());
        editor.putString("name",universityModel.getUni_name());
        editor.putString("email",universityModel.getUni_email());
        editor.putString("phone",universityModel.getUni_phone());
        if (universityModel.getTitle()==null)
        {
            editor.putString("country",universityModel.getUni_country());

        }else
        {
            editor.putString("country",universityModel.getTitle());

        }
        editor.putString("address",universityModel.getUni_address());
        editor.putString("major",universityModel.getUni_major());
        editor.putString("site",universityModel.getUni_site());
        editor.putString("photo",universityModel.getUser_photo());
        editor.apply();
        Log.e("CurrUserID",universityModel.getUni_username()+"\n"+"Photo"+universityModel.getUser_photo());

    }
    public void Create_SharedPreference_Company(CompanyModel companyModel)
    {
        SharedPreferences sharedPreferences = context.getSharedPreferences("comp_pref",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("type",companyModel.getUser_type());
        editor.putString("id",companyModel.getComp_username());
        editor.putString("name",companyModel.getComp_name());
        editor.putString("email",companyModel.getComp_email());
        editor.putString("phone",companyModel.getComp_phone());
        if (companyModel.getTitle()==null)
        {
            editor.putString("country",companyModel.getComp_country());

        }else
        {
            editor.putString("country",companyModel.getTitle());

        }
        editor.putString("address",companyModel.getComp_address());
        editor.putString("town",companyModel.getComp_town());
        editor.putString("site",companyModel.getComp_site());
        editor.putString("photo",companyModel.getUser_photo());
        editor.apply();
        Log.e("CurrUserID",companyModel.getComp_username()+"\n"+"Photo"+companyModel.getUser_photo());

    }


    public void Clear_SharedPrefrence(String userType)
    {
        switch (userType)
        {
            case "user":
                SharedPreferences sharedPreferences_user = context.getSharedPreferences("user_pref",Context.MODE_PRIVATE);
                SharedPreferences.Editor editor_user = sharedPreferences_user.edit();
                editor_user.clear();
                editor_user.commit();
                break;
            case "publisher":
                SharedPreferences sharedPreferences_pub = context.getSharedPreferences("pub_pref",Context.MODE_PRIVATE);
                SharedPreferences.Editor editor_pub = sharedPreferences_pub.edit();
                editor_pub.clear();
                editor_pub.commit();
                break;
            case "library":
                SharedPreferences sharedPreferences_lib = context.getSharedPreferences("lib_pref",Context.MODE_PRIVATE);
                SharedPreferences.Editor editor_lib = sharedPreferences_lib.edit();
                editor_lib.clear();
                editor_lib.commit();
                break;
            case "university":
                SharedPreferences sharedPreferences_uni = context.getSharedPreferences("uni_pref",Context.MODE_PRIVATE);
                SharedPreferences.Editor editor_uni = sharedPreferences_uni.edit();
                editor_uni.clear();
                editor_uni.commit();
                break;
            case "company":
                SharedPreferences sharedPreferences_comp = context.getSharedPreferences("comp_pref",Context.MODE_PRIVATE);
                SharedPreferences.Editor editor_comp = sharedPreferences_comp.edit();
                editor_comp.clear();
                editor_comp.commit();
                break;
        }


    }

    public void LoggedUserPref(String userType,String id)
    {
        SharedPreferences pref = context.getSharedPreferences("userType",context.MODE_PRIVATE);

        SharedPreferences.Editor editor = pref.edit();
        editor.putString("userType",userType);
        editor.putString("id",id);
        editor.apply();
        Log.e("usertype",userType);
    }
    public void Session(String session)
    {
        SharedPreferences pref = context.getSharedPreferences("session",context.MODE_PRIVATE);

        SharedPreferences.Editor editor = pref.edit();
        editor.putString("session",session);
        editor.apply();
        editor.commit();


        Log.e("session",pref.getString("session",""));
    }
    public String getSession()
    {
        SharedPreferences pref = context.getSharedPreferences("session",context.MODE_PRIVATE);

        String session = pref.getString("session","");

        Log.e("ss",session);
        return session;
    }
    public void createPrfRemmember_me(String username,String pass)
    {
        SharedPreferences pref = context.getSharedPreferences("remember_me",context.MODE_PRIVATE);

        SharedPreferences.Editor editor = pref.edit();
        editor.putString("user_name",username);
        editor.putString("pass",pass);
        editor.apply();
    }
    public void clearRefRemember_me()
    {
        SharedPreferences pref = context.getSharedPreferences("remember_me",context.MODE_PRIVATE);

        SharedPreferences.Editor editor = pref.edit();
        editor.clear();
        editor.apply();
    }

    public void CreateSharedForCountry(String id,String country_name)
    {
        SharedPreferences pref = context.getSharedPreferences("country_pref",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString(id,country_name);
        editor.apply();
    }

    public String getCountryById(String id)
    {
        SharedPreferences pref = context.getSharedPreferences("country_pref",Context.MODE_PRIVATE);

        return pref.getString(id,"");
    }

    public void CreateSoundtoggle(String state)
    {
        SharedPreferences pref = context.getSharedPreferences("sound_pref",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("state",state);
        editor.apply();
    }
    public void CreateVibratetoggle(String state)
    {
        SharedPreferences pref = context.getSharedPreferences("vibrate_pref",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("state",state);
        editor.apply();
    }
    public String getSoundState()
    {
        SharedPreferences pref = context.getSharedPreferences("sound_pref",Context.MODE_PRIVATE);

        return pref.getString("state","");
    }
    public String getVibrateState()
    {
        SharedPreferences pref = context.getSharedPreferences("vibrate_pref",Context.MODE_PRIVATE);

        return pref.getString("state","");
    }

    public void CreatePref_forRingtone(String uri)
    {
        SharedPreferences pref = context.getSharedPreferences("tone_pref",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("tone",uri);
        editor.apply();
    }
    public String getRingtone()
    {
        SharedPreferences pref = context.getSharedPreferences("tone_pref",Context.MODE_PRIVATE);

        return pref.getString("tone","");
    }
}
