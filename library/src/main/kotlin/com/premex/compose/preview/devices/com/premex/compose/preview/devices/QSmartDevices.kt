package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * QSmart device specifications for Android Compose previews.
 *
 * This extension provides QSmart device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.QSmart.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.QSmart: Any
  get() = object {
      /** DeviceSpec(manufacturer=QSmart, code=Blaze, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QSmart, code=Blaze, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val BLAZE = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=QSmart, code=GLi, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QSmart, code=GLi, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val GLI = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QSmart, code=GLi_2020, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QSmart, code=GLi_2020, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val GLI_2020 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QSmart, code=GLi_Lite, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QSmart, code=GLi_Lite, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val GLI_LITE = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QSmart, code=Hot_1, width=720, height=1480, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QSmart, code=Hot_1, width=720,
      height=1480, dpi=320, isGoogleDevice=false).code */
      val HOT_1 = "spec:width=720,height=1480,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QSmart, code=Hot_5, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QSmart, code=Hot_5, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val HOT_5 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QSmart, code=i10_2019, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QSmart, code=i10_2019, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val I10_2019 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QSmart, code=i10_2020, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QSmart, code=i10_2020, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val I10_2020 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QSmart, code=i4i, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QSmart, code=i4i, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val I4I = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QSmart, code=i7i_2020, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QSmart, code=i7i_2020, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val I7I_2020 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QSmart, code=LT950, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QSmart, code=LT950, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val LT950 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QSmart, code=MARK_2, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QSmart, code=MARK_2, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val MARK_2 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QSmart, code=Mark_5, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QSmart, code=Mark_5, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MARK_5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QSmart, code=QSmart_i5i_2019, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QSmart, code=QSmart_i5i_2019,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val QSMART_I5I_2019 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QSmart, code=QSmart_i6i_2020, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QSmart, code=QSmart_i6i_2020,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val QSMART_I6I_2020 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QSmart, code=QSmart_LT900, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QSmart, code=QSmart_LT900,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val QSMART_LT900 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QSmart, code=Rocket, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QSmart, code=Rocket, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val ROCKET = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QSmart, code=Rocket_Lite, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QSmart, code=Rocket_Lite,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val ROCKET_LITE = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QSmart, code=Rocket_Pro, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QSmart, code=Rocket_Pro, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val ROCKET_PRO = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QSmart, code=Smart_8, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QSmart, code=Smart_8, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val SMART_8 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QSmart, code=Smart_HD_Pro, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QSmart, code=Smart_HD_Pro,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val SMART_HD_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QSmart, code=Ultra, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QSmart, code=Ultra, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val ULTRA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QSmart, code=View, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QSmart, code=View, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val VIEW = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QSmart, code=View_Max, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QSmart, code=View_Max, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val VIEW_MAX = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=QSmart, code=View_Max_Pro, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QSmart, code=View_Max_Pro,
      width=720, height=1600, dpi=280, isGoogleDevice=false).code */
      val VIEW_MAX_PRO = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=QSmart, code=VIEW_PRO, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QSmart, code=VIEW_PRO, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val VIEW_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QSmart, code=X10, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QSmart, code=X10, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val X10 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QSmart, code=X20, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QSmart, code=X20, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val X20 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QSmart, code=X40, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QSmart, code=X40, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val X40 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
