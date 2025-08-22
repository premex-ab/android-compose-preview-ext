package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HOT device specifications for Android Compose previews.
 *
 * This extension provides HOT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HOT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HOT: Any
  get() = object {
      /** DeviceSpec(manufacturer=HOT, code=DIW252_ALT_ME, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOT, code=DIW252_ALT_ME,
      width=2160, height=3840, dpi=320, isGoogleDevice=false).code */
      val DIW252_ALT_ME = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOT, code=DIW377_ALT_ME, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOT, code=DIW377_ALT_ME,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val DIW377_ALT_ME = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOT, code=DV8555-KIH, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOT, code=DV8555-KIH, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DV8555_KIH = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOT, code=VSB3918_ALT_ME, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOT, code=VSB3918_ALT_ME,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val VSB3918_ALT_ME = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
