package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ACD device specifications for Android Compose previews.
 *
 * This extension provides ACD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ACD.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ACD: Any
  get() = object {
      /** ACD ACD-Tab-10S */
      val ACD_TAB_10S = "spec:width=800,height=1280,unit=px,dpi=213"

  }
