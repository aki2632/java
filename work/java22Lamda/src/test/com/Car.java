package test.com;

@FunctionalInterface
public interface Car {
    public void start();
    
    //람다식에서 사용되기위해서는 추상메소드가 1개만 허용
    //람다식에서사용하기위한 인터페이스(@FunctionalInterface)라는 선언이 필요하다.
    //public void start2();
}
