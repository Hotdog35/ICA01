/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mymaven;

import org.dizitart.no2.IndexType;
import org.dizitart.no2.NitriteId;
import org.dizitart.no2.objects.Id;
import org.dizitart.no2.objects.Index;
import org.dizitart.no2.objects.Indices;

/**
 *
 * @author TICVC
 */
@Indices({
    @Index(value = "cpf", type = IndexType.Unique)

})
public class Pessoa {

    @Id

    public NitriteId id;
    public String nome = "";
    public String cpf = "";

    @Override

    public String toString() {

        return "Pessoa{" + "id=" + id.getIdValue() + ", nome=" + nome + '}';

    }
}
