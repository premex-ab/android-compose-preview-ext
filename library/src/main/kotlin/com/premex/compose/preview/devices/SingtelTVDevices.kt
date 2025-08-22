package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Singtel_TV device specifications for Android Compose previews.
 *
 * This extension provides Singtel_TV device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SingtelTV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SingtelTV: Any
  get() = object {
      /** Singtel_TV f561 */
      val F561 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
