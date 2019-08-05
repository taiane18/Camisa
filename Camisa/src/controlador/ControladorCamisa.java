/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;



import dao.CamisaDao;
import javax.swing.JOptionPane;
import modelo.Camisa;
import tela.manutencao.ManutencaoCamisa;


/**
 *
 * @author Administrador
 */
public class ControladorCamisa {

    public static void inserir(ManutencaoCamisa man){
        Camisa objeto = new Camisa();
        objeto.setCor(man.jtfCor.getText());
        objeto.setTamanho(man.jtfTamanho.getText());
        
        boolean resultado = CamisaDao.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}

    public static void alterar(ManutencaoCamisa man){
        Camisa objeto = new Camisa();
        //definir todos os atributos
        objeto.setCodigo(Integer.parseInt(man.jtfCodigo.getText()));
        objeto.setCor(man.jtfCor.getText());
        objeto.setTamanho(man.jtfTamanho.getText());
        
        boolean resultado = CamisaDao.alterar(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }

    public static void excluir(ManutencaoCamisa man){
        Camisa objeto = new Camisa();
        objeto.setCodigo(Integer.parseInt(man.jtfCodigo.getText())); //só precisa definir a chave primeira
        
        boolean resultado = CamisaDao.excluir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
    
}
