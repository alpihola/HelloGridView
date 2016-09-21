package com.example.alpi.hellogridview.helpers;

/**
 * Created by alpi on 9/20/16.
 */

public interface ItemTouchHelperAdapter {

    /*
    llamado cuando un objeto se ha presionado lo suficiente como para gatillar un evento
     */
    boolean onItemMove(int fromPosition, int toPosition);

    //llamado cuando un item ha sido borrado con un swipe
    boolean onItemDismiss(int position);

}
