package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * true device specifications for Android Compose previews.
 *
 * This extension provides true device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.True.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.True: Any
  get() = object {
      /** DeviceSpec(manufacturer=true, code=S1, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=true, code=S1, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val S1 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=true, code=S1A, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=true, code=S1A, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val S1A = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=true, code=SMART_4G, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=true, code=SMART_4G, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val SMART_4G = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=true, code=SMART_4G_ADVENTURE, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=true, code=SMART_4G_ADVENTURE,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val SMART_4G_ADVENTURE = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=true, code=SMART_4G_GEN_C_5, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=true, code=SMART_4G_GEN_C_5,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val SMART_4G_GEN_C_5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=true, code=SMART_4G_GEN_C_5_5, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=true, code=SMART_4G_GEN_C_5_5,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val SMART_4G_GEN_C_5_5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=true, code=SMART_4G_P1, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=true, code=SMART_4G_P1, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val SMART_4G_P1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=true, code=SMART_4G_P1_PRIME, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=true, code=SMART_4G_P1_PRIME,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val SMART_4G_P1_PRIME = "spec:width=720,height=1440,unit=px,dpi=320"

  }
