package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Hotpepper device specifications for Android Compose previews.
 *
 * This extension provides Hotpepper device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hotpepper.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hotpepper: Any
  get() = object {
      /** Hotpepper HPPL67A */
      val HPPL67A = "spec:width=720,height=1612,unit=px,dpi=280"

  }
