/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mymaven;

import java.util.List;

import org.dizitart.no2.FindOptions;

import org.dizitart.no2.SortOrder;

import static org.dizitart.no2.objects.filters.ObjectFilters.eq;

/**
 *
 * @author TICVC
 */
public class Programa {

    public static void main(String[] args) {

        //inicia os dados
        BaseDados.iniciaDados();

        //cria um objeto do tipo Pessoa
        Pessoa p = new Pessoa();

        p.nome = "clemente";

        //insere no banco de dados a pessoa
        BaseDados.rPessoas.insert(p);

        //cria uma opção de ordenação ascendente pelo nome das pessoas inseridas no banco
        FindOptions sortBy = FindOptions.sort("nome", SortOrder.Ascending);

        //recupera a lista com as pessoas inseridas no banco de dados
        List<Pessoa> pessoas = BaseDados.rPessoas.find(sortBy).toList();

        long idPessoa = 0;

        //mostra as pessoas
        for (Pessoa paux : pessoas) {

            System.out.println(paux+ "\n");

            //recupera o valor numérico do id da pessoa
            idPessoa = paux.id.getIdValue();

        }

        //executa uma query no repositório recuperando uma pessoa pelo seu id
        p = BaseDados.rPessoas.find(eq("id", idPessoa)).firstOrDefault();

        //altera o nome do objeto p2 (tipo Pessoa)
        p.nome = "clemente tadeu";

        //atualiza os dados no banco de dados
        BaseDados.rPessoas.update(p);

        //executa uma query no repositório recuperando uma pessoa pelo seu id
        p = BaseDados.rPessoas.find(eq("id", idPessoa)).firstOrDefault();

        System.out.println(p);

        //exclui a pessoa do banco de dados
        BaseDados.rPessoas.remove(p);

        //recupera a lista com as pessoas inseridas no banco de dados
        pessoas = BaseDados.rPessoas.find().toList();

        //mostra a quantidade de pessoas inseridas no banco de dados
        System.out.println(pessoas.size());

    }

}
