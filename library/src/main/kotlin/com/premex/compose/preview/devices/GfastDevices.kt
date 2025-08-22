package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Gfast device specifications for Android Compose previews.
 *
 * This extension provides Gfast device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Gfast.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Gfast: Any
  get() = object {
      /** Gfast MD_97_S464A */
      val MD_97_S464A = "spec:width=800,height=1280,unit=px,dpi=213"

  }
