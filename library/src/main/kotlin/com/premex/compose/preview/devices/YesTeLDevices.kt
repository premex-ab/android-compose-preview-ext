package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * YesTeL device specifications for Android Compose previews.
 *
 * This extension provides YesTeL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.YesTeL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.YesTeL: Any
  get() = object {
      /** YesTeL Note_30_pro */
      val NOTE_30_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

  }
