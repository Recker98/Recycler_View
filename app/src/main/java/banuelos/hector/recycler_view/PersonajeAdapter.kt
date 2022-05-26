package banuelos.hector.recycler_view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class PersonajeAdapter(private val personaje:List<Personajes>): RecyclerView.Adapter<PersonajeAdapter.PersonajeHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonajeHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PersonajeHolder(layoutInflater.inflate(R.layout.item_personajes,parent,false))
    }
    override fun getItemCount(): Int {
        return personaje.size
    }
    override fun onBindViewHolder(holder: PersonajeHolder, position: Int) {
        holder.render(personaje[position])
    }
    class PersonajeHolder(view:View):RecyclerView.ViewHolder(view) {
        val nombre=view.findViewById<TextView>(R.id.tvNombre)
        val serie = view.findViewById<TextView>(R.id.tvSerie)
        val photo = view.findViewById<ImageView>(R.id.ivPersonaje)
        fun render(personaje: Personajes) {
            nombre.text = personaje.NombrePersonaje
            serie.text = personaje.NombreSerie
        }

    }
}