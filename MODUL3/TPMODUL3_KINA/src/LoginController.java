import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private PasswordField kPasswordField;

    @FXML
    private TextField kUsernamField;

    @FXML
    public void login(ActionEvent event) throws IOException {
        try {
            // Log aktivitas login
            System.out.println("[LOGIN ATTEMPT]");
            
            // Ambil input dari textfield
            String usernameInput = kUsernamField.getText();
            String passwordInput = kPasswordField.getText();

            // Load halaman berikutnya jika autentikasi berhasil
            Parent root = FXMLLoader.load(getClass().getResource("Inventory.fxml"));
            Scene inventoryScene = new Scene(root);
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            if (usernameInput.equals("Kina") && passwordInput.equals("2322")) {
                System.out.println("Login berhasil. Mengarahkan ke halaman Inventory.");
                currentStage.setScene(inventoryScene);
                currentStage.show();
            } else {
                System.out.println("Login gagal. Username atau password salah.");
                // Tampilkan pesan kesalahan ke pengguna
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Login Error");
                alert.setHeaderText(null);
                alert.setContentText("Username atau Password yang Anda masukkan salah. Silakan coba lagi.");
                alert.showAndWait();
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat mencoba login.");
            e.printStackTrace();
        }
    }
}
