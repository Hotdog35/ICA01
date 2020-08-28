/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mymaven;

import org.dizitart.no2.Nitrite;
import org.dizitart.no2.objects.ObjectRepository;

/**
 *
 * @author TICVC
 */
public class BaseDados {

    public static ObjectRepository<Pessoa> rPessoas;

    public static void iniciaDados() {

        Nitrite db = Nitrite.builder()
                .compressed()
                .filePath("baseDados.db")
                .openOrCreate("root", "salesiano");

        //incia o repositório para a entidade pessoa
        rPessoas = db.getRepository(Pessoa.class);

    }

}
