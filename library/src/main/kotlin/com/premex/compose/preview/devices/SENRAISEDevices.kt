package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SENRAISE device specifications for Android Compose previews.
 *
 * This extension provides SENRAISE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SENRAISE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SENRAISE: Any
  get() = object {
      /** SENRAISE H10 */
      val H10 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
