import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class DatagramSqrtServer {
  public static void main(String[] args) {
    try (DatagramSocket serverSocket = new DatagramSocket(1111)) {
      while (true) {
        int capacityRequest = 1024;
        int capacityResponse = 1024;

        var requestBuffer = ByteBuffer.allocate(capacityRequest);
        requestBuffer.order(ByteOrder.BIG_ENDIAN);
        DatagramPacket requestPackage = new DatagramPacket(requestBuffer.array(),capacityRequest);

        serverSocket.receive(requestPackage);

        InetAddress senderClient = requestPackage.getAddress();
        int portClient = requestPackage.getPort();
        byte[] data = requestPackage.getData();

        int valueRequest = Integer.parseInt(new String(data));
        double valueResponse = Math.sqrt((double)valueRequest);
        var responseBuffer = ByteBuffer.allocate(capacityResponse);
        responseBuffer.putDouble(valueResponse);

        DatagramPacket responsePackage =  new DatagramPacket(responseBuffer,capacityResponse,senderClient,portClient);
        //
        serverSocket.send(responsePackage);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
