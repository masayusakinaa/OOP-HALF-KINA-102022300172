import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class InventoryController {

    private String artistName, albumTitle;
    private int totalCopies, rentedCopies;

    @FXML
    private Button btnAdd;

    @FXML
    private TextField txtArtist;

    @FXML
    private Button btnDelete;

    @FXML
    private TextField txtAlbum;

    @FXML
    private Button btnRented;

    @FXML
    private TextField txtRented;

    @FXML
    private TextField txtTotal;

    @FXML
    private Button btnUpdate;

    @FXML
    private TableView<Album> albumTable;

    @FXML
    private TableColumn<Album, String> colAlbumTitle;

    @FXML
    private TableColumn<Album, String> colArtist;

    @FXML
    private TableColumn<Album, Integer> colTotalCopies;

    @FXML
    private TableColumn<Album, Integer> colRentedCopies;

    private ObservableList<Album> albumList = FXCollections.observableArrayList();

    public void initialize() {
        try {
            colAlbumTitle.setCellValueFactory(new PropertyValueFactory<>("albumName"));
            colArtist.setCellValueFactory(new PropertyValueFactory<>("artist"));
            colTotalCopies.setCellValueFactory(new PropertyValueFactory<>("total"));
            colRentedCopies.setCellValueFactory(new PropertyValueFactory<>("rented"));
            albumTable.setItems(albumList);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    void handleAdd(ActionEvent event) throws IOException {
        try {
            artistName = txtArtist.getText();
            albumTitle = txtAlbum.getText();
            totalCopies = Integer.parseInt(txtTotal.getText());
            rentedCopies = Integer.parseInt(txtRented.getText());

            Album newAlbum = new Album(artistName, albumTitle, totalCopies, rentedCopies);
            albumList.add(newAlbum);
            clearFields();

            showAlert(AlertType.INFORMATION, "Add Album", "Album " + albumTitle + " has been successfully added!");
        } catch (Exception ex) {
            showAlert(AlertType.WARNING, "Error", "Please check your input data.");
        }
    }

    @FXML
    void handleDelete(ActionEvent event) {
        try {
            for (Album album : albumList) {
                if (album.getAlbumName().equals(albumTitle)) {
                    albumList.remove(album);
                    clearFields();
                    showAlert(AlertType.INFORMATION, "Delete Album", "Album " + albumTitle + " has been successfully removed!");
                    break;
                }
            }
        } catch (Exception ex) {
            showAlert(AlertType.WARNING, "Error", "Error occurred during the deletion process.");
        }
    }

    @FXML
    void handleRent(ActionEvent event) {
        try {
            txtAlbum.setEditable(false);
            txtArtist.setEditable(false);
            txtTotal.setEditable(false);

            albumTitle = txtAlbum.getText();
            artistName = txtArtist.getText();
            totalCopies = Integer.parseInt(txtTotal.getText());
            rentedCopies = Integer.parseInt(txtRented.getText()) + 1;

            totalCopies -= 1;

            for (Album album : albumList) {
                if (album.getAlbumName().equals(albumTitle)) {
                    Album updatedAlbum = new Album(artistName, albumTitle, totalCopies, rentedCopies);
                    albumList.set(albumList.indexOf(album), updatedAlbum);
                    clearFields();
                    showAlert(AlertType.INFORMATION, "Rent Album", "Album " + albumTitle + " has been rented!");
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    void handleUpdate(ActionEvent event) {
        try {
            artistName = txtArtist.getText();
            albumTitle = txtAlbum.getText();
            totalCopies = Integer.parseInt(txtTotal.getText());
            rentedCopies = Integer.parseInt(txtRented.getText());

            txtAlbum.setEditable(false);

            for (Album album : albumList) {
                if (album.getAlbumName().equals(albumTitle)) {
                    Album updatedAlbum = new Album(artistName, albumTitle, totalCopies, rentedCopies);
                    albumList.set(albumList.indexOf(album), updatedAlbum);
                    clearFields();
                    showAlert(AlertType.INFORMATION, "Update Album", "Album " + albumTitle + " has been updated!");
                    break;
                }
            }
        } catch (Exception ex) {
            showAlert(AlertType.WARNING, "Error", "Error occurred during the update process.");
        }
    }

    @FXML
    void handleShow(MouseEvent event) {
        if (event.getClickCount() == 1) {
            Album selectedAlbum = albumTable.getSelectionModel().getSelectedItem();
            if (selectedAlbum != null) {
                txtAlbum.setText(selectedAlbum.getAlbumName());
                txtArtist.setText(selectedAlbum.getArtist());
                txtRented.setText(String.valueOf(selectedAlbum.getRented()));
                txtTotal.setText(String.valueOf(selectedAlbum.getTotal()));
            }
        }
    }

    private void clearFields() {
        txtAlbum.clear();
        txtArtist.clear();
        txtTotal.clear();
        txtRented.clear();
        txtAlbum.setEditable(true);
        txtArtist.setEditable(true);
        txtTotal.setEditable(true);
    }

    private void showAlert(AlertType type, String title, String content) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
