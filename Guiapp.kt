import javax.swing.*
import java.awt.*
import java.awt.event.ActionListener

class Guiapp {

    fun run()
    {
        var jf = JFrame("Gui App")
        var jb = JButton("Press Me")
        jf.setSize(500, 500)
        jf.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        jf.layout = FlowLayout()
        jf.add(jb)




        jb.addActionListener(ActionListener {


        })

        jf.isVisible = true
    }

}

fun main()
{
    Guiapp().run()
}