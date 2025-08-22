package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Noryox device specifications for Android Compose previews.
 *
 * This extension provides Noryox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Noryox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Noryox: Any
  get() = object {
      /** DeviceSpec(manufacturer=Noryox, code=Handheld-POS, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Noryox, code=Handheld-POS,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val HANDHELD_POS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Noryox, code=Handheld_POS, width=720, height=1440, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Noryox, code=Handheld_POS,
      width=720, height=1440, dpi=240, isGoogleDevice=false).code */
      val HANDHELD_POS = "spec:width=720,height=1440,unit=px,dpi=240"

  }
