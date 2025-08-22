package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IRIS-OHYAMA device specifications for Android Compose previews.
 *
 * This extension provides IRIS-OHYAMA device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IRISOHYAMA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IRISOHYAMA: Any
  get() = object {
      /** IRIS-OHYAMA R4 */
      val R4 = "spec:width=720,height=1280,unit=px,dpi=213"

  }
