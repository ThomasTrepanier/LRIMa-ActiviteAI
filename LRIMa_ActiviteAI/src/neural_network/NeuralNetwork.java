package neural_network;
import java.util.ArrayList;

public class NeuralNetwork {
	
	// Layers
	static Layer[] layers; //Liste de Layers

	// Training data
	public static ArrayList<TrainingData> tDataSet; // Liste de TrainingData pour s'entraîner (Chaque TrainingData du MNIST représente un nombre)
	public static ArrayList<TrainingData> testSet;  // Liste de TrainingData pour tester
	
	/**
	 * Constructeur pour le réseau de neurone
	 * @param nbLayers Le nombre de couche qu'on veut dans le réseau
	 */
	public NeuralNetwork(int nbLayers) {
		
	}
	
	/**
	 * Créer un DataSet très simple pour entraîner notre réseau
	 */
	public static void CreateSimpleTrainingData() {
		
	}

	/**
	 * Créer un DataSet très simple pour tester notre réseau
	 * @param nbTest Nombre de DataSets qu'on veut
	 */
	public static void CreateSimpleTestData(int nbTest) {
		
	}

	/**
	 * Activation du réseau
	 * @param inputs Les données d'entrée pour cette activation
	 */
	public static void forward(float[] inputs) {
 	
	}

	/**
	 * L'idée est qu'on calcule le gradient et on "mémorise" les nouveaux poids dans les neurones
	 * Quand TOUS les nouveaux poids ont été calculés, on actualise les poids dans les neurones
	 * Cela revient à faire:
	 * Calculer les poids de la couche de sortie, calculer les poinds des couches cachées et ensuite on actualise les poids
	 * @param learning_rate Le rythme d'apprentissage
	 * @param tData L'ensemble de donnée utilisé
	 */
	public static void backward(float learning_rate, TrainingData tData) {

	}

	/**
	 * Fonction qui fait la somme de tous les gradients qui connectent un neurone dans une couche
	 * @param n_index Index du neurone à évaluer
	 * @param l_index Index de la couche du neurone
	 * @return La somme des gradients en {@link Float}
	 */
	public static float sumGradient(int n_index, int l_index) {
		return 0;
	}

	/**
	 * Cette fonction est utilisée pour entrainer le réseau: Une passe forward() et une passe backward() 
	 * @param epoch Le nombre de fois qu'on veut entraîner le réseau
	 * @param learning_rate Le rythme d'apprentissage
	 * @param percentageOfDataSetToUse Portion de l'ensemble de données à utiliser (Si pas assez de RAM)
	 */
	public static void train(int epoch, float learning_rate, float percentageOfDataSetToUse) {

	}

	/**
	 * Calcule le taux de notre réseau pour les ensembles de données simples
	 * @param margin La marge d'erreur entre la valeur du réseau et celle attendue
	 * @return Le pourcentage de réussite du réseau
	 */
	private static float evaluateOneOutputAccuracy(float margin) {
		return 0;
	}
	
	/**
	 * Calcule le taux du réseau sur le MNIST
	 * @return Le pourcentage de réussite du réseau
	 */
	private static float evaluateMNISTAccuracy() {
		return 0;
	}
	
	//ON LES RÉACTIVERA PLUS TARD
	
/*
	private static void oneOutputPass() {
		for (int i = 0; i < testSet.size(); i++) {
			forward(testSet.get(i).data);
			float output = 0;
			float expected = 0;
			for(int j = 0; j < layers[layers.length - 1].neurons.length; j++) {
				output = layers[layers.length - 1].neurons[j].value;
				expected = testSet.get(i).expectedOutput[0];
			}
		
			System.out.println("Output is: " + output + " expected: " + expected);
		}
	} 
*/
	
	/*	
	private static void mnistOutput(float percentToShow) {
		for (int i = 0; i < (float) testSet.size() * percentToShow; i++) {
			forward(testSet.get(i).data);
			
			int expected = 0;
			for(int j = 0; j < testSet.get(i).expectedOutput.length; j++) {
				if(testSet.get(i).expectedOutput[j] == 1f) {
					expected = j;
					break;
				}
			}
			
			int output = 0;
			float highest = layers[layers.length - 1].neurons[0].value;
			for(int j = 1; j < layers[layers.length - 1].neurons.length; j++) {
				Neuron currentOutput = layers[layers.length - 1].neurons[j];
				if(currentOutput.value > highest) {
					highest = currentOutput.value;
					output = j;
				}
			}
			
			System.out.println("Output is: " + output + " expected: " + expected + " at " + highest + "% certainty");
		}
	}
*/
}
