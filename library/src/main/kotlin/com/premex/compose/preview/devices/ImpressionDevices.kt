package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Impression device specifications for Android Compose previews.
 *
 * This extension provides Impression device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Impression.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Impression: Any
  get() = object {
      /** Impression ImPAD_P101 */
      val IMPAD_P101 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
