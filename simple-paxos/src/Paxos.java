/*
 * Author: Amirehsan Davoodi
 * Date: 25-12-2018
 *
 */

import agents.acceptor.Acceptor;
import agents.proposer.Proposer;
import agents.learner.Learner;

import config.*;

public class Paxos
{	final static String CLASS = "Paxos";

	public static void main(final String[] args) {
		if (args.length >= 3) {
//			String ip_port_config_path = args[0];
			String role = args[1].toString().toLowerCase();
			int id = Integer.parseInt( args[2].toString() );
			
			Config config = new Config();
			config.loadConfigFile(/*ip_port_config_path*/);
			
			if ( role.equals("client")  ) {
//				System.out.println("---- Client started with id="+ id + " ----");
				new Proposer(config, id, true /*readFromConsole*/);
			}

			if ( role.equals("proposer") ) {
//				System.out.println("---- proposer started with id="+ id + " ----");
				new Proposer(config, id, true);
			}

			if ( role.equals("acceptor") ) {
//				System.out.println("---- acceptor started with id="+ id + " ----");
				new Acceptor(config, id);
			}
			
			if ( role.equals("learner") ) {
//				System.out.println("---- learner started with id="+ id + " ----");
				new Learner(config, id, false /*VERBOSE*/);
			}

		} else {
			// print the error for (number of input argument)
		}

	}//main
}//class