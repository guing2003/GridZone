import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.guilhermedelecrode.gridzone.R
import com.guilhermedelecrode.gridzone.model.Equipe

class EquipeFragmentAdapter(private val listaEquipes: List<Equipe>) :
    RecyclerView.Adapter<EquipeFragmentAdapter.EquipeViewHolder>() {


    class EquipeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //val imgPiloto: ImageView = itemView.findViewById(R.id.imagem_piloto_fragment)
        val nomeEquipe: TextView = itemView.findViewById(R.id.nome_equipe_fragment)
        val motorEquipe: TextView = itemView.findViewById(R.id.motor_equipe_fragment)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EquipeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.equipe_item_layout, parent, false)
        return EquipeViewHolder(view)
    }


    override fun onBindViewHolder(holder: EquipeViewHolder, position: Int) {
        val equipe = listaEquipes[position]
        //holder.imgPiloto.text =  // Define a imagem
        holder.nomeEquipe.text = equipe.nome
        holder.motorEquipe.text = equipe.motor


    }


    override fun getItemCount() = listaEquipes.size
}
