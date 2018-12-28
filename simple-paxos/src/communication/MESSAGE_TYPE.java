/*
 * Author: Amirehsan Davoodi
 * Date: 25-12-2018
 *
 */

package communication;

public enum MESSAGE_TYPE {

	UNDEFINED,
	HEARTBEAT,
	
	PREPARE,
	PROMISE,

	ACCEPT,
	ACCEPTED,
	
	REJECT,
	
	RESEND,
	REQUEST_MAX_INSTANTS
}

