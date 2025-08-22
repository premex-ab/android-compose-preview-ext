package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * enova device specifications for Android Compose previews.
 *
 * This extension provides enova device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Enova.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Enova: Any
  get() = object {
      /** DeviceSpec(manufacturer=enova, code=N50, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=enova, code=N50, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val N50 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=enova, code=N51, width=720, height=1600, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=enova, code=N51, width=720,
      height=1600, dpi=480, isGoogleDevice=false).code */
      val N51 = "spec:width=720,height=1600,unit=px,dpi=480"

  }
