package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Clearsounds device specifications for Android Compose previews.
 *
 * This extension provides Clearsounds device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Clearsounds.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Clearsounds: Any
  get() = object {
      /** Clearsounds CSTAAP8D */
      val CSTAAP8D = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
