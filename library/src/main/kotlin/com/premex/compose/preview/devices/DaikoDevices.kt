package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DAIKO device specifications for Android Compose previews.
 *
 * This extension provides DAIKO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Daiko.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Daiko: Any
  get() = object {
      /** DAIKO OD0M_EA_T32 */
      val OD0M_EA_T32 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
