package ValkyrienWarfareBase.CoreMod;

import java.util.Map;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin.Name;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin.TransformerExclusions;

@Name("ValkyrianWarfareBase CoreMod")
@IFMLLoadingPlugin.SortingIndex(1000)
@TransformerExclusions({"ValkyrienWarfareBase"})
public class ValkyrienWarfarePlugin implements IFMLLoadingPlugin{

	public static Boolean isObfuscatedEnvironment = null;
	public static final String Path = "ValkyrienWarfareBase/CoreMod/CallRunner";
	
    @Override
    public String[] getASMTransformerClass() {
    	return new String[] {"ValkyrienWarfareBase.CoreMod.ValkyrienWarfareTransformer"};
    }

    @Override
    public String getModContainerClass(){
    	return null;
    }

    @Override
    public String getSetupClass(){
    	return null;
    }

    @Override
    public void injectData(Map<String, Object> data){
    	isObfuscatedEnvironment = (Boolean)data.get( "runtimeDeobfuscationEnabled" );
    }

    @Override
    public String getAccessTransformerClass(){
    	return "ValkyrienWarfareBase.CoreMod.ValkyrienWarfareAccessTransformer";
    }

}