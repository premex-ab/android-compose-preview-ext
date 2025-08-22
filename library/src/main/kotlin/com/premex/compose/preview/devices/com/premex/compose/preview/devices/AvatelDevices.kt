package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Avatel device specifications for Android Compose previews.
 *
 * This extension provides Avatel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Avatel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Avatel: Any
  get() = object {
      /** DeviceSpec(manufacturer=Avatel, code=DV8547-KSA, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Avatel, code=DV8547-KSA,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val DV8547_KSA = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
