package neural_network;
import java.util.ArrayList;

public class NeuralNetwork {
	
	// Layers
	static Layer[] layers; //Liste de Layers

	// Training data
	public static ArrayList<TrainingData> tDataSet; // Liste de TrainingData pour s'entra�ner (Chaque TrainingData du MNIST repr�sente un nombre)
	public static ArrayList<TrainingData> testSet;  // Liste de TrainingData pour tester
	
	/**
	 * Constructeur pour le r�seau de neurone
	 * @param nbLayers Le nombre de couche qu'on veut dans le r�seau
	 */
	public NeuralNetwork(int nbLayers) {
		
	}
	
	/**
	 * Cr�er un DataSet tr�s simple pour entra�ner notre r�seau
	 */
	public static void CreateSimpleTrainingData() {
		
	}

	/**
	 * Cr�er un DataSet tr�s simple pour tester notre r�seau
	 * @param nbTest Nombre de DataSets qu'on veut
	 */
	public static void CreateSimpleTestData(int nbTest) {
		
	}

	/**
	 * Activation du r�seau
	 * @param inputs Les donn�es d'entr�e pour cette activation
	 */
	public static void forward(float[] inputs) {
 	
	}

	/**
	 * L'id�e est qu'on calcule le gradient et on "m�morise" les nouveaux poids dans les neurones
	 * Quand TOUS les nouveaux poids ont �t� calcul�s, on actualise les poids dans les neurones
	 * Cela revient � faire:
	 * Calculer les poids de la couche de sortie, calculer les poinds des couches cach�es et ensuite on actualise les poids
	 * @param learning_rate Le rythme d'apprentissage
	 * @param tData L'ensemble de donn�e utilis�
	 */
	public static void backward(float learning_rate, TrainingData tData) {

	}

	/**
	 * Fonction qui fait la somme de tous les gradients qui connectent un neurone dans une couche
	 * @param n_index Index du neurone � �valuer
	 * @param l_index Index de la couche du neurone
	 * @return La somme des gradients en {@link Float}
	 */
	public static float sumGradient(int n_index, int l_index) {
		return 0;
	}

	/**
	 * Cette fonction est utilis�e pour entrainer le r�seau: Une passe forward() et une passe backward() 
	 * @param epoch Le nombre de fois qu'on veut entra�ner le r�seau
	 * @param learning_rate Le rythme d'apprentissage
	 * @param percentageOfDataSetToUse Portion de l'ensemble de donn�es � utiliser (Si pas assez de RAM)
	 */
	public static void train(int epoch, float learning_rate, float percentageOfDataSetToUse) {

	}

	/**
	 * Calcule le taux de notre r�seau pour les ensembles de donn�es simples
	 * @param margin La marge d'erreur entre la valeur du r�seau et celle attendue
	 * @return Le pourcentage de r�ussite du r�seau
	 */
	private static float evaluateOneOutputAccuracy(float margin) {
		return 0;
	}
	
	/**
	 * Calcule le taux du r�seau sur le MNIST
	 * @return Le pourcentage de r�ussite du r�seau
	 */
	private static float evaluateMNISTAccuracy() {
		return 0;
	}
	
	//ON LES R�ACTIVERA PLUS TARD
	
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
