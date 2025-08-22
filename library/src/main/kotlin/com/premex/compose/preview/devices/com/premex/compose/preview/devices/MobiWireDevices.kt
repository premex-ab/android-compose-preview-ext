package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MobiWire device specifications for Android Compose previews.
 *
 * This extension provides MobiWire device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MobiWire.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MobiWire: Any
  get() = object {
      /** DeviceSpec(manufacturer=MobiWire, code=Cygnus_mini, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MobiWire, code=Cygnus_mini,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val CYGNUS_MINI = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MobiWire, code=H5032U, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MobiWire, code=H5032U, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val H5032U = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=MobiWire, code=Halona, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MobiWire, code=Halona, width=320,
      height=480, dpi=160, isGoogleDevice=false).code */
      val HALONA = "spec:width=320,height=480,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MobiWire, code=Hotah, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MobiWire, code=Hotah, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val HOTAH = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MobiWire, code=IKOSORA_Plus, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MobiWire, code=IKOSORA_Plus,
      width=480, height=854, dpi=200, isGoogleDevice=false).code */
      val IKOSORA_PLUS = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=MobiWire, code=K5P_4G, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MobiWire, code=K5P_4G, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val K5P_4G = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MobiWire, code=Kicka_4_Plus, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MobiWire, code=Kicka_4_Plus,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val KICKA_4_PLUS = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MobiWire, code=Kicka_5, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MobiWire, code=Kicka_5, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val KICKA_5 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MobiWire, code=Kicka_5_Plus, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MobiWire, code=Kicka_5_Plus,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val KICKA_5_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MobiWire, code=Kicka_5_U, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MobiWire, code=Kicka_5_U,
      width=720, height=1600, dpi=300, isGoogleDevice=false).code */
      val KICKA_5_U = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=MobiWire, code=Kicka_Zoom, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MobiWire, code=Kicka_Zoom,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val KICKA_ZOOM = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MobiWire, code=MobiWire_Verda, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MobiWire, code=MobiWire_Verda,
      width=480, height=960, dpi=200, isGoogleDevice=false).code */
      val MOBIWIRE_VERDA = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=MobiWire, code=Smart_E11, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MobiWire, code=Smart_E11,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val SMART_E11 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MobiWire, code=Smart_N11, width=540, height=1132, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MobiWire, code=Smart_N11,
      width=540, height=1132, dpi=240, isGoogleDevice=false).code */
      val SMART_N11 = "spec:width=540,height=1132,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MobiWire, code=Smart_N12, width=444, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MobiWire, code=Smart_N12,
      width=444, height=960, dpi=200, isGoogleDevice=false).code */
      val SMART_N12 = "spec:width=444,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=MobiWire, code=Smart_P24, width=720, height=1560, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MobiWire, code=Smart_P24,
      width=720, height=1560, dpi=280, isGoogleDevice=false).code */
      val SMART_P24 = "spec:width=720,height=1560,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=MobiWire, code=Smart_T23, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MobiWire, code=Smart_T23,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val SMART_T23 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MobiWire, code=Smart_V22, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MobiWire, code=Smart_V22,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val SMART_V22 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MobiWire, code=Vodafone_Pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MobiWire, code=Vodafone_Pro,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val VODAFONE_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MobiWire, code=Vodafone_Smart, width=444, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MobiWire, code=Vodafone_Smart,
      width=444, height=960, dpi=200, isGoogleDevice=false).code */
      val VODAFONE_SMART = "spec:width=444,height=960,unit=px,dpi=200"

  }
