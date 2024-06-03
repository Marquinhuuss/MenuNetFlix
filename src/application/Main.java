package application;
	
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.transform.Translate;
import java.io.File;

public class Main extends Application {
	double noval = 220;
	double novaA = 350;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = new AnchorPane();
			root.setId("root");
			
			//Titulo
			Label lbltitulo = new Label();
			lbltitulo.setText("Netflix");
			lbltitulo.setId("titulo");
			lbltitulo.setLayoutX(341);
			lbltitulo.setLayoutY(5);
			
			//Nome do primeiro filme
			Label lblfilme1 = new Label();
			lblfilme1.setText("Arremessando alto");
			lblfilme1.setId("nfilme");
			lblfilme1.setLayoutX(65);
			lblfilme1.setLayoutY(150);
			lblfilme1.setId("nome");
			
			//Nome do segundo filme
			Label lblfilme2 = new Label();
			lblfilme2.setText("Gran turismo");
			lblfilme2.setId("nfilme");
			lblfilme2.setLayoutX(393);
			lblfilme2.setLayoutY(150);
			lblfilme2.setId("nome");
			
			//Nome do terceiro filme
			Label lblfilme3 = new Label();
			lblfilme3.setText("Velozes e furiosos");
			lblfilme3.setId("nfilme");
			lblfilme3.setLayoutX(670);
			lblfilme3.setLayoutY(150);
			lblfilme3.setId("nome");
			
			//Imagem do primeiro filme
			Image img1 = new Image(getClass().getResource("img.jpg").toString());
			ImageView imgview = new ImageView(img1);
			
			//efeito de zoom da imagem
			imgview.setOnMouseEntered(event -> {
	            imgview.setScaleX(1.2);
	            imgview.setScaleY(1.2);
			});
			
			imgview.setOnMouseExited(event -> {
	            imgview.setScaleX(1.0);
	            imgview.setScaleY(1.0);
	        });
			
			
			//efeito de sombra
			DropShadow dropShadow = new DropShadow();
	        dropShadow.setRadius(10);
	        dropShadow.setOffsetX(5);
	        dropShadow.setOffsetY(5);
			imgview.setEffect(dropShadow);
			
			
			imgview.setFitHeight(novaA);
			imgview.setFitWidth(noval);
			imgview.setLayoutX(40);
			imgview.setLayoutY(180);
			imgview.setId("img");
			
			//Imagen do segundo filme
			Image img2 = new Image(getClass().getResource("img2.jpg").toString());
			ImageView imgview2 = new ImageView(img2);
			
			//efeito de zoom da imagem
			imgview2.setOnMouseEntered(event -> {
	            imgview2.setScaleX(1.2);
	            imgview2.setScaleY(1.2);
			});
			
			imgview2.setOnMouseExited(event -> {
	            imgview2.setScaleX(1.0);
	            imgview2.setScaleY(1.0);
	        });
			
			
			//efeito de sombra
			DropShadow dropShadow2 = new DropShadow();
	        dropShadow2.setRadius(10);
	        dropShadow2.setOffsetX(5);
	        dropShadow2.setOffsetY(5);
			imgview2.setEffect(dropShadow2);
			
			imgview2.setFitHeight(novaA);
			imgview2.setFitWidth(noval);
			imgview2.setLayoutX(340);
			imgview2.setLayoutY(180);
			imgview2.setId("img");
			
			//Imagen do terceiro filme
			Image img3 = new Image(getClass().getResource("img3.jpg").toString());
			ImageView imgview3 = new ImageView(img3);
			
			//efeito de zoom da imagem
			imgview3.setOnMouseEntered(event -> {
	            imgview3.setScaleX(1.2);
	            imgview3.setScaleY(1.2);
			});
			
			imgview3.setOnMouseExited(event -> {
	            imgview3.setScaleX(1.0);
	            imgview3.setScaleY(1.0);
	        });
			DropShadow dropShadow3 = new DropShadow();
	        dropShadow3.setRadius(10);
	        dropShadow3.setOffsetX(5);
	        dropShadow3.setOffsetY(5);
			imgview3.setEffect(dropShadow3);
			
			imgview3.setFitHeight(novaA);
			imgview3.setFitWidth(noval);
			imgview3.setLayoutX(640);
			imgview3.setLayoutY(180);
			imgview3.setId("img");
			
			
			//botão do primeiro filme
			Button btnf1 = new Button();
			btnf1.setText("Ver trailer");
			btnf1.setLayoutX(113);
			btnf1.setLayoutY(580);
			btnf1.setId("botao");
			
			btnf1.setOnAction(event -> Trailer1("Trailer_arremessando_alto.mp4"));
			
			
			
			//botão do segundo filme
			Button btnf2 = new Button();
			btnf2.setText("Ver trailer");
			btnf2.setLayoutX(415);
			btnf2.setLayoutY(580);
			btnf2.setId("botao");
			
			btnf2.setOnAction(event -> Trailer2("Trailer_gran_turismo.mp4"));
			
			//botão do terceiro filme
			Button btnf3 = new Button();
			btnf3.setText("Ver trailer");
			btnf3.setLayoutX(715);
			btnf3.setLayoutY(580);
			btnf3.setId("botao");
			
			btnf3.setOnAction(event -> Trailer3("Trailer_velozes_e_furiosos.mp4"));
								
							
			Scene scene = new Scene(root,900,900);
			root.getChildren().add(lbltitulo);
			root.getChildren().add(lblfilme1);
			root.getChildren().add(lblfilme2);
			root.getChildren().add(lblfilme3);
			root.getChildren().add(imgview);
			root.getChildren().add(imgview2);
			root.getChildren().add(imgview3);
			root.getChildren().add(btnf1);
			root.getChildren().add(btnf2);
			root.getChildren().add(btnf3);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	private void Trailer1(String video1) {
		Stage trailer = new Stage();
		trailer.setTitle("Trailer");
		Media media = new Media(getClass().getResource("Trailer_arremessando_alto.mp4") . toExternalForm());
		MediaPlayer mdp = new MediaPlayer(media);
		mdp.setAutoPlay(true);
		MediaView mdv = new MediaView(mdp);
		mdv.setFitHeight(900);
		mdv.setFitWidth(900);
		AnchorPane troot = new AnchorPane(mdv);
		Scene tcena = new Scene(troot, 900, 500);
		trailer.setScene(tcena);
		trailer.show();
		mdp.play();
		
	}
	
	private void Trailer2(String video2) {
		Stage trailer2 = new Stage();
		trailer2.setTitle("Trailer");
		Media media2 = new Media(getClass().getResource("Trailer_gran_turismo.mp4") . toExternalForm());
		MediaPlayer mdp2 = new MediaPlayer(media2);
		mdp2.setAutoPlay(true);
		MediaView mdv2 = new MediaView(mdp2);
		mdv2.setFitHeight(900);
		mdv2.setFitWidth(900);
		AnchorPane troot2 = new AnchorPane(mdv2);
		Scene tcena2 = new Scene(troot2, 900, 500);
		trailer2.setScene(tcena2);
		trailer2.show();
		mdp2.play();
		
	}
	
	private void Trailer3(String video3) {
		Stage trailer3 = new Stage();
		trailer3.setTitle("Trailer");
		Media media3 = new Media(getClass().getResource("Trailer_velozes_e_furiosos.mp4") . toExternalForm());
		MediaPlayer mdp3 = new MediaPlayer(media3);
		mdp3.setAutoPlay(true);
		MediaView mdv3 = new MediaView(mdp3);
		mdv3.setFitHeight(900);
		mdv3.setFitWidth(900);
		AnchorPane troot3 = new AnchorPane(mdv3);
		Scene tcena3 = new Scene(troot3, 900, 500);
		trailer3.setScene(tcena3);
		trailer3.show();
		mdp3.play();
		
	}
}
