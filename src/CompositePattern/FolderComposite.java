/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class FolderComposite  implements FileComponent{

    private List<FileComponent> files = new ArrayList<>() ;

    public FolderComposite(List<FileComponent> files) {
        this.files = files ;
    }
    
    @Override
    public void showProperty() {
        for (FileComponent file : files) {
            file.showProperty();
        }
    }

    @Override
    public long totalSize() {
        long total = 0 ;
        for (FileComponent file : files) {
        total = total + file.totalSize() ;
        }
        return  total ;
    }
    
}
