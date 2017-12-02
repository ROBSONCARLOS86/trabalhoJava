/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ROBSON CARLOS
 */
@Controller
public class contaController {
     @RequestMapping("/inicio")
    public String index(){
        return "index";
    }
    
    @RequestMapping("/cadastrarConta")
    public String cadastroConta(){
        return "conta/cadastrarConta";
    }
    
    @RequestMapping("/cadastrarCliente")
    public String cadastroCliente(){
        return "conta/cadastrarCliente";
    }
}
