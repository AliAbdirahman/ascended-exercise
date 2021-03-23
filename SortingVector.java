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
        int[] index = new int[nameVector.size()];

       
            System.out.println("Your choices:");
            System.out.println("(Press 1.) Vector");
            System.out.println("(Press 2.) ArrayList");
            System.out.println("(Press 3.) Sort ID");
            System.out.println("(Press 4.) Find ID ");

            System.out.print("Choose sorting option:-  ");
            int choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                // Vector
                case 1 -> {
                    System.out.println("Sorted vectors:");
                    
                            Vector<String> cloneName = new Vector<>(nameVector);

                            Collections.sort(cloneName);

                            for (int i = 0; i < nameVector.size(); i++) {
                                for (int j = 0; j < nameVector.size(); j++) {
                                    if (nameVector.get(j).equals(cloneName.get(i))) {
                                        index[i] = j;
                                    }
                                }
                            }
                            
                            Vector<String> updated = new Vector<>();

                            
                            for (int i = 0; i < index.length; i++) {
                                updated.add(i, ColorVector.get(index[i]));
                            }

                        

                            System.out.println("Sorted by Name:");
                            for (int i = 0; i < nameVector.size(); i++) {
                                System.out.printf("%-25s %-10s %n", cloneName.get(i), updated.get(i));
                            }
                            System.out.println();

                            Vector<String> cloneColor = new Vector<>(ColorVector);

                            Collections.sort(cloneColor);

                            for (int i = 0; i < ColorVector.size(); i++) {
                                for (int j = 0; j < ColorVector.size(); j++) {
                                    if (ColorVector.get(j).equals(cloneColor.get(i))) {
                                        index[i] = j;
                                    }
                                }
                            }


                            for (int i = 0; i < index.length; i++) {
                                updated.add(i, nameVector.get(index[i]));
                            }

                            System.out.println("Sorted by Color:");
                            for (int i = 0; i < ColorVector.size(); i++) {
                                System.out.printf("%-10s %-25s %n", cloneColor.get(i), updated.get(i));
                            }
                            System.out.println();
                        }
                        default -> System.out.println("Not an option! Try again.");
                    
                    
                            case 2 -> {
                                System.out.println("Sorted Array list:");
                                        ArrayList<String> cloneName = new ArrayList<>(nameArrayList);
            
                                        // Sort cloneName with Collections class method
                                        Collections.sort(cloneName);
            
                                        // Sort index according to sorted cloneName
                                        for (int i = 0; i < nameArrayList.size(); i++) {
                                            for (int j = 0; j < nameArrayList.size(); j++) {
                                                if (nameArrayList.get(j).equals(cloneName.get(i))) {
                                                    index[i] = j;
                                                }
                                            }
                                        }
            
                                        ArrayList<String> updated = new ArrayList<>();
            
                                        // Updating
                                        for (int i = 0; i < index.length; i++) {
                                            updated.add(i, ColorArrayList.get(index[i]));
                                        }
            
                                    
            
                                        System.out.println("Sorted by Name:");
                                        for (int i = 0; i < nameArrayList.size(); i++) {
                                            System.out.printf("%-25s %-10s %n", cloneName.get(i), updated.get(i));
                                        }
                                        System.out.println();
                                    
                                        ArrayList<String> cloneColor = new ArrayList<>(ColorArrayList);
            
                                        // Sort cloneColor with Collections class method
                                        Collections.sort(cloneColor);
            
                                        // Sort index according to sorted cloneColor
                                        for (int i = 0; i < ColorArrayList.size(); i++) {
                                            for (int j = 0; j < ColorArrayList.size(); j++) {
                                                if (ColorArrayList.get(j).equals(cloneColor.get(i))) {
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
                                            System.out.printf("%-10s %-25s %n", cloneColor.get(i), updated.get(i));
                                        }
                                        System.out.println();
                                    }
                            
                            case 3 -> {
                                System.out.println("Sorted IDs:");
                                Object[] clone = idVector.toArray();
            
                                // Convert from object[] to long[]
                                Long[] cloneLong = Arrays.copyOf(clone, clone.length, Long[].class);
            
                                // Sort with Arrays utility class
                                Arrays.sort(cloneLong);
            
                                System.out.println("Before sorting:");
                                for (Long aLong : idVector) {
                                    System.out.println(aLong);
                                
                            }
                                System.out.println();
            
                                System.out.println("After sorting:");
                                for (Long bLong : cloneLong) {
                                    System.out.println(bLong);
                                }
                                System.out.println();
                            }
                            case 4 -> {
                                Object[] clone = idVector.toArray();
            
                                // Convert from object[] to long[]
                                Long[] cloneLong = Arrays.copyOf(clone, clone.length, Long[].class);
            
                                System.out.print("Enter ID to check:- ");
                                long value = sc.nextLong();
            
                                int indexFound = -1;
            
                                for (int i = 0; i < cloneLong.length; i++) {
                                    if (value == cloneLong[i]) {
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
            