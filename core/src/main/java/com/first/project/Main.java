package com.first.project;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {
    private SpriteBatch batch;
    private BitmapFont font; // ✅ variável declarada

    @Override
    public void create() {
        batch = new SpriteBatch();
        font = new BitmapFont(); // Usa a fonte padrão do LibGDX
    }

    @Override
    public void render() {
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f); // limpa a tela
        batch.begin();
        font.draw(batch, "Hello World", 100, 150); // desenha o texto
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        font.dispose(); // ✅ corrigi aqui
    }
}
