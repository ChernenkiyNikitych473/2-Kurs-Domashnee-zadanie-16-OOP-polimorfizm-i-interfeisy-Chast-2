public abstract class TransportWithEngine extends Transport {
    public TransportWithEngine(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre () {
        System.out.println("Меняем покрышку, транспорт: " + getModelName());
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель, транспорт: " + getModelName());
    }

    public void checkTrailer(){
        System.out.println("Проверяем трейлер, транспорт: " + getModelName());
    }
    public void service() {
        super.service();
    }
}