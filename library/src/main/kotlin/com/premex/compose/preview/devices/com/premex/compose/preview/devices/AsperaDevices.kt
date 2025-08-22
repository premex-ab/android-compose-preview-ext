package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Aspera device specifications for Android Compose previews.
 *
 * This extension provides Aspera device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Aspera.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Aspera: Any
  get() = object {
      /** DeviceSpec(manufacturer=Aspera, code=A45_1, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Aspera, code=A45_1, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val A45_1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Aspera, code=AS5, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Aspera, code=AS5, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val AS5 = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Aspera, code=AS57, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Aspera, code=AS57, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val AS57 = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Aspera, code=AS6, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Aspera, code=AS6, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val AS6 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Aspera, code=AS7, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Aspera, code=AS7, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val AS7 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Aspera, code=AS8, width=720, height=1560, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Aspera, code=AS8, width=720,
      height=1560, dpi=280, isGoogleDevice=false).code */
      val AS8 = "spec:width=720,height=1560,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Aspera, code=AS9, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Aspera, code=AS9, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val AS9 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Aspera, code=Aspera_Nitro, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Aspera, code=Aspera_Nitro,
      width=480, height=960, dpi=200, isGoogleDevice=false).code */
      val ASPERA_NITRO = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Aspera, code=AS-10, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Aspera, code=AS-10, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val AS_10 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Aspera, code=Buzz, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Aspera, code=Buzz, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val BUZZ = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Aspera, code=CHAT, width=576, height=1152, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Aspera, code=CHAT, width=576,
      height=1152, dpi=220, isGoogleDevice=false).code */
      val CHAT = "spec:width=576,height=1152,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=Aspera, code=GEM, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Aspera, code=GEM, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val GEM = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Aspera, code=Jazz_2, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Aspera, code=Jazz_2, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val JAZZ_2 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Aspera, code=Nitro2, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Aspera, code=Nitro2, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val NITRO2 = "spec:width=720,height=1612,unit=px,dpi=320"

  }
