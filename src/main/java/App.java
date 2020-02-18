
import DAO.EstadoDao;
import domain.Estado;

public class App {

    public static void main(String[] args) {
        EstadoDao estadoDao = new EstadoDao();
//        ModalityDAO modalityDAO = new ModalityDAO();
        estadoDao.save(new Estado("Rio de Janeiro", "RJ"));
//        modalityDAO.save(new Modality("Caminhada"));

//        TourTypeDAO tourTypeDAO = new TourTypeDAO();
//        TourType tourType = new TourType("Privativo");
//        tourTypeDAO.save(tourType);
//        List<Modality> modalities = modalityDAO.listarTodos();
//        for (Modality domain : modalities) {
//            System.out.println(domain.getId() + " / " + domain.getNome());
//        }

    }

}