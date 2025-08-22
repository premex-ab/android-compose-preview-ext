package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SEI device specifications for Android Compose previews.
 *
 * This extension provides SEI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SEI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SEI: Any
  get() = object {
      /** DeviceSpec(manufacturer=SEI, code=ST4500, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SEI, code=ST4500, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val ST4500 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SEI, code=TT02, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SEI, code=TT02, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val TT02 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
