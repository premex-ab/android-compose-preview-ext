package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * H819E device specifications for Android Compose previews.
 *
 * This extension provides H819E device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.H819e.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.H819e: Any
  get() = object {
      /** H819E MINTAKA */
      val MINTAKA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
