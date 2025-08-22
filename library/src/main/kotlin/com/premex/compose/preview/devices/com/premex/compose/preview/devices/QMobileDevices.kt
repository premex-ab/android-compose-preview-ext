package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * QMobile device specifications for Android Compose previews.
 *
 * This extension provides QMobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.QMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.QMobile: Any
  get() = object {
      /** DeviceSpec(manufacturer=QMobile, code=BBL7551QM, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=BBL7551QM,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val BBL7551QM = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=QMobile, code=CBL7521QM, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=CBL7521QM, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CBL7521QM = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QMobile, code=CS1, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=CS1, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CS1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QMobile, code=CS1_Plus, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=CS1_Plus, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CS1_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QMobile, code=E2_Noir, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=E2_Noir, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val E2_NOIR = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QMobile, code=E3_Dual, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=E3_Dual, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val E3_DUAL = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QMobile, code=ENERGY_X1, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=ENERGY_X1, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val ENERGY_X1 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QMobile, code=ENERGY_X2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=ENERGY_X2, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ENERGY_X2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QMobile, code=Evok_Power_Lite, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=Evok_Power_Lite,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val EVOK_POWER_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QMobile, code=Fire, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=Fire, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val FIRE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QMobile, code=GBL7325QM, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=GBL7325QM, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val GBL7325QM = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QMobile, code=i2_POWER, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=i2_POWER, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val I2_POWER = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QMobile, code=i2_PRO, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=i2_PRO, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val I2_PRO = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QMobile, code=i5i_2018, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=i5i_2018, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val I5I_2018 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QMobile, code=i5_5, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=i5_5, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val I5_5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QMobile, code=i6_Metal_2017, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=i6_Metal_2017,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val I6_METAL_2017 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QMobile, code=i6_Metal_HD, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=i6_Metal_HD,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val I6_METAL_HD = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QMobile, code=i6_Metal_ONE, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=i6_Metal_ONE,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val I6_METAL_ONE = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QMobile, code=i6_Metal_ONE_new, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=i6_Metal_ONE_new,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val I6_METAL_ONE_NEW = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QMobile, code=i8i_2019, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=i8i_2019, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val I8I_2019 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QMobile, code=J1, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=J1, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val J1 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QMobile, code=J2, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=J2, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val J2 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QMobile, code=J5, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=J5, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val J5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QMobile, code=J7, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=J7, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val J7 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QMobile, code=J7_PRO, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=J7_PRO, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val J7_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QMobile, code=KING_KONG_MAX, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=KING_KONG_MAX,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val KING_KONG_MAX = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QMobile, code=LT100, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=LT100, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val LT100 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QMobile, code=LT360, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=LT360, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val LT360 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QMobile, code=LT700_PRO, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=LT700_PRO, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val LT700_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QMobile, code=LT750, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=LT750, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val LT750 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QMobile, code=LT900, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=LT900, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val LT900 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QMobile, code=M350_Pro, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=M350_Pro, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val M350_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QMobile, code=Noir_A1_lite, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=Noir_A1_lite,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val NOIR_A1_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QMobile, code=Noir_X1S, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=Noir_X1S, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val NOIR_X1S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QMobile, code=QMobileS6, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=QMobileS6, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val QMOBILES6 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QMobile, code=QMobile_Blue_5, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=QMobile_Blue_5,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val QMOBILE_BLUE_5 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QMobile, code=QMobile_Dual_One, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=QMobile_Dual_One,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val QMOBILE_DUAL_ONE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QMobile, code=QMobile_E1, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=QMobile_E1,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val QMOBILE_E1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QMobile, code=QMobile_Evok_Power, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=QMobile_Evok_Power,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val QMOBILE_EVOK_POWER = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QMobile, code=QMobile_HD_Plus, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=QMobile_HD_Plus,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val QMOBILE_HD_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QMobile, code=QMobile_i9i, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=QMobile_i9i,
      width=480, height=854, dpi=213, isGoogleDevice=false).code */
      val QMOBILE_I9I = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=QMobile, code=QMobile_LT500_PRO, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=QMobile_LT500_PRO,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val QMOBILE_LT500_PRO = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QMobile, code=QMobile_LT550, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=QMobile_LT550,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val QMOBILE_LT550 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QMobile, code=QMobile_Noir_A1, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=QMobile_Noir_A1,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val QMOBILE_NOIR_A1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=QMobile, code=QMobile_S4, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=QMobile_S4,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val QMOBILE_S4 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QMobile, code=QMobile_S6S, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=QMobile_S6S,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val QMOBILE_S6S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QMobile, code=QMobile_S6_PLUS, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=QMobile_S6_PLUS,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val QMOBILE_S6_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QMobile, code=QMobile_S8, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=QMobile_S8,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val QMOBILE_S8 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QMobile, code=QMobile_X33, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=QMobile_X33,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val QMOBILE_X33 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QMobile, code=QMobile_X36, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=QMobile_X36,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val QMOBILE_X36 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QMobile, code=QMobile_XLi, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=QMobile_XLi,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val QMOBILE_XLI = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QMobile, code=QTab_Y1, width=600, height=1024, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=QTab_Y1, width=600,
      height=1024, dpi=240, isGoogleDevice=false).code */
      val QTAB_Y1 = "spec:width=600,height=1024,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QMobile, code=QTab_Y2, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=QTab_Y2, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val QTAB_Y2 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QMobile, code=QTab_Y3, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=QTab_Y3, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val QTAB_Y3 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QMobile, code=Q_Infinity, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=Q_Infinity,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val Q_INFINITY = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QMobile, code=Q_Infinity_Cinema, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=Q_Infinity_Cinema,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val Q_INFINITY_CINEMA = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QMobile, code=Q_Infinity_D, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=Q_Infinity_D,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val Q_INFINITY_D = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QMobile, code=Q_Infinity_E, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=Q_Infinity_E,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val Q_INFINITY_E = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QMobile, code=Q_Infinity_E_Lite, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=Q_Infinity_E_Lite,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val Q_INFINITY_E_LITE = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QMobile, code=Q_Infinity_Prime, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=Q_Infinity_Prime,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val Q_INFINITY_PRIME = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QMobile, code=S1_PRO, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=S1_PRO, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val S1_PRO = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QMobile, code=S2_Pro, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=S2_Pro, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val S2_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QMobile, code=X32, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=X32, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val X32 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QMobile, code=X32_new, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=X32_new, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val X32_NEW = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QMobile, code=X32_Power, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=X32_Power, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val X32_POWER = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QMobile, code=X700_PRO, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=X700_PRO, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val X700_PRO = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QMobile, code=X700_PRO_II, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=X700_PRO_II,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val X700_PRO_II = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QMobile, code=X700_PRO_Lite, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=X700_PRO_Lite,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val X700_PRO_LITE = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QMobile, code=Z12_PRO, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=Z12_PRO, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val Z12_PRO = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=QMobile, code=Z14, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QMobile, code=Z14, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val Z14 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
