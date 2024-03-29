/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;


import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Gerio
 */
public class ProdutoTableModel extends AbstractTableModel {

    
    private List<Produto> dados = new ArrayList<>();
    private String[] colunas = {"Item","Token","C.Inicial","C.Final","Linha"};  
    
    public String getColumnName(int column){
        return colunas[column];
    }
    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
    return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {

        switch(coluna){
            case 0:
                return dados.get(linha).getDescricao();
            case 1:
                return dados.get(linha).getToken();
        }
    return null;
    
    
}
    public void addRow(Produto p){
        this.dados.add(p);
        this.fireTableDataChanged();
    
    
    }
    
    
}