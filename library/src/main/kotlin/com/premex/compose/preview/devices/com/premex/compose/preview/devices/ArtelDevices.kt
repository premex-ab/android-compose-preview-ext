package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Artel device specifications for Android Compose previews.
 *
 * This extension provides Artel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Artel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Artel: Any
  get() = object {
      /** DeviceSpec(manufacturer=Artel, code=ALO, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Artel, code=ALO, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val ALO = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Artel, code=Artel_Air, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Artel, code=Artel_Air, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val ARTEL_AIR = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Artel, code=Artel_Premium, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Artel, code=Artel_Premium,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val ARTEL_PREMIUM = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Artel, code=Artel_Quadro, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Artel, code=Artel_Quadro,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val ARTEL_QUADRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Artel, code=Artel_Quadro_Pro, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Artel, code=Artel_Quadro_Pro,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val ARTEL_QUADRO_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Artel, code=Artel_T10, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Artel, code=Artel_T10, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val ARTEL_T10 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Artel, code=Artel_Tesla, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Artel, code=Artel_Tesla,
      width=1080, height=2340, dpi=480, isGoogleDevice=false).code */
      val ARTEL_TESLA = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Artel, code=Artel_Tomchi, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Artel, code=Artel_Tomchi,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val ARTEL_TOMCHI = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Artel, code=GAPYOQ, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Artel, code=GAPYOQ, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val GAPYOQ = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Artel, code=GAP_YOQ, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Artel, code=GAP_YOQ, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val GAP_YOQ = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Artel, code=nagai, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Artel, code=nagai, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val NAGAI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Artel, code=SW4H, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Artel, code=SW4H, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SW4H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Artel, code=U3, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Artel, code=U3, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val U3 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Artel, code=U3_4G, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Artel, code=U3_4G, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val U3_4G = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Artel, code=U4, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Artel, code=U4, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val U4 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Artel, code=U5, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Artel, code=U5, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val U5 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
