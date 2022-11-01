package SRC6;

public class Main {

    public static void main(String[] args) {
        
        //A
        Aluno[] aluno = new Aluno[10];
        for (int i = 0; i < 5; i++) {
            aluno[i] = new Aluno();
        }
        showEmpty(aluno);

    }

    //B
    public static Aluno[] insertAlunoFirstPossiblePosition(Aluno[] aluno, Aluno aluno1) {
        for (int i = 0; i < aluno.length; i++) {
            if (aluno[i] == null) {
                aluno[i] = aluno1;
                return aluno;
            }
        }
        return aluno;
    }

    //C
    public static Aluno[] removeAlunoByID(Aluno[] aluno, int matricula) {
        for (int i = 0; i < aluno.length; i++) {
            if (aluno[i].matricula == matricula) {
                aluno[i] = null;
                return aluno;
            }
        }
        return aluno;
    }

    //D
    public static Aluno[] showEmpty(Aluno[] aluno) {
        for (int i = 0; i < aluno.length; i++) {
            if (aluno[i] == null) {
                System.out.println("Posição " + i + " está sem matrícula");
            }
        }
        return aluno;
    }

    //E
    public static Aluno[] ifAlunoIsFullAddFiveLenght(Aluno[] aluno) {
        for (int i = 0; i < aluno.length; i++) {
            if (aluno[i] != null) {
                Aluno[] aluno1 = new Aluno[aluno.length + 5];
                for (int j = 0; j < aluno.length; j++) {
                    aluno1[j] = aluno[j];
                }
                return aluno1;
            }
        }
        return aluno;
    }

    //F
    public static Aluno[] insertAlunoInLastPosition(Aluno[] aluno, Aluno aluno1) {
        
        if(aluno[aluno.length-1] != null){
            Aluno[] aluno2 = new Aluno[aluno.length + 1];
            for (int i = 0; i < aluno.length; i++) {
                aluno2[i] = aluno[i];
            }
            aluno2[aluno2.length-1] = aluno1;
            return aluno2;
        } else {
            aluno[aluno.length-1] = aluno1;
            return aluno;
        }
        
    }

    //G
    public static Aluno[] insertAlunoInFirstPosition(Aluno[] aluno, Aluno aluno1) {
        if(aluno[0] != null){
            Aluno[] aluno2 = new Aluno[aluno.length + 1];
            for (int i = 0; i < aluno.length; i++) {
                aluno2[i+1] = aluno[i];
            }
            aluno2[0] = aluno1;
            return aluno2;
        } else {
            aluno[0] = aluno1;
            return aluno;
        }
    }
    
} 


