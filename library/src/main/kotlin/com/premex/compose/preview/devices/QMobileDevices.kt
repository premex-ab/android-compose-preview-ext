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
      /** QMobile BBL7551QM */
      val BBL7551QM = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** QMobile CBL7521QM */
      val CBL7521QM = "spec:width=720,height=1280,unit=px,dpi=320"

      /** QMobile CS1 */
      val CS1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** QMobile CS1_Plus */
      val CS1_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** QMobile E2_Noir */
      val E2_NOIR = "spec:width=720,height=1280,unit=px,dpi=320"

      /** QMobile E3_Dual */
      val E3_DUAL = "spec:width=720,height=1280,unit=px,dpi=320"

      /** QMobile ENERGY_X1 */
      val ENERGY_X1 = "spec:width=480,height=854,unit=px,dpi=240"

      /** QMobile ENERGY_X2 */
      val ENERGY_X2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** QMobile Evok_Power_Lite */
      val EVOK_POWER_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** QMobile Fire */
      val FIRE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** QMobile GBL7325QM */
      val GBL7325QM = "spec:width=720,height=1280,unit=px,dpi=320"

      /** QMobile i2_POWER */
      val I2_POWER = "spec:width=480,height=854,unit=px,dpi=240"

      /** QMobile i2_PRO */
      val I2_PRO = "spec:width=480,height=854,unit=px,dpi=240"

      /** QMobile i5i_2018 */
      val I5I_2018 = "spec:width=480,height=854,unit=px,dpi=240"

      /** QMobile i5_5 */
      val I5_5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** QMobile i6_Metal_2017 */
      val I6_METAL_2017 = "spec:width=480,height=854,unit=px,dpi=240"

      /** QMobile i6_Metal_HD */
      val I6_METAL_HD = "spec:width=720,height=1280,unit=px,dpi=320"

      /** QMobile i6_Metal_ONE */
      val I6_METAL_ONE = "spec:width=480,height=854,unit=px,dpi=240"

      /** QMobile i6_Metal_ONE_new */
      val I6_METAL_ONE_NEW = "spec:width=480,height=854,unit=px,dpi=240"

      /** QMobile i8i_2019 */
      val I8I_2019 = "spec:width=480,height=960,unit=px,dpi=240"

      /** QMobile J1 */
      val J1 = "spec:width=480,height=854,unit=px,dpi=240"

      /** QMobile J2 */
      val J2 = "spec:width=480,height=854,unit=px,dpi=240"

      /** QMobile J5 */
      val J5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** QMobile J7 */
      val J7 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** QMobile J7_PRO */
      val J7_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** QMobile KING_KONG_MAX */
      val KING_KONG_MAX = "spec:width=720,height=1280,unit=px,dpi=320"

      /** QMobile LT100 */
      val LT100 = "spec:width=480,height=800,unit=px,dpi=240"

      /** QMobile LT360 */
      val LT360 = "spec:width=480,height=960,unit=px,dpi=240"

      /** QMobile LT700_PRO */
      val LT700_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** QMobile LT750 */
      val LT750 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** QMobile LT900 */
      val LT900 = "spec:width=480,height=960,unit=px,dpi=240"

      /** QMobile M350_Pro */
      val M350_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** QMobile Noir_A1_lite */
      val NOIR_A1_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** QMobile Noir_X1S */
      val NOIR_X1S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** QMobile QMobileS6 */
      val QMOBILES6 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** QMobile QMobile_Blue_5 */
      val QMOBILE_BLUE_5 = "spec:width=480,height=854,unit=px,dpi=240"

      /** QMobile QMobile_Dual_One */
      val QMOBILE_DUAL_ONE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** QMobile QMobile_E1 */
      val QMOBILE_E1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** QMobile QMobile_Evok_Power */
      val QMOBILE_EVOK_POWER = "spec:width=720,height=1280,unit=px,dpi=320"

      /** QMobile QMobile_HD_Plus */
      val QMOBILE_HD_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** QMobile QMobile_i9i */
      val QMOBILE_I9I = "spec:width=480,height=854,unit=px,dpi=213"

      /** QMobile QMobile_LT500_PRO */
      val QMOBILE_LT500_PRO = "spec:width=480,height=854,unit=px,dpi=240"

      /** QMobile QMobile_LT550 */
      val QMOBILE_LT550 = "spec:width=480,height=854,unit=px,dpi=240"

      /** QMobile QMobile_Noir_A1 */
      val QMOBILE_NOIR_A1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** QMobile QMobile_S4 */
      val QMOBILE_S4 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** QMobile QMobile_S6S */
      val QMOBILE_S6S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** QMobile QMobile_S6_PLUS */
      val QMOBILE_S6_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** QMobile QMobile_S8 */
      val QMOBILE_S8 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** QMobile QMobile_X33 */
      val QMOBILE_X33 = "spec:width=480,height=800,unit=px,dpi=240"

      /** QMobile QMobile_X36 */
      val QMOBILE_X36 = "spec:width=480,height=800,unit=px,dpi=240"

      /** QMobile QMobile_XLi */
      val QMOBILE_XLI = "spec:width=480,height=800,unit=px,dpi=240"

      /** QMobile QTab_Y1 */
      val QTAB_Y1 = "spec:width=600,height=1024,unit=px,dpi=240"

      /** QMobile QTab_Y2 */
      val QTAB_Y2 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** QMobile QTab_Y3 */
      val QTAB_Y3 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** QMobile Q_Infinity */
      val Q_INFINITY = "spec:width=720,height=1440,unit=px,dpi=320"

      /** QMobile Q_Infinity_Cinema */
      val Q_INFINITY_CINEMA = "spec:width=720,height=1440,unit=px,dpi=320"

      /** QMobile Q_Infinity_D */
      val Q_INFINITY_D = "spec:width=480,height=960,unit=px,dpi=240"

      /** QMobile Q_Infinity_E */
      val Q_INFINITY_E = "spec:width=480,height=960,unit=px,dpi=240"

      /** QMobile Q_Infinity_E_Lite */
      val Q_INFINITY_E_LITE = "spec:width=480,height=960,unit=px,dpi=240"

      /** QMobile Q_Infinity_Prime */
      val Q_INFINITY_PRIME = "spec:width=720,height=1440,unit=px,dpi=320"

      /** QMobile S1_PRO */
      val S1_PRO = "spec:width=480,height=854,unit=px,dpi=240"

      /** QMobile S2_Pro */
      val S2_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** QMobile X32 */
      val X32 = "spec:width=480,height=800,unit=px,dpi=240"

      /** QMobile X32_new */
      val X32_NEW = "spec:width=480,height=800,unit=px,dpi=240"

      /** QMobile X32_Power */
      val X32_POWER = "spec:width=480,height=800,unit=px,dpi=240"

      /** QMobile X700_PRO */
      val X700_PRO = "spec:width=480,height=854,unit=px,dpi=240"

      /** QMobile X700_PRO_II */
      val X700_PRO_II = "spec:width=480,height=854,unit=px,dpi=240"

      /** QMobile X700_PRO_Lite */
      val X700_PRO_LITE = "spec:width=480,height=854,unit=px,dpi=240"

      /** QMobile Z12_PRO */
      val Z12_PRO = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** QMobile Z14 */
      val Z14 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
