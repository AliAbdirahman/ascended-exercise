import java.util.*;

public class SortingVector {
    public static void main(String[] args) {
        
        Vector<Long> idVector = new Vector<>();
        Vector<String> nameVector = new Vector<>();
        Vector<String> ColorVector = new Vector<>();

        idVector.add(2440074174L);
        idVector.add(2440105785L);
        idVector.add(2440100273L);
        idVector.add(2440065163L);
        idVector.add(2440100336L);

        nameVector.add("Morris Kim");
        nameVector.add("Hassan Mohamed");
        nameVector.add("Ariel Putra");
        nameVector.add("Ardelia Araminta");
        nameVector.add("Dhifan Fauzan");

        ColorVector.add("Violet");
        ColorVector.add("Red");
        ColorVector.add("Yellow");
        ColorVector.add("Black");
        ColorVector.add("Blue");

       ArrayList<String> nameArrayList = new ArrayList<>(Arrays.asList("Morris Kim", "Raphael Reynaldi", "Ariel Putra", "Raffles Teh Weihan", "Monique Senjaya"));
        ArrayList<String> ColorArrayList = new ArrayList<>(Arrays.asList("Violet", "Red", "Yellow", "Green", "Blue"));

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int[] index = new int[nameVector.size()];

        while (flag) {
            System.out.println("Welcome to the sorting data exercise V2\n\nHere are your choices:");
            System.out.println("[1] Vector");
            System.out.println("[2] ArrayList");
            System.out.println("[3] Sort ID");
            System.out.println("[4] Find ID ");

            System.out.print("Enter your choice >> ");
            int choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                // For Vector
                case 1 -> {
                    System.out.println("You picked Vector!\n\nHere are the sorted vectors:");
                    
                            Vector<String> Cl0neName = new Vector<>(nameVector);

                            // Sort Cl0neName with Collections class method
                            Collections.sort(Cl0neName);

                            // Sort index according to sorted Cl0neName
                            for (int i = 0; i < nameVector.size(); i++) {
                                for (int j = 0; j < nameVector.size(); j++) {
                                    if (nameVector.get(j).equals(Cl0neName.get(i))) {
                                        index[i] = j;
                                    }
                                }
                            }
                            
                            Vector<String> updated = new Vector<>();

                            // Updating
                            for (int i = 0; i < index.length; i++) {
                                updated.add(i, ColorVector.get(index[i]));
                            }

                            System.out.println("Original data:");
                            for (int i = 0; i < nameVector.size(); i++) {
                                System.out.printf("%-25s %-10s %n", nameVector.get(i), ColorVector.get(i));
                            }
                            System.out.println();

                            System.out.println("Sorted by Name:");
                            for (int i = 0; i < nameVector.size(); i++) {
                                System.out.printf("%-25s %-10s %n", Cl0neName.get(i), updated.get(i));
                            }
                            System.out.println();

                            Vector<String> Cl0neColor = new Vector<>(ColorVector);

                            // Sort Cl0neColor with Collections class method
                            Collections.sort(Cl0neColor);

                            // Sort index according to sorted Cl0neColor
                            for (int i = 0; i < ColorVector.size(); i++) {
                                for (int j = 0; j < ColorVector.size(); j++) {
                                    if (ColorVector.get(j).equals(Cl0neColor.get(i))) {
                                        index[i] = j;
                                    }
                                }
                            }


                            // Updating
                            for (int i = 0; i < index.length; i++) {
                                updated.add(i, nameVector.get(index[i]));
                            }

                            System.out.println("Sorted by Color:");
                            for (int i = 0; i < ColorVector.size(); i++) {
                                System.out.printf("%-10s %-25s %n", Cl0neColor.get(i), updated.get(i));
                            }
                            System.out.println();
                        }
                        default -> System.out.println("Not a choice! Try again.");
                    
                    
                            case 2 -> {
                                System.out.println("You picked Vector!\n\nHere are the sorted Array list:");
                                        ArrayList<String> Cl0neName = new ArrayList<>(nameArrayList);
            
                                        // Sort Cl0neName with Collections class method
                                        Collections.sort(Cl0neName);
            
                                        // Sort index according to sorted Cl0neName
                                        for (int i = 0; i < nameArrayList.size(); i++) {
                                            for (int j = 0; j < nameArrayList.size(); j++) {
                                                if (nameArrayList.get(j).equals(Cl0neName.get(i))) {
                                                    index[i] = j;
                                                }
                                            }
                                        }
            
                                        ArrayList<String> updated = new ArrayList<>();
            
                                        // Updating
                                        for (int i = 0; i < index.length; i++) {
                                            updated.add(i, ColorArrayList.get(index[i]));
                                        }
            
                                        System.out.println("Original data:");
                                        for (int i = 0; i < nameArrayList.size(); i++) {
                                            System.out.printf("%-25s %-10s %n", nameArrayList.get(i), ColorArrayList.get(i));
                                        }
                                        System.out.println();
            
                                        System.out.println("Sorted by Name:");
                                        for (int i = 0; i < nameArrayList.size(); i++) {
                                            System.out.printf("%-25s %-10s %n", Cl0neName.get(i), updated.get(i));
                                        }
                                        System.out.println();
                                    
                                        ArrayList<String> Cl0neColor = new ArrayList<>(ColorArrayList);
            
                                        // Sort Cl0neColor with Collections class method
                                        Collections.sort(Cl0neColor);
            
                                        // Sort index according to sorted Cl0neColor
                                        for (int i = 0; i < ColorArrayList.size(); i++) {
                                            for (int j = 0; j < ColorArrayList.size(); j++) {
                                                if (ColorArrayList.get(j).equals(Cl0neColor.get(i))) {
                                                    index[i] = j;
                                                }
                                            }
                                        }
            
            
                                        // Updating
                                        for (int i = 0; i < index.length; i++) {
                                            updated.add(i, nameArrayList.get(index[i]));
                                        }
            
                                        System.out.println("Sorted by Color:");
                                        for (int i = 0; i < ColorArrayList.size(); i++) {
                                            System.out.printf("%-10s %-25s %n", Cl0neColor.get(i), updated.get(i));
                                        }
                                        System.out.println();
                                    }
                            
                            case 3 -> {
                                System.out.println("Here are the sorted IDs:");
                                Object[] Cl0ne = idVector.toArray();
            
                                // Convert from object[] to long[]
                                Long[] Cl0neLong = Arrays.copyOf(Cl0ne, Cl0ne.length, Long[].class);
            
                                // Sort with Arrays utility class
                                Arrays.sort(Cl0neLong);
            
                                System.out.println("Before sorting:");
                                for (Long aLong : idVector) {
                                    System.out.println(aLong);
                                
                            }
                                System.out.println();
            
                                System.out.println("After sorting:");
                                for (Long bLong : Cl0neLong) {
                                    System.out.println(bLong);
                                }
                                System.out.println();
                            }
                            case 4 -> {
                                Object[] Cl0ne = idVector.toArray();
            
                                // Convert from object[] to long[]
                                Long[] Cl0neLong = Arrays.copyOf(Cl0ne, Cl0ne.length, Long[].class);
            
                                System.out.print("Enter ID to check >> ");
                                long value = sc.nextLong();
            
                                int indexFound = -1;
            
                                for (int i = 0; i < Cl0neLong.length; i++) {
                                    if (value == Cl0neLong[i]) {
                                        indexFound = i;
                                        break;
                                    }
                                }
            
                                if (indexFound != -1) {
                                    System.out.println("ID found at index " + indexFound);
                                } else {
                                    System.out.println("ID is not in array. Returned index " + indexFound);
                                }
                                System.out.println();
                            }
                        }
                    }
                }
            }