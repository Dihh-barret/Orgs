package com.example.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.R
import com.example.orgs.model.Produto
import com.example.orgs.ui.ReciclerView.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        Toast.makeText(this,"Bem vindo(a) ao Orgs", Toast.LENGTH_SHORT).show()
//        val view = TextView(this)
//        view.setText("Cesta de Frutas")
//        setContentView(view)
//        val nome = findViewById<TextView>(R.id.nome)
//        nome.text = "Cesta de Frutas"
//        val descricao = findViewById<TextView>(R.id.descricao)
//        descricao.text = "Laranja, banana e maçã"
//        val valor = findViewById<TextView>(R.id.valor)
//        valor.text = "R$ 19.99"
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.adapter = ListaProdutosAdapter(context = this, produtos = listOf(
            Produto(nome = "teste",
            descricao = "teste descricao",
            valor = BigDecimal("19.99")
        ),
            Produto(nome = "teste",
                descricao = "teste descricao",
                valor = BigDecimal("19.99")
        ),
        ))
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}