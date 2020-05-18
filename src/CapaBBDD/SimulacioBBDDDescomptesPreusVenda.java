package CapaBBDD;

public class SimulacioBBDDDescomptesPreusVenda implements IServeisPersistenciaVenda {

    @Override
    public float getDescomptePercentatge(int diaSetmana) {
        //simulacio BBDD
        //diaSetmana 1 = diumenge , 2 = dilluns ... 
        switch (diaSetmana) {
            case 2:
            case 4:
            case 6:
                return 0.1f;
            case 3:
            case 5:
            case 7:
                return 0.05f;
            case 1:
                return 0.01f;
            default:
                return 0.0f;
        }
    }

    @Override
    public float[] getDescompteAbsolut() {
        //simulacio BBDD
        float descompte = 2.50f;
        float llinda = 8.00f;
        float[] retorn = new float[2];
        retorn[0] = descompte;
        retorn[1] = llinda;
        return retorn;
    }
}