import java.io.File
import java.io.PrintWriter
import scala.io.Source

object DemoIO {

  def main(args: Array[String]): Unit = {

      // Get the path of the resource
      val resourcesPath = getClass.getResource("main/resources/json-sample.js")
      println(resourcesPath.getPath)

      //Open and read the resource
      val fileStream = getClass.getResourceAsStream("main/resources/json-sample.js")
      val lines = Source.fromInputStream(fileStream).getLines
      lines.foreach(line => println(line))

      //Print files from directory
      val path = getClass.getResource("main/resources")
      val folder = new File(path.getPath)
      if (folder.exists && folder.isDirectory)
        folder.listFiles
          .toList
          .foreach(file => println(file.getName))

  }
}

