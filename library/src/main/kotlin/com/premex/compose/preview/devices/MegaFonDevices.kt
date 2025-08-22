package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MegaFon device specifications for Android Compose previews.
 *
 * This extension provides MegaFon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MegaFon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MegaFon: Any
  get() = object {
      /** MegaFon MFLogin3T */
      val MFLOGIN3T = "spec:width=600,height=1024,unit=px,dpi=160"

  }
