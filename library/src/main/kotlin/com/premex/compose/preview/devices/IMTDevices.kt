package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IMT device specifications for Android Compose previews.
 *
 * This extension provides IMT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IMT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IMT: Any
  get() = object {
      /** IMT GKL089 */
      val GKL089 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
