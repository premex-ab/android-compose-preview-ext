package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Mobiwire device specifications for Android Compose previews.
 *
 * This extension provides Mobiwire device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mobiwire.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mobiwire: Any
  get() = object {
      /** DeviceSpec(manufacturer=Mobiwire, code=Edjromi, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobiwire, code=Edjromi, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val EDJROMI = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Mobiwire, code=Giyafa, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobiwire, code=Giyafa, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val GIYAFA = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Mobiwire, code=H5032U, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobiwire, code=H5032U, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val H5032U = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Mobiwire, code=H5111, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobiwire, code=H5111, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val H5111 = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Mobiwire, code=H5111L, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobiwire, code=H5111L, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val H5111L = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Mobiwire, code=H5111L_Mascom, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobiwire, code=H5111L_Mascom,
      width=480, height=854, dpi=200, isGoogleDevice=false).code */
      val H5111L_MASCOM = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Mobiwire, code=H5112, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobiwire, code=H5112, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val H5112 = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Mobiwire, code=H6681_Pro, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobiwire, code=H6681_Pro,
      width=720, height=1612, dpi=280, isGoogleDevice=false).code */
      val H6681_PRO = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Mobiwire, code=H6682, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobiwire, code=H6682, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val H6682 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Mobiwire, code=H67A1, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobiwire, code=H67A1, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val H67A1 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Mobiwire, code=K5P_4G_U, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobiwire, code=K5P_4G_U, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val K5P_4G_U = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobiwire, code=Kicka6, width=720, height=1480, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobiwire, code=Kicka6, width=720,
      height=1480, dpi=280, isGoogleDevice=false).code */
      val KICKA6 = "spec:width=720,height=1480,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Mobiwire, code=Smart_E25, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobiwire, code=Smart_E25,
      width=480, height=854, dpi=200, isGoogleDevice=false).code */
      val SMART_E25 = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Mobiwire, code=Smart_V25, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobiwire, code=Smart_V25,
      width=720, height=1612, dpi=280, isGoogleDevice=false).code */
      val SMART_V25 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Mobiwire, code=Verda, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobiwire, code=Verda, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val VERDA = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Mobiwire, code=V_Lite_2, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobiwire, code=V_Lite_2, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val V_LITE_2 = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Mobiwire, code=V_Pro_2, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobiwire, code=V_Pro_2, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val V_PRO_2 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Mobiwire, code=V_Smart_2, width=720, height=1560, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobiwire, code=V_Smart_2,
      width=720, height=1560, dpi=280, isGoogleDevice=false).code */
      val V_SMART_2 = "spec:width=720,height=1560,unit=px,dpi=280"

  }
