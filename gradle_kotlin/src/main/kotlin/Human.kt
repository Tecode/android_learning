import org.apache.commons.httpclient.HttpClient
import org.apache.commons.httpclient.methods.GetMethod
import java.io.File

class Human {
    val greeting: String
        get() {
            return "Hello Gradle 2023-05-19!"
        }
}

fun downloadData() {
    val client = HttpClient()
    val range = listOf(
            "https://cdn3-banquan.ituchong.com/weili/image/l/919166681217892466.jpeg",
            "https://cdn6-banquan.ituchong.com/weili/image/l/412603772852109331.jpeg",
            "https://cdn9-banquan.ituchong.com/weili/image/l/1591276346661273625.jpeg",
            "https://cdn3-banquan.ituchong.com/weili/image/l/919678211822452789.jpeg",
            "https://cdn6-banquan.ituchong.com/weili/image/l/1072257028195221544.jpeg"
    )
    for (url in range) {
        val fileName = url.split("/").last()
        println(fileName)
        val method = GetMethod(url)
        client.executeMethod(method)
        val responseBody = method.responseBody
        method.releaseConnection()
        val file = File(fileName)
        file.writeBytes(responseBody)
    }
}

fun main() {
    print(Human().greeting)
    downloadData()
}