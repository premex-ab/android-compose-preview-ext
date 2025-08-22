package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ANTEMPE device specifications for Android Compose previews.
 *
 * This extension provides ANTEMPE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ANTEMPE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ANTEMPE: Any
  get() = object {
      /** ANTEMPE D115_EEA */
      val D115_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
