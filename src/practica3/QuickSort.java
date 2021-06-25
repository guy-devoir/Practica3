package practica3;

import GUI.Directorio;
import org.jfree.chart.ChartPanel;

/**
 *
 * @author Luciano Xiquín
 */
    
import org.jfree.chart.ChartFactory;   
import org.jfree.chart.ChartPanel;   
import org.jfree.chart.JFreeChart;   
import org.jfree.chart.axis.ValueAxis;   
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;   
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.time.Millisecond;   
import org.jfree.data.time.TimeSeries;   
import org.jfree.data.time.TimeSeriesCollection;   
   
public class QuickSort extends ChartPanel implements Runnable{ 
    private static TimeSeries timeSeries;   
    private long value=0;
    static DefaultCategoryDataset dataset;
    private static JFreeChart _grafico;
       
    public QuickSort(DefaultCategoryDataset chartContent,String title)   
    {   
        super(createChart(chartContent,title));   
    }   
       
    private static JFreeChart createChart(DefaultCategoryDataset chartContent, String title) {
        //Create a sequence diagram object   
        _grafico = ChartFactory.createBarChart(title, "EDADES", "# DE ALUMNOS", chartContent, PlotOrientation.VERTICAL, false, false, false);
        
        return _grafico;
    }

    public void run() {
        while (true) {
            try {
                _grafico.addChangeListener(this);
                Thread.sleep(3000000);
            } catch (InterruptedException e) {
            }
        }
    }

    private long randomNum() {
        System.out.println((Math.random() * 20 + 80));
        return (long) (Math.random() * 20 + 80);
    }
}
