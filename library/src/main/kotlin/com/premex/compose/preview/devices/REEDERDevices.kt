package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * REEDER device specifications for Android Compose previews.
 *
 * This extension provides REEDER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.REEDER.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.REEDER: Any
  get() = object {
      /** REEDER M7Go_2019 */
      val M7GO_2019 = "spec:width=600,height=1024,unit=px,dpi=213"

  }
