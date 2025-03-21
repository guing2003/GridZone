import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.guilhermedelecrode.gridzone.R
import com.guilhermedelecrode.gridzone.model.Piloto

class PilotoAdapter(private val listaPilotos: List<Piloto>) :
    RecyclerView.Adapter<PilotoAdapter.PilotoViewHolder>() {


    class PilotoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //val imgPiloto: ImageView = itemView.findViewById(R.id.imagem_piloto_fragment)
        val nomePiloto: TextView = itemView.findViewById(R.id.nome_piloto_fragment)
        val siglaPiloto: TextView = itemView.findViewById(R.id.sigla_piloto_fragment)
        val equipePiloto: TextView = itemView.findViewById(R.id.equipe_piloto_fragment)
        val numeroPiloto: TextView = itemView.findViewById(R.id.numero_piloto_fragment)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PilotoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.piloto_item_layout, parent, false)
        return PilotoViewHolder(view)
    }


    override fun onBindViewHolder(holder: PilotoViewHolder, position: Int) {
        val piloto = listaPilotos[position]
        //holder.imgPiloto.text =  // Define a imagem
        holder.nomePiloto.text = piloto.nome
        holder.siglaPiloto.text = piloto.sigla
        holder.equipePiloto.text = piloto.equipe
        holder.numeroPiloto.text = piloto.numero.toString()

    }


    override fun getItemCount() = listaPilotos.size
}
