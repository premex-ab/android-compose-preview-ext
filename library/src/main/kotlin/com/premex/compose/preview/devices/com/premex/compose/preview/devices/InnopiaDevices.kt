package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Innopia device specifications for Android Compose previews.
 *
 * This extension provides Innopia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Innopia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Innopia: Any
  get() = object {
      /** DeviceSpec(manufacturer=Innopia, code=IMTM5000R, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Innopia, code=IMTM5000R,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val IMTM5000R = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
