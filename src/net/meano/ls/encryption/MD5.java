package net.meano.ls.encryption;

import net.meano.ls.util.EncryptionUtil;

public class MD5 implements Encryptor {

	@Override
	public boolean check(String check, String real) {
		check = EncryptionUtil.getMD5(check);
		return check.equals(real);
	}

	@Override
	public String hash(String value) {
		return EncryptionUtil.getMD5(value);
	}
}
