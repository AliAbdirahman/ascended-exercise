import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        String[] name = {"Morris Kim", "Hassan Mohamed", "Ariel Putra", "Ardelia Araminta", "Dhifan Fauzan"};
        String[] color = {"Violet", "Red", "Yellow", "Black", "Blue"};

        int[] index = new int[name.length];
        String[] NameLength = new String[name.length];
        String[] CloneName = name.clone();
        
                    Arrays.sort(CloneName);

                    for (int i = 0; i < name.length; i++) {
                        for (int j = 0; j < name.length; j++) {
                            if (name[j].equals(CloneName[i])) {
                                index[i] = j;
                            }
                        }
                    }

                    
                    for (int i = 0; i < index.length; i++) {
                        NameLength[i] = color[index[i]];
                    }

                    System.out.println("Sorted by Name:");
                    for (int i = 0; i < name.length; i++) {
                        System.out.printf("%-25s %-10s %n", CloneName[i], NameLength[i]);
                    }
                    System.out.println();
                    String[] copycolor = color.clone();
                    
                    Arrays.sort(copycolor);

                    
                    for (int i = 0; i < color.length; i++) {
                        for (int j = 0; j < color.length; j++) {
                            if (color[j].equals(copycolor[i])) {
                                index[i] = j;
                            }
                        }
                    }

                    
                    for (int i = 0; i < index.length; i++) {
                        NameLength[i] = name[index[i]];
                    }

                    System.out.println("Sorted by color:");
                    for (int i = 0; i < color.length; i++) {
                        System.out.printf("%-10s %-25s %n", copycolor[i], NameLength[i]);
                    }
                    System.out.println();
                }
                
    }

    

