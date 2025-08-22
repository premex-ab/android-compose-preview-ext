package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Ama-Mobile device specifications for Android Compose previews.
 *
 * This extension provides Ama-Mobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AmaMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AmaMobile: Any
  get() = object {
      /** Ama-Mobile AMAA703 */
      val AMAA703 = "spec:width=600,height=1024,unit=px,dpi=213"

  }
