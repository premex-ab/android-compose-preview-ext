package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KUVA device specifications for Android Compose previews.
 *
 * This extension provides KUVA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KUVA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KUVA: Any
  get() = object {
      /** DeviceSpec(manufacturer=KUVA, code=Pad, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KUVA, code=Pad, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val PAD = "spec:width=800,height=1280,unit=px,dpi=160"

  }
