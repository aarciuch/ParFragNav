package art.tm.parfragnav

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavAction
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import art.tm.parfragnav.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentFirstBinding>(
            inflater,
            R.layout.fragment_first,
            container,
            false)

        binding.button1.setOnClickListener{ view: View ->
            //view.findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
            view.findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment()
                    .setLiczba((binding.edit1.text.toString()).toInt()))
        }

        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, requireView().findNavController())
               || super.onOptionsItemSelected(item)
    }
}