package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Emerson device specifications for Android Compose previews.
 *
 * This extension provides Emerson device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Emerson.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Emerson: Any
  get() = object {
      /** DeviceSpec(manufacturer=Emerson, code=EID-1400, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Emerson, code=EID-1400, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val EID_1400 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
