package com.zlkj.ssm.shop.common.basic;

import static com.zlkj.ssm.shop.common.tools.TemplateModelUtils.converBoolean;
import static com.zlkj.ssm.shop.common.tools.TemplateModelUtils.converDate;
import static com.zlkj.ssm.shop.common.tools.TemplateModelUtils.converDouble;
import static com.zlkj.ssm.shop.common.tools.TemplateModelUtils.converInteger;
import static com.zlkj.ssm.shop.common.tools.TemplateModelUtils.converLong;
import static com.zlkj.ssm.shop.common.tools.TemplateModelUtils.converMap;
import static com.zlkj.ssm.shop.common.tools.TemplateModelUtils.converShort;
import static com.zlkj.ssm.shop.common.tools.TemplateModelUtils.converString;
import static com.zlkj.ssm.shop.common.tools.TemplateModelUtils.converStringArray;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import freemarker.template.TemplateHashModelEx;
import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModel;
import freemarker.template.TemplateModelException;

/**
 * 
 * BaseMethodEx FreeMarker自定义方法基类
 *
 */
public abstract class BaseMethodEx extends Base implements TemplateMethodModelEx {
    private String name;
    
    private static TemplateModel getModel(int index, List<TemplateModel> arguments) {
        if (notEmpty(arguments) && index < arguments.size()) {
            return arguments.get(index);
        }
        return null;
    }

    /**
     * @param index
     * @param arguments
     * @return
     * @throws TemplateModelException
     */
    public static TemplateHashModelEx getMap(int index, List<TemplateModel> arguments) throws TemplateModelException {
        return converMap(getModel(index, arguments));
    }

    /**
     * @param index
     * @param arguments
     * @return
     * @throws TemplateModelException
     */
    public static String getString(int index, List<TemplateModel> arguments) throws TemplateModelException {
        return converString(getModel(index, arguments));
    }

    /**
     * @param index
     * @param arguments
     * @return
     * @throws TemplateModelException
     */
    public static Integer getInteger(int index, List<TemplateModel> arguments) throws TemplateModelException {
        return converInteger(getModel(index, arguments));
    }

    /**
     * @param index
     * @param arguments
     * @return
     * @throws TemplateModelException
     */
    public static Short getShort(int index, List<TemplateModel> arguments) throws TemplateModelException {
        return converShort(getModel(index, arguments));
    }

    /**
     * @param index
     * @param arguments
     * @return
     * @throws TemplateModelException
     */
    public static Long getLong(int index, List<TemplateModel> arguments) throws TemplateModelException {
        return converLong(getModel(index, arguments));
    }

    /**
     * @param index
     * @param arguments
     * @return
     * @throws TemplateModelException
     */
    public static Double getDouble(int index, List<TemplateModel> arguments) throws TemplateModelException {
        return converDouble(getModel(index, arguments));
    }

    /**
     * @param index
     * @param arguments
     * @return
     * @throws TemplateModelException
     */
    public static String[] getStringArray(int index, List<TemplateModel> arguments) throws TemplateModelException {
        return converStringArray(getModel(index, arguments));
    }

    /**
     * @param index
     * @param arguments
     * @return
     * @throws TemplateModelException
     */
    public static Integer[] getIntegerArray(int index, List<TemplateModel> arguments) throws TemplateModelException {
        String[] arr = getStringArray(index, arguments);
        if (notEmpty(arr)) {
            Integer[] ids = new Integer[arr.length];
            int i = 0;
            for (String s : arr) {
                ids[i++] = Integer.valueOf(s);
            }
            return ids;
        }
        return null;
    }

    /**
     * @param index
     * @param arguments
     * @return
     * @throws TemplateModelException
     */
    public static Long[] getLongArray(int index, List<TemplateModel> arguments) throws TemplateModelException {
        String[] arr = getStringArray(index, arguments);
        if (notEmpty(arr)) {
            Long[] ids = new Long[arr.length];
            int i = 0;
            for (String s : arr) {
                ids[i++] = Long.valueOf(s);
            }
            return ids;
        }
        return null;
    }

    /**
     * @param index
     * @param arguments
     * @return
     * @throws TemplateModelException
     */
    public static Boolean getBoolean(int index, List<TemplateModel> arguments) throws TemplateModelException {
        return converBoolean(getModel(index, arguments));
    }

    /**
     * @param index
     * @param arguments
     * @return
     * @throws TemplateModelException
     * @throws ParseException
     */
    public static Date getDate(int index, List<TemplateModel> arguments) throws TemplateModelException, ParseException {
        return converDate(getModel(index, arguments));
    }

    /**
     * @return
     */
    public boolean httpEnabled() {
        return true;
    }
    
    /**
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}
