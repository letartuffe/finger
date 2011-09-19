package com.st.finger.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.RootPanel;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Finger implements EntryPoint {
	
	private double NUM = 25 ;
	private Button[] bt = new Button[(int) NUM] ;
	private int i = 1;
    private int j =0 ;
    private int k = 1;
	@Override
	public void onModuleLoad() {
		// TODO Auto-generated method stub
		 // Create a grid
	    Grid grid = new Grid((int)Math.sqrt(NUM),(int)Math.sqrt(NUM));

	    // Add images to the grid
	    int numRows = grid.getRowCount();
	    int numColumns = grid.getColumnCount();
	    
	    class MyHandler implements ClickHandler {
	    	String changeStyleName = "noChange";
	        public void onClick(ClickEvent e) {
	            Button btn=(Button) e.getSource();
	            Window.alert("Button Text="+btn.getText());
	            // Change the color of text in the Change field based on its value.
	            
	            
	            if(k == Integer.parseInt(btn.getText())){
	            	changeStyleName = "down";
	            	Window.alert(Integer.toString(k));
//	            	btn.setStyleDependentName(changeStyleName, true);
	            	k++;
	            }
	            

	            
	        }


	    }
	    
	    MyHandler handler = new MyHandler();
	    
	    for (int row = 0; row < numRows; row++) {
	      for (int col = 0; col < numColumns; col++) {
	    	
	    	bt[j] = new Button(Integer.toString(i));
	        grid.setWidget(row, col, bt[j] );
	        bt[j].addClickHandler(handler);
//	        bt[j].addClickHandler(new ClickHandler() {
//				
//				@Override
//				public void onClick(ClickEvent event) {
//					clickBt(bt[j]);
//					
//				}
//
//
//			});
	        i++;
	        j++;

	      }
	    }
	    
	    RootPanel.get().add(grid);

	}

	private void clickBt(Button bt) {
		// TODO Auto-generated method stub
		Window.alert(bt.getTitle());
	}
	
//    private void clickButton() {
//        // TODO Auto-generated method stub
//    	Window.alert("ddd");
//    }//clickButton


}
