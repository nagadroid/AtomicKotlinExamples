// Exceptions/KotlinCheckedExceptions.kt
import java.io.*;

fun noChecked() {
  val source = FileInputStream(
    File("KotlinCheckedExceptions.kt"))
  println(source.read())
  source.close();
}