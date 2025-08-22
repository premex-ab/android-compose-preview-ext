package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * COMPARTIR device specifications for Android Compose previews.
 *
 * This extension provides COMPARTIR device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.COMPARTIR.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.COMPARTIR: Any
  get() = object {
      /** DeviceSpec(manufacturer=COMPARTIR, code=M103H, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COMPARTIR, code=M103H, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M103H = "spec:width=800,height=1280,unit=px,dpi=160"

  }
