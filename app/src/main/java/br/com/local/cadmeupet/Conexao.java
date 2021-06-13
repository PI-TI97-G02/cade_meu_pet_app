package br.com.local.cadmeupet;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Conexao extends SQLiteOpenHelper {
    private static final String NOME_DO_BANCO_DE_DADOS = "dpCadeMeuPEt.dp";
    private static final int VERSAO_DO_BANCO_DE_DADOS = 1;

    public Conexao(@Nullable Context context) {
        super(context, NOME_DO_BANCO_DE_DADOS, null, VERSAO_DO_BANCO_DE_DADOS);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE tbPets(" +
                "nomePet INTEGER PRIMARY KEY AUTOINCREMENT," +
                "descrição VARCHAR(100));";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onCreate(db);

    }
}
