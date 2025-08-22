package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * covia device specifications for Android Compose previews.
 *
 * This extension provides covia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Covia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Covia: Any
  get() = object {
      /** covia CP-W5s */
      val CP_W5S = "spec:width=720,height=1280,unit=px,dpi=320"

  }
