package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SecQre device specifications for Android Compose previews.
 *
 * This extension provides SecQre device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SecQre.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SecQre: Any
  get() = object {
      /** SecQre SEI100 */
      val SEI100 = "spec:width=720,height=1280,unit=px,dpi=213"

  }
